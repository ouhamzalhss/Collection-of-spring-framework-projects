package com.ouhamza.demo;

import org.springframework.stereotype.Component;

@Component
public class BeanFortuneService implements FourtuneService {

	@Override
	public String getFortune() {
		// TODO Auto-generated method stub
		return "call getFortune method";
	}

}
