package tp41;

import java.time.LocalDate;
import java.util.Random;

public class EssaiAgenda {

	public static void main(String[] args) {
		Agenda agenda = new Agenda();
		System.out.println(agenda);
		
		Random r = new Random();
		
		int nbEvent = r.nextInt(6)+5;
		
		
		for(int idx = 0; idx < nbEvent; idx++) {
			Evenement event = new Evenement("ABCDEFGHIJKLMNOPQRSTUVWXYZ".substring(r.nextInt(26)),
											"ABCDEFGHIJKLMNOPQRSTUVWXYZ".substring(r.nextInt(26)).toLowerCase(),
											LocalDate.of(r.nextInt(3000)+1000, r.nextInt(12)+1, LocalDate.now().getDayOfMonth()),
											LocalDate.now().plusDays(r.nextInt(1000)+1));
			agenda.ajoutEvt(event);
			//System.out.println(event);
		}
		
		System.out.println(agenda);

	}

}
