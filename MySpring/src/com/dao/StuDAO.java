package com.dao;

import org.springframework.stereotype.Repository;

@Repository
public class StuDAO implements IStuDAO{
	
	public void addStu() {
		System.out.println("写入学员数据");
	}

}
