package com.sabel.entwurfsmuster.strategy.ohne;

public class Testklasse {

	public static void main(String[] args) {

		Fahrzeug fzg = new Auto(4, 180);
		
		fzg.beschleunigen();
		fzg.bremsen();
		
		fzg = new Auto(4, 75);
		fzg.beschleunigen();
		fzg.bremsen();
	
		fzg = new Fahrrad();
		fzg.beschleunigen();
		fzg.bremsen();
	}

}
