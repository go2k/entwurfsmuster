package com.sabel.entwurfsmuster.strategy.ohne;

public abstract class Fahrzeug {
	
	private int anzahlRaeder;

	public Fahrzeug(int anzahlRaeder) {
		super();
		this.anzahlRaeder = anzahlRaeder;
	}

	public int getAnzahlRaeder() {
		return anzahlRaeder;
	}

	public void setAnzahlRaeder(int anzahlRaeder) {
		this.anzahlRaeder = anzahlRaeder;
	}

	public abstract void bremsen();

	public abstract void beschleunigen();

}
