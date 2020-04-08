package com.ouhamza.demo;

import org.springframework.stereotype.Component;

@Component
public class SadFortuneService implements FourtuneService {

	@Override
	public String getFortune() {
		// TODO Auto-generated method stub
		return "today is a sad day";
	}

}
