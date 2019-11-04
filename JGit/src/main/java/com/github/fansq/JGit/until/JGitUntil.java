package com.github.fansq.JGit.until;

import java.io.File;
import java.io.IOException;

import org.eclipse.jgit.api.Git;
import org.eclipse.jgit.api.errors.GitAPIException;
import org.eclipse.jgit.internal.storage.file.FileRepository;
import org.eclipse.jgit.lib.ConfigConstants;
import org.eclipse.jgit.lib.Repository;
import org.eclipse.jgit.lib.RepositoryBuilder;
import org.eclipse.jgit.transport.UsernamePasswordCredentialsProvider;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class JGitUntil {

	   
	    private String localPath, localGitPath, remotePath;
	    private Repository localRepository;
	    private String username;
	    private String password;
	    private Git git;

	    public JGitUntil(String localPath, String remotePath,String username ,String password) {
	        this.username = username;
	        this.password = password;
	        this.localPath = localPath;
	        this.remotePath = remotePath;
	        this.localGitPath = this.localPath + "/.git";
	        try {
	            localRepository = new FileRepository(localGitPath);
	        } catch (IOException e) {
	            e.printStackTrace();
	        }
	        git = new Git(localRepository);

	    }
	    public JGitUntil() {
	    	super();
	    }

	    /**
	     * 创建本地仓库
	     *
	     * @throws IOException
	     */
	    public void createinit(String localGitPath) throws IOException, IllegalStateException, GitAPIException {
	    	File dir = new File(localGitPath);
	        //Git.init().setGitDir(dir).setDirectory(dir).call();
	        Git.init().setDirectory(dir).call();
	    	log.error("create success");
	    }
	    
	    /**
	     * git配置 例如配置邮箱  用户名 密码
	     */
	    public void configJGit() {
	    	
		    Repository build = null;
		    try {
		        build = new RepositoryBuilder().
		        		setGitDir(new File("D:\\source-code\\temp\\.git")).
		        		setMustExist(true)
		                .build();
		        build.getConfig().setString(ConfigConstants.CONFIG_USER_SECTION, null, ConfigConstants.CONFIG_KEY_NAME,
		                "xxxx");
		        build.getConfig().save();
		    } catch (IOException e) {
		        // TODO Auto-generated catch block
		        e.printStackTrace();
		    } finally {
		        if (null != build) {              //为了节省篇幅，后续代码省略调Git对象和Repository对象的close方法
		            build.close();
		        }
		    }
	    }

		/**
	     * clone克隆远程分支到本地
	     *
	     * @param branchName
	     * @throws GitAPIException
	     */
	    public void cloneBranch(String gitPath,String loPath,String branchName) throws GitAPIException {
	    	File file = new File(loPath);
			file.mkdir();  
	    	Git.cloneRepository()
	                .setURI(gitPath)
	                .setBranch(branchName)
	                .setDirectory(file).call();
	        log.info("clone success");
//	        Git.cloneRepository()
//	        .setURI(remotePath)
//	        .setBranch(branchName)
//	        .setDirectory(new File(localPath)).call();
//	        log.info("clone success");
	    }

	    /**
	     * pull远程代码  
	     *
	     * @param branchName 远程分支名称
	     * @throws Exception
	     */
	    public void pull(Git git,String branchName) throws Exception {
	        git.pull().setRemoteBranchName(branchName).call();
	        log.info("pull success");
	    }

	    /**
	     * 将单个文件加入Git
	     * @param fileName 添加文件名
	     * @throws Exception
	     */
	    public void add(String fileName) throws Exception {
	        File myFile = new File(localPath + fileName);
	        myFile.createNewFile();
	        git.add().addFilepattern(fileName).call();
	        log.info("add success");
	    }

	    /**
	     * 将增加的所有文件加入Git
	     *
	     * @throws Exception
	     */
	    public void addAll() throws Exception {
	        git.add().addFilepattern(".").call();
	        log.info("add success");
	    }


	    /**
	     * 提交文件
	     *
	     * @param message 提交备注
	     * @throws Exception
	     */
	    public void commit(String message) throws Exception {
	        git.commit().setMessage(message).call();
	        log.info("commit success");
	    }

	    /**
	     * 同步远程仓库
	     *
	     * @throws Exception
	     */
	    public void push() throws Exception {
	        git.push().setCredentialsProvider(new UsernamePasswordCredentialsProvider(this.username, this.password)).call();
	        log.info("push success");
	    }
	    
	    
	    
	    /**
	     * 没有搞懂这个方法是干什么的
	     */
//	    public void create(String localGitPath) throws IOException {
//	        Repository repository = new FileRepository(localGitPath);
//	        repository.create();
//	        log.info("create success");
//	    }
	}

