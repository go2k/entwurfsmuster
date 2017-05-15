package com.sabel.entwurfsmuster.singelton;

public class Testklasse {

	public static void main(String[] args) {
		
		Controller c =  Controller.getInstance();
		Controller c2 = Controller.getInstance();
		
		if ( c == c2) {
			System.out.println("Referenzen sind gleich");
		} else {
			System.out.println("Referenzen sind ungleich");
		}
	}

}
