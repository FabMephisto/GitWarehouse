package com.myaop;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class TransationManagerAOP {
	
	@Before("execution(* com.*.*.*(..))")
	public void theHead(){
		System.out.println("@ this's head");
	}
	
	@After("execution(* com.*.*.*(..))")
	public void theFeet(){
		System.out.println("@ this's feet");
	}
}
