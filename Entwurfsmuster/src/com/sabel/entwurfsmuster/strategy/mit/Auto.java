package com.sabel.entwurfsmuster.strategy.mit;

import com.sabel.entwurfsmuster.strategy.mit.beschleunigungsverhalten.Benzinmotor;
import com.sabel.entwurfsmuster.strategy.mit.bremsverhalten.Scheibenbremse;

public class Auto extends Fahrzeug {
	
	

	public Auto(int ps) {
		
		super(4, new Scheibenbremse(), new Benzinmotor(ps));
	}
	
	

}
