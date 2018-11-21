package com.myaop;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.annotation.ClassPathBeanDefinitionScanner;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	public static void main(String[] args) {
	/*	ThisAop tp = new ThisAop();
		ISay sa =(ISay) tp.bind(new Say());
		sa.sayMyBody();
		sa.sayYourBody();
		sa.sayHisBody();
		sa.sayHerBody();*/
		BeanFactory bf = new ClassPathXmlApplicationContext("beans.xml");
		ISay sa = (ISay) bf.getBean("say");
		sa.sayMyBody();
		sa.sayYourBody();
		sa.sayHisBody();
		sa.sayHerBody();
	}
}
