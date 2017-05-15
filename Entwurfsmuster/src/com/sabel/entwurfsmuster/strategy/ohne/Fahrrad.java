package com.sabel.entwurfsmuster.strategy.ohne;

public class Fahrrad extends Fahrzeug {

	public Fahrrad() {
		super(2);
	}
	
	@Override
	public void bremsen() {
		System.out.println("schlechte bremsen");

	}

	@Override
	public void beschleunigen() {
		System.out.println("schlechte beschleunigung");
	}

	
	
}
