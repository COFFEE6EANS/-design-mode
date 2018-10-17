package com.zmj.design.mome;

import java.util.Date;

/**
 * 描述：需备份的数据
 * @author 张谋江
 * @version 1.0 2017年4月21日 
 * @since 1.0
 */
public class Data {
	private String title;
	private String content;
	private Date createDate;
	
	
	
	public Data(String title, String content, Date createDate) {
		super();
		this.title = title;
		this.content = content;
		this.createDate = createDate;
	}
	/**
	 * 创建备份的数据
	 * @return
	 */
	public BackupData createBackUp(){
		return new BackupData(this.title,this.content,this.createDate);
	}
	/**
	 * 恢复数据
	 * @param backupData
	 */
	public void rollBack(BackupData backupData){
		this.title = backupData.getTitle();
		this.content = backupData.getContent();
		this.createDate = backupData.getCreateDate();
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public Date getCreateDate() {
		return createDate;
	}
	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}
	@Override
	public String toString() {
		return "Data [title=" + title + ", content=" + content + ", createDate=" + createDate + "]";
	}
	
}
