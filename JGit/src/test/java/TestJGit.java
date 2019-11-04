import java.io.File;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Set;

import org.eclipse.jgit.api.Git;
import org.eclipse.jgit.api.Status;
import org.eclipse.jgit.api.errors.GitAPIException;
import org.eclipse.jgit.api.errors.NoHeadException;
import org.eclipse.jgit.errors.IncorrectObjectTypeException;
import org.eclipse.jgit.errors.MissingObjectException;
import org.eclipse.jgit.errors.StopWalkException;
import org.eclipse.jgit.lib.PersonIdent;
import org.eclipse.jgit.revwalk.RevCommit;
import org.eclipse.jgit.revwalk.RevWalk;
import org.eclipse.jgit.revwalk.filter.RevFilter;
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
			git.commit().setMessage("范少卿测试提交").call();
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
	
	@Test
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
	public void pull() {
		try {
			Git git = Git.open(new File("D:\\source-code\\temp"));
			jGitUntil.pull(git,"master");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
