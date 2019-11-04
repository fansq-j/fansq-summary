import java.io.File;
import java.io.IOException;
import java.util.Set;

import org.eclipse.jgit.api.Git;
import org.eclipse.jgit.api.errors.GitAPIException;
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
	
	@Test
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
			Set<String> miss = git.status().call().getMissing();
			System.out.println(miss.size());
			for (String string : miss) {
				System.out.println("===================================="+string);
			}
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
