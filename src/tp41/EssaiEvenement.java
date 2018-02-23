package tp41;

import tp32.Saisie;

public class EssaiEvenement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Evenement event1 = new Evenement("vac", "Lille", Saisie.date(), Saisie.date());
		Evenement event2 = new Evenement("projet", "Lille", Saisie.date(), Saisie.date());
		
		System.out.println(event1);
		System.out.println(event2);
	}

}
