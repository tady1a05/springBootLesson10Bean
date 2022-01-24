package com.test.springboot;

import org.springframework.stereotype.Component;

public class SwimCoach implements Coach {
	private LuckA luckA;

	public LuckA getLuckA() {
		return luckA;
	}

	public void setLuckA(LuckA luckA) {
		this.luckA = luckA;
	}
	
	public SwimCoach(LuckA luckA) {
		this.luckA = luckA;
	}
	
	@Override
	public String doWorkout() {
		// TODO Auto-generated method stub
		return "Swim 100m";
	}
	
	@Override
	public String doLuck() {
		return luckA.doLucky();
	}

}
