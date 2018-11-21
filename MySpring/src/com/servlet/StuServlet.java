package com.servlet;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.dao.IStuDAO;

@Service
public class StuServlet {
	@Autowired
	@Qualifier("claDAO")
	IStuDAO adddao;
	
	public void setStudao(IStuDAO adddao) {
		this.adddao = adddao;
	}
	
	public void addStu(){
		System.out.println("添加学员");
		adddao.addStu();
	}

	/*public StuServlet(StuDAO studao) {
		super();
		this.studao = studao;
	}*/
}
