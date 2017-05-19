package com.sabel.entwurfsmuster.strategy.mit.bremsverhalten;

public class VBrake implements Bremsverhalten{

	@Override
	public void bremsen() {
		System.out.println("VBrake bremmst schlecht");
	}

}
