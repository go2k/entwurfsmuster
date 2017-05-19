package com.sabel.entwurfsmuster.strategy.mit;

import com.sabel.entwurfsmuster.strategy.mit.beschleunigungsverhalten.Benzinmotor;
import com.sabel.entwurfsmuster.strategy.mit.bremsverhalten.VBrake;

public class Motorrad extends Fahrzeug{

	public Motorrad() {
		super(2, new VBrake(), new Benzinmotor(106));
	}

}
