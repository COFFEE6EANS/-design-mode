package com.zmj.design.mome;

import java.util.Date;

public class Main {
	public static void main(String[] args) {
		 /**场景介绍:引出备忘录模式**/
		Data data1 = new Data("Java从入门到精通", "java 继承、多态、封装 3大特性", new Date());
		//1.进行备份
		BackupData backupData = new BackupData(data1.getTitle(), data1.getContent(), data1.getCreateDate());
		//2.修改数据
		data1.setContent("新增加socket的经典系列讲解");
		//3.还原数据
		data1.setContent(backupData.getContent());
		data1.setCreateDate(backupData.getCreateDate());
		data1.setTitle(backupData.getTitle());
		
		/** 使用备忘录模式*/
		 Data data = new Data("Java从入门到精通", "java 继承、多态、封装 3大特性", new Date());
		 System.out.println("最初的数据: " + data);
		 ManageWork manage = new ManageWork();
		 //进行备份
		 manage.setBackupData(data.createBackUp());
		 //改数据
		 data.setContent("新增加socket的经典系列讲解");
		  System.out.println("改动之后的数据 "+data);
		  data.rollBack(manage.getBackupData());
		  System.out.println("还原备份之后的数据 " +data);
	}
}
