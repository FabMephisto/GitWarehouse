package com.test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.servlet.StuServlet;

public class Test {
	public static void main(String[] args) {
		BeanFactory bf = new ClassPathXmlApplicationContext("beans.xml");
		StuServlet stuser = (StuServlet) bf.getBean("stuServlet");
		stuser.addStu();
	}
}
