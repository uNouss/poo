package tp31;

import java.util.Random;

public class EssaiCarte {

	public static void main(String[] args) {
		Carte[] j1 = new Carte[10];
		Carte[] j2 = new Carte[10];
		Random r = new Random();
		
		Couleur[] couleurs = Couleur.values();
		Rang[] rangs = Rang.values();
		
		int score1 = 0, score2 = 0;
		for(int idx = 0; idx < j1.length; idx++) {
			j1[idx] = new Carte(couleurs[r.nextInt(4)], rangs[r.nextInt(8)]);
			j2[idx] = new Carte(couleurs[r.nextInt(4)], rangs[r.nextInt(8)]);
		}
		for(int idx = 0; idx < j1.length; idx++) {
			System.out.println("carte "+idx+" j1 = "+j1[idx]+" et "+"carte "+idx+" j2 = "+j2[idx]);
			if ( j1[idx].compareTo(j2[idx]) < 0 ) { 
				score2 += 1;
			}else {
				score1 += 1;
			}
		}
		System.out.println("score j1 = " + score1);
		System.out.println("score j2 = " + score2);
	}
}
