import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.FutureTask;

import org.eclipse.jgit.api.CheckoutCommand;
import org.eclipse.jgit.api.CommitCommand;
import org.eclipse.jgit.api.Git;
import org.eclipse.jgit.api.MergeCommand;
import org.eclipse.jgit.api.MergeResult;
import org.eclipse.jgit.api.Status;
import org.eclipse.jgit.api.errors.GitAPIException;
import org.eclipse.jgit.api.errors.NoHeadException;
import org.eclipse.jgit.diff.DiffEntry;
import org.eclipse.jgit.diff.DiffEntry.ChangeType;
import org.eclipse.jgit.diff.DiffFormatter;
import org.eclipse.jgit.diff.Edit;
import org.eclipse.jgit.diff.EditList;
import org.eclipse.jgit.diff.RenameDetector;
import org.eclipse.jgit.errors.IncorrectObjectTypeException;
import org.eclipse.jgit.errors.MissingObjectException;
import org.eclipse.jgit.errors.StopWalkException;
import org.eclipse.jgit.internal.storage.file.FileRepository;
import org.eclipse.jgit.lib.ObjectId;
import org.eclipse.jgit.lib.ObjectLoader;
import org.eclipse.jgit.lib.ObjectReader;
import org.eclipse.jgit.lib.PersonIdent;
import org.eclipse.jgit.lib.Ref;
import org.eclipse.jgit.lib.Repository;
import org.eclipse.jgit.patch.FileHeader;
import org.eclipse.jgit.patch.HunkHeader;
//import org.eclipse.jgit.lib.Repository;
import org.eclipse.jgit.revwalk.RevCommit;
import org.eclipse.jgit.revwalk.RevTree;
import org.eclipse.jgit.revwalk.RevWalk;
import org.eclipse.jgit.revwalk.filter.RevFilter;
import org.eclipse.jgit.storage.file.FileRepositoryBuilder;
import org.eclipse.jgit.treewalk.CanonicalTreeParser;
import org.eclipse.jgit.treewalk.TreeWalk;
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
	
	//@Test
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
	
	/**
	 * git status 
	 *  查看状态
	 */
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
	/**
	 * 打印输出log
	 */
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
				System.out.println("版本号： "+commit.getName());
				System.out.println("提交SHA1：  " + commit.getId().name());
				System.out.println("提交信息：  " + commit.getShortMessage());
				System.out.println("提交时间：  " + format.format(authoIdent.getWhen()));
			});
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	/**
	 * 新建分支
	 */
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
	
	 /**
	  * 
	  * 切换分支
	  */
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
    /**
             * 拉取最新内容
     */
	//@Test
	public void pull() {
		try {
			Git git = Git.open(new File("D:\\source-code\\temp"));
			jGitUntil.pull(git,"master");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	/**
	 * 切换分支并更新代码
	 * @param repoDir
	 * @param branchName
	 */
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
	
	/**
	 * 合并分支
	 */
	//@Test
	public void mergeBranch() {
		  Git git;
		try {
			 git = Git.open(new File("D:\\\\source-git\\\\.git"));
			 CheckoutCommand coCmd = git.checkout(); 
			  //命令是api模块的一部分，其中包括类似git的调用
			  coCmd.setName("master"); 
			  coCmd.setCreateBranch(false); //可能不需要，只是为了确保
			  coCmd.call(); //切换到主”分支
			  
			  MergeCommand mgCmd = git.merge(); 
			  Repository repository = git.getRepository();
		      Ref ref = repository.findRef("TestJGit");
			  mgCmd.include(ref.getObjectId()); //foo”被认为是对分支的引用
			   MergeResult res = mgCmd.call(); //实际上做合并
			  
			  if(res.getMergeStatus().equals(MergeResult.MergeStatus.CONFLICTING)){
			  System.out.println(res.getConflicts().toString()); 
			  //告知用户他必须处理冲突
					 } 
		} catch (Exception e) {
			e.printStackTrace();
		}
	}  
	
	/**
	 * 返回指定分支 指定文件的内容 ，可以做成循环 然后比较同一个文件在
	 * 不同分支的差异
	 */
	//@Test
    public void  getContentWithFile(){
    	String gitRoot ="D:\\\\source-git\\\\.git";
    	String branchName="TestJGit";
    	String fileName="测试.txt";
        Git git;
		try {
			git = Git.open(new File(gitRoot));
			Repository repository = git.getRepository();
	        repository = git.getRepository();
	        RevWalk walk = new RevWalk(repository);
	        Ref ref = repository.getRefDatabase().getRef(branchName);
//	        if (ref == null) {
//	            //获取远程分支
//	            ref = repository.getRef(REF_REMOTES + branchName);
//	        }
	        //异步pull
	        ExecutorService executor = Executors.newCachedThreadPool();
	        FutureTask<Boolean> task = new FutureTask<Boolean>(new Callable<Boolean>() {
	            @Override
	            public Boolean call() throws Exception {
	                /*//创建分支
	                CreateBranchCommand createBranchCmd = git.branchCreate();
	                createBranchCmd.setStartPoint(REF_REMOTES + branchName).setName(branchName).call();*/
	                return git.pull().call().isSuccessful();
	            }
	        });
	        executor.execute(task);

	        ObjectId objId = ref.getObjectId();
	        RevCommit revCommit = walk.parseCommit(objId);
	        RevTree revTree = revCommit.getTree();

	        TreeWalk treeWalk = TreeWalk.forPath(repository, fileName, revTree);
	        //文件名错误
	        if (treeWalk == null)
	            System.out.println("文件名错误");

	        ObjectId blobId = treeWalk.getObjectId(0);
	        ObjectLoader loader = repository.open(blobId);
	        byte[] bytes = loader.getBytes();
	        if (bytes != null)
	        	System.out.println(new String(bytes));
		} catch (Exception e) {
			e.printStackTrace();
		}
        
    }
	
	/**
	 * 比较两个版本差异
	 * @param Child 8afe249dce75397afc57fc5bda9f4efcda5da1b0
	 * @param Parent 8f031ae5c8fed015ca6af3675f9b43cf0466a3ab
	 */
	@Test
	public void diffMethod(){
		String Child ="8afe249dce75397afc57fc5bda9f4efcda5da1b0" ;
		String Parent = "8f031ae5c8fed015ca6af3675f9b43cf0466a3ab";
		Git git;
		try {
			git=Git.open(new File("D:\\\\source-git\\\\.git"));
			Repository repository = git.getRepository();
			ObjectReader reader = repository.newObjectReader();
			CanonicalTreeParser oldTreeIter = new CanonicalTreeParser();
		
			try {
				ObjectId old = repository.resolve(Child + "^{tree}");
				ObjectId head = repository.resolve(Parent+"^{tree}");
						oldTreeIter.reset(reader, old);
				CanonicalTreeParser newTreeIter = new CanonicalTreeParser();
				newTreeIter.reset(reader, head);
				List<DiffEntry> diffs= git.diff()
	                    .setNewTree(newTreeIter)
	                    .setOldTree(oldTreeIter)
	                    .call();
				 ByteArrayOutputStream out = new ByteArrayOutputStream();
				    DiffFormatter df = new DiffFormatter(out);
				    df.setRepository(git.getRepository());
				
				for (DiffEntry diffEntry : diffs) {
					System.out.println(diffEntry);
					df.format(diffEntry);
					//System.out.println(out.toString());
					FileHeader file = df.toFileHeader(diffEntry);
//					List<HunkHeader> hunks = (List<HunkHeader>) file.getHunks();
//	                int addSize = 0;
//	                int subSize = 0;
//	                for(HunkHeader hunkHeader:hunks){
//	                	EditList editList = hunkHeader.toEditList();
//	                	for(Edit edit : editList){
//	                		edit.
////	                		subSize += edit.getEndA()-edit.getBeginA();
////	                		addSize += edit.getEndB()-edit.getBeginB();
//	                		
//	                	}
//	                }
					
					
					
//			         System.out.println("差异 ： "+file.getScriptText());
//			         System.out.println("buffer: "+new String(file.getBuffer()));
//			         System.out.println("score: "+file.getScore());
//			         System.out.println("att: "+file.getDiffAttribute());
//			         System.out.println("change: "+file.getChangeType());
//			         System.out.println("end: "+file.getEndOffset());
//			         System.out.println("newid: "+file.getNewId());
//			         System.out.println("newmo: "+file.getNewMode());
//			         System.out.println("old: "+file.getOldPath());
//			         String diffText = out.toString("UTF-8");
			         //System.out.println(diffText);
			       //  out.reset();
				}
				//System.out.println("收拾收拾2" + out.toString());
		} catch (IOException e1) {
			e1.printStackTrace();
		}
		
		} catch (IncorrectObjectTypeException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (GitAPIException e) {
			e.printStackTrace();
		}
	}

	/**
     * 回滚到指定版本的上一个版本
     * @param gitRoot git仓库目录
     * @param diffEntries 需要回滚的文件
     * @param revision 版本号
     * @param remark 备注
     * @return
     * @throws Exception
     */
    public static boolean rollBackPreRevision(String gitRoot, List<DiffEntry> diffEntries,
                                              String revision, String remark) throws Exception {
 
        if (diffEntries == null || diffEntries.size() == 0) {
            throw new Exception("没有需要回滚的文件");
        }
 
        Git git = Git.open(new File(gitRoot));
 
        List<String> files = new ArrayList<String>();
 
        //注意：下面的reset命令会将暂存区的内容恢复到指定（revesion）的状态，相当于取消add命令的操作
        /*Repository repository = git.getRepository();
        RevWalk walk = new RevWalk(repository);
        ObjectId objId = repository.resolve(revision);
        RevCommit revCommit = walk.parseCommit(objId);
        String preVision = revCommit.getParent(0).getName();
        ResetCommand resetCmd = git.reset();
        for (String file : files) {
            resetCmd.addPath(file);
        }
        resetCmd.setRef(preVision).call();
        repository.close();*/
 
        //取出需要回滚的文件，新增的文件不回滚
        for (DiffEntry diffEntry : diffEntries) {
            if (diffEntry.getChangeType() == ChangeType.DELETE) {
                continue;
            } else {
                files.add(diffEntry.getNewPath());
            }
        }
 
        if (files.size() == 0) {
            throw new Exception("没有需要回滚的文件");
        }
 
        //checkout操作会丢失工作区的数据，暂存区和工作区的数据会恢复到指定（revision）的版本内容
        CheckoutCommand checkoutCmd = git.checkout();
        for (String file : files) {
            checkoutCmd.addPath(file);
        }
        //加了“^”表示指定版本的前一个版本，如果没有上一版本，在命令行中会报错，例如：error: pathspec '4.vm' did not match any file(s) known to git.
        checkoutCmd.setStartPoint(revision + "^");
        checkoutCmd.call();
 
        //重新提交一次
        CommitCommand commitCmd = git.commit();
        for (String file : files) {
            commitCmd.setOnly(file);
        }
        commitCmd.setCommitter("yonge", "654166020@qq.com").setMessage(remark).call();
 
        return true;
    }
 
    /**
     * 获取上一版本的变更记录，如果是新增的文件，不会显示，因为做回滚时不需要回滚新增的文件
     * @param gitRoot git仓库目录
     * @param revision 版本号
     * @return
     * @throws Exception
     */
    public static List<DiffEntry> rollBackFile(String gitRoot, String revision) throws Exception {
 
        Git git = Git.open(new File(gitRoot));
        Repository repository = git.getRepository();
 
        ObjectId objId = repository.resolve(revision);
        Iterable<RevCommit> allCommitsLater = git.log().add(objId).call();
        Iterator<RevCommit> iter = allCommitsLater.iterator();
        RevCommit commit = iter.next();
        TreeWalk tw = new TreeWalk(repository);
        tw.addTree(commit.getTree());
        commit = iter.next();
        if (commit != null) {
            tw.addTree(commit.getTree());
        } else {
            throw new Exception("当前库只有一个版本，不能获取变更记录");
        }
 
        tw.setRecursive(true);
        RenameDetector rd = new RenameDetector(repository);
        rd.addAll(DiffEntry.scan(tw));
        List<DiffEntry> diffEntries = rd.compute();
        if (diffEntries == null || diffEntries.size() == 0) {
            return diffEntries;
        }
        Iterator<DiffEntry> iterator = new ArrayList<DiffEntry>(diffEntries).iterator();
        DiffEntry diffEntry = null;
        while (iterator.hasNext()) {
            diffEntry = iterator.next();
            System.out.println("newPath:" + diffEntry.getNewPath() + "    oldPath:"
                               + diffEntry.getOldPath() + "   changeType:"
                               + diffEntry.getChangeType());
            if (diffEntry.getChangeType() == ChangeType.DELETE) {
                iterator.remove();
            }
        }
        return diffEntries;
    }

}
