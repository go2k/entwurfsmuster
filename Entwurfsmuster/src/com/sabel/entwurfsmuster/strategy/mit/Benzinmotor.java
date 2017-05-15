package com.sabel.entwurfsmuster.strategy.mit;

public class Benzinmotor implements Beschleunigungsverhalten {

	private int anzahlPS;
	
	public Benzinmotor(int anzahlPS) {
		super();
		this.anzahlPS = anzahlPS;
	}

	@Override
	public void beschleunigen() {
		if (anzahlPS > 150) {
			System.out.println("gutes bv");
		} else {
			System.out.println("schlechtes bv");
		}
	}
	
}
