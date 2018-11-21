package com.dao;

import org.springframework.stereotype.Repository;

@Repository("claDAO")
public class ClaDAO  implements IStuDAO{
	public void addStu() {
		System.out.println("写入班级数据");
	}
}
