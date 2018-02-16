package tp22;

import java.util.Random;

public class EssaiBingo {

	public static void main(String[] args) {
	    Random r = new Random();

		Joueur alice = new Joueur("Alice");
		Joueur bob = new Joueur("Bob");
		Joueur chloe = new Joueur("Chloé");

		alice.affiche();
		System.out.println();
		bob.affiche();
		System.out.println();
		chloe.affiche();
		System.out.println();

		do{
		    int n = r.nextInt(99)+1;
		    if(alice.coup(n) && alice.gagnant()){
                System.out.println("Alice a gagné");
                break;
            }
		    if(bob.coup(n) && bob.gagnant()){
                System.out.println("Bob a gagné");
                break;
            }
		    if(chloe.coup(n) && chloe.gagnant()){
                System.out.println("Chloé a gagné");
                break;
            }
        }while (true);
	}
}
