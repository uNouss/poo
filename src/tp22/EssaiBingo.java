package tp22;

import java.util.Random;

public class EssaiBingo {

	public static void main(String[] args) {
	    Random r = new Random();

	    Joueur[] joueurs = new Joueur[]{
	            new Joueur("Alice"),
                new Joueur("Bob"),
                new Joueur("Chloé")
	    };
        for (Joueur joueur: joueurs) {
            joueur.affiche();System.out.println();
        }

        boolean isWinner = false;
		do {
            int n = r.nextInt(99) + 1;
            for (Joueur joueur : joueurs) {
                if (joueur.coup(n) && joueur.gagnant()) {
                    System.out.println(joueur.nom + " a gagné");
                    isWinner = true;
                    break;
                }
            }
        }while(!isWinner);
	}
}
