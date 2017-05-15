package com.sabel.entwurfsmuster.singelton;

public class Controller {

	private  static Controller instance;
	
	private Controller() {
		
	}
	
	//Factory Methode
	public static Controller getInstance() {
		if (instance == null) {
			instance = new Controller();
		}
		return instance;
	}
	
}
