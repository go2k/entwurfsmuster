package com.sabel.entwurfsmuster.strategy.mit;

public class Elektromotor implements Beschleunigungsverhalten {

	@Override
	public void beschleunigen() {
		System.out.println("Der eMotor beschleunigt sehr sehr gut");
	}

	
	
}
