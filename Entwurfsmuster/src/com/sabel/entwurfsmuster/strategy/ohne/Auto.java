package com.sabel.entwurfsmuster.strategy.ohne;

public class Auto extends Fahrzeug {

	private int anzahlPS;
	
	


	public Auto(int anzahlRaeder, int anzahlPS) {
		super(anzahlRaeder);
		this.anzahlPS = anzahlPS;
	}

	public void bremsen() {
		System.out.println("bremst");
	}

	public void beschleunigen() {
		if(anzahlPS > 150) {
			System.out.println("sehr gute beschleunigung");
		} else {
			System.out.println("gute beschleunigung");
		}
	}

	public int getAnzahlPS() {
		return anzahlPS;
	}

	public void setAnzahlPS(int anzahlPS) {
		this.anzahlPS = anzahlPS;
	}
	
}
