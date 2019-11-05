import java.io.File;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.List;
import java.util.Set;

import org.eclipse.jgit.api.Git;
import org.eclipse.jgit.api.Status;
import org.eclipse.jgit.api.errors.GitAPIException;
import org.eclipse.jgit.api.errors.NoHeadException;
import org.eclipse.jgit.errors.IncorrectObjectTypeException;
import org.eclipse.jgit.errors.MissingObjectException;
import org.eclipse.jgit.errors.StopWalkException;
import org.eclipse.jgit.internal.storage.file.FileRepository;
import org.eclipse.jgit.lib.PersonIdent;
import org.eclipse.jgit.lib.Ref;
import org.eclipse.jgit.lib.Repository;
import org.eclipse.jgit.revwalk.RevCommit;
import org.eclipse.jgit.revwalk.RevWalk;
import org.eclipse.jgit.revwalk.filter.RevFilter;
import org.eclipse.jgit.storage.file.FileRepositoryBuilder;
import org.junit.Before;
import org.junit.Test;

import com.github.fansq.JGit.until.JGitUntil;

public class TestJGit {

	JGitUntil jGitUntil;
	@Before
	public void before() {
		 jGitUntil = new JGitUntil();
	}
	
	//@Test
	//public void createJGit() {
//		String s = "D:/jgit-project";
//		try {
//			jGitUntil.create(s);
//		} catch (IOException e) {
//			e.printStackTrace();
//		}
	//} 
	//@Test
	public void initJGit() {
		try {
			jGitUntil.createinit("D:\\\\source-code\\\\temp");
		} catch (IllegalStateException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (GitAPIException e) {
			e.printStackTrace();
		}
	}
	
	//@Test
	public void cloneGit() {
		
		String loPath ="D:/source-git";
		String gitPath ="D:\\source-code\\temp";
		String branchName ="master";
		try {
			jGitUntil.cloneBranch(gitPath, loPath, branchName);
		} catch (GitAPIException e) {
			e.printStackTrace();
		}
	}
	//@Test
	public void add() {
		try {
			Git git = Git.open(new File("D:\\source-git\\.git"));
			git.add().addFilepattern(".").call();
			System.out.println("add .");
			//jGitUntil.addAll();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	@Test
	public void commit() {
		try {
			Git git = Git.open(new File("D:\\source-git\\.git"));
			RevCommit s = git.commit().setMessage("范少卿测试提交1").call();
		    System.out.println(s);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	//@Test
	public void push() {
		try {
			Git git = Git.open(new File("D:\\source-git\\.git"));
			git.push().call();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	//@Test 
	public void status() {
		try {
			Git git = Git.open(new File("D:\\source-git\\.git"));
			Status status = git.status().call();
			System.out.println("Git Change: " + status.getChanged());
			System.out.println("Git Modified: " + status.getModified());
			System.out.println("Git UncommittedChanges: " + status.getUncommittedChanges());
			System.out.println("Git Untracked: " + status.getUntracked());
//			for (String string : miss) {
//				System.out.println("===================================="+string);
//			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	
	//@Test
	public void gitlog() {
		//提取某个作者的提交，并打印相关信息
		try {
			Git git = Git.open(new File("D:\\\\source-git\\\\.git"));
			DateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
			Iterable<RevCommit> results = git.log().setRevFilter(new RevFilter() {
				@Override
				public boolean include(RevWalk walker, RevCommit cmit)
						throws StopWalkException, MissingObjectException, IncorrectObjectTypeException, IOException {
					return true;
				}
				@Override
				public RevFilter clone() {
					return this;
				}
			}).call();
			results.forEach(commit -> {
				PersonIdent authoIdent = commit.getAuthorIdent();
				System.out.println("提交人：  " + authoIdent.getName() + "     <" + authoIdent.getEmailAddress() + ">");
				System.out.println("提交SHA1：  " + commit.getId().name());
				System.out.println("提交信息：  " + commit.getShortMessage());
				System.out.println("提交时间：  " + format.format(authoIdent.getWhen()));
			});
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	 //@Test
	 public void newBranch(){
		String branchName = "TestJGit";
        String newBranchIndex = "refs/heads/"+branchName;
        String gitPathURI = "";
        try {
            
            //检查新建的分支是否已经存在，如果存在则将已存在的分支强制删除并新建一个分支
        	Git git = Git.open(new File("D:\\\\source-git\\\\.git"));
            List<Ref> refs = git.branchList().call();
            for (Ref ref : refs) {
            	System.out.println(ref.getName());
                if (ref.getName().equals(newBranchIndex)) {
                    System.out.println("Removing branch before");
                    git.branchDelete().setBranchNames(branchName).setForce(true)
                            .call();
                    break;
                }
            }            
            //新建分支
            Ref ref = git.branchCreate().setName(branchName).call();
            //推送到远程
            git.push().add(ref).call();
        } catch (Exception e) {
            e.printStackTrace();
        }
//		//delete branch 'branchToDelete' locally
//		git.branchDelete().setBranchNames('refs/heads/branchToDelete').call();
//		 
//		//delete branch 'branchToDelete' on remote 'origin'
//		RefSpec refSpec = new RefSpec()
//		        .setSource(null)
//		        .setDestination("refs/heads/branchToDelete");
//		git.push().setRefSpecs(refSpec).setRemote('origin').call();
    }
	
	//@Test
    public void checkoutBranch(){
		String branchName = "TestJGit";
        Git git = null;
        try {
            git =Git.open(new File("D:\\\\source-git\\\\.git"));
            //setCreateBranch(true) 如果为true是创建分支并切换  为false是直接切换
            git.checkout().setCreateBranch(false).setName(branchName).call();
            git.pull().call();
            System.out.println("切换分支成功");
        }catch (Exception e){
            e.printStackTrace();
            System.out.println("切换分支失败");
        } finally{
            if (git != null) {
                git.close();
            }
        }   
    }
	//@Test
	public void pull() {
		try {
			Git git = Git.open(new File("D:\\source-code\\temp"));
			jGitUntil.pull(git,"master");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	 //@Test
	 public void checkoutAndPull(String repoDir, String branchName) {
	       try {
	           Repository existingRepo = new FileRepositoryBuilder().setGitDir(new File(repoDir)).build();
	           Git git = new Git(existingRepo);
	           try {
	               if (this.branchNameExist(git, branchName)) {//如果分支在本地已存在，直接checkout即可。
	                   git.checkout().setCreateBranch(false).setName(branchName).call();
	               } else {//如果分支在本地不存在，需要创建这个分支，并追踪到远程分支上面。
	                   git.checkout().setCreateBranch(true).setName(branchName).setStartPoint("origin/" + branchName).call();
	               }
	               git.pull().call();//拉取最新的提交
	           } finally {
	               git.close();
	           }
	       } catch (IOException | GitAPIException e) {
	           e.printStackTrace();
	       }
	   }
	
	 public boolean branchNameExist(Git git, String branchName) throws GitAPIException {
	       List<Ref> refs = git.branchList().call();
	       for (Ref ref : refs) {
	           if (ref.getName().contains(branchName)) {
	               return true;
	           }
	       }
	       return false;
	  }
	 
	
}
