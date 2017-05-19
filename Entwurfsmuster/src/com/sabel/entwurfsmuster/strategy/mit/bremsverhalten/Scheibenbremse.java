package com.sabel.entwurfsmuster.strategy.mit.bremsverhalten;

public class Scheibenbremse implements Bremsverhalten	{

	
	@Override
	public void bremsen() {
		System.out.println("Scheibenbremse bremst gut");
	}

}
