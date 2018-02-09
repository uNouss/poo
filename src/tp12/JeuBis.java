package tp12;

public class JeuBis {
	public static void main(String[] args) {
		JoueurBis jb = new JoueurBis("Alice");
		
		do {
			jb.jouer();
		}while( jb.getTotal() >=  0 );
		
		System.out.println("Il a fallu " + jb.getLancers()+ " lancers à " + jb.getNom() + " pour faire " + jb.getTotal());
	}
}
