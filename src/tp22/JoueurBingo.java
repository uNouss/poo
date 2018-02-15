package tp22;

import tp21.Grille;

public class JoueurBingo {
	public String nom;
	public Grille maGrille;
	private int nbGood;
	
	public JoueurBingo(String nom) {
		this.nom = nom;
		this.maGrille = new Grille(3, 5);
		this.maGrille.remplir(1, 99, false, 1);
		this.nbGood = 0;
	}
	
	public boolean coup(int n) {
		for (int row = 0; row < maGrille.getGrille().length; row++) {
			for (int col = 0; col < maGrille.getGrille().length; col++) {
				if( maGrille.getGrille()[row][col] == n) {
					this.nbGood++;
					return true;
				}
			}
		}
		return false;
	}
	
	public boolean gagnant() {
		return nbGood == this.maGrille.getGrille().length*this.maGrille.getGrille()[0].length;
	}
	
	public void affiche() {
		this.maGrille.affiche();
	}
}
