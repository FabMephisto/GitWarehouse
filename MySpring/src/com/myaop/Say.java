package com.myaop;

import org.springframework.stereotype.Component;

@Component
public class Say implements ISay {

	@Override
	public void sayMyBody() {
		System.out.println("this's my body");		
	}

	@Override
	public void sayYourBody() {
		System.out.println("this's your body");				
	}

	@Override
	public void sayHisBody() {
		System.out.println("this's his body");				
	}

	@Override
	public void sayHerBody() {
		System.out.println("this's her body");				
	}

}
