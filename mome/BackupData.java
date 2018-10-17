package com.zmj.design.mome;

import java.util.Date;

/**
 * 描述： 备份
 * @author 张谋江
 * @version 1.0 2017年4月21日 
 * @since 1.0 
 */
public class BackupData {
	private String title;
	private String content;
	private Date createDate;
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
	public BackupData(String title, String content, Date createDate) {
		super();
		this.title = title;
		this.content = content;
		this.createDate = createDate;
	}
	
}
