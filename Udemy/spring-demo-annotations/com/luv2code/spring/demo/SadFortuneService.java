package com.luv2code.spring.demo;

public class SadFortuneService implements FortuneService {

	@Override
	public String getFortune() {
		return "Today is a sad day!";
	}

}
