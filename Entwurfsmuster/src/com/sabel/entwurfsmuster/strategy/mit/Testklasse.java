package com.sabel.entwurfsmuster.strategy.mit;

import com.sabel.entwurfsmuster.strategy.mit.beschleunigungsverhalten.Beschleunigungsverhalten;
import com.sabel.entwurfsmuster.strategy.mit.beschleunigungsverhalten.Elektromotor;
import com.sabel.entwurfsmuster.strategy.mit.bremsverhalten.Bremsverhalten;
import com.sabel.entwurfsmuster.strategy.mit.bremsverhalten.VBrake;

public class Testklasse {

	public static void main(String[] args) {
		
		Fahrzeug fz = new Auto(160);
		
		fz.beschleunigen();
		fz.bremsen();
		
		Beschleunigungsverhalten beschleunigungsverhalten = new Elektromotor();
		
		fz.setMotor(beschleunigungsverhalten);
		fz.beschleunigen();
		fz.bremsen();
		
		fz.setBremse(new VBrake());
		fz.bremsen();
		
		// Anonyme innere Klasse
		fz.setBremse(new Bremsverhalten() {
			
			@Override
			public void bremsen() {
				System.out.println("Trommelbremse bremst kacke");
			}
		});
		
		fz.bremsen();
		
	}
	
	

}
