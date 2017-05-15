package com.sabel.entwurfsmuster.strategy.mit;

public abstract  class Fahrzeug {
	
	private int anzahlRaeder;
	private Bremsverhalten bremse;
	private Beschleunigungsverhalten motor;
	
	public Fahrzeug(int anzahlRaeder, Bremsverhalten bremse, Beschleunigungsverhalten motor) {
		super();
		this.anzahlRaeder = anzahlRaeder;
		this.bremse = bremse;
		this.motor = motor;
	}

	public int getAnzahlRaeder() {
		return anzahlRaeder;
	}

	public void setAnzahlRaeder(int anzahlRaeder) {
		this.anzahlRaeder = anzahlRaeder;
	}

	public Bremsverhalten getBremse() {
		return bremse;
	}

	public void setBremse(Bremsverhalten bremse) {
		this.bremse = bremse;
	}

	public Beschleunigungsverhalten getMotor() {
		return motor;
	}

	public void setMotor(Beschleunigungsverhalten motor) {
		this.motor = motor;
	}
	
	public void bremsen() {
		bremse.bremsen();
	}
	
	public void beschleunigen() {
		motor.beschleunigen();
	}
	
	
}
