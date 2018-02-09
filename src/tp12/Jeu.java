package tp12;

public class Jeu {
	public static void main(String[] args) {
		final int TARGET = 20;
		
		Joueur j = new Joueur("Alice");
		
		do {
			j.jouer();
		}while( j.getTotal() < TARGET );
		
		System.out.println("Il a fallu " + j.getLancers()+ " lancers à " + j.getNom() + " pour faire " + j.getTotal());
	}
}
