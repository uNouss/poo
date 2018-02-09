package tp21;

import java.util.Random;

public class Grille {
	int[][] grille;
	int max;
	
	/**
	 * Genere une grille vide de y lignes et x colonnes
	 * @param y : nombre de lignes
	 * @param x : nombre de colonnes
	 */
	public Grille(int y, int x) {
		this.grille = new int[y][x];
		this.max = 0;
	}
	
	/**
	 * Remplie la grille avec des valeurs aléatoires comprises entre min et max
	 * @param min : répresente la valeur minimale 
	 * @param max : max la valeur maximale 
	 * @return si min inferieur ou egal max, le remplissage de la grille s'éffectue et retourne true et sinon false
	 */
	public boolean remplir(int min, int max) {
		if( min > max ) return false;
		Random r = new Random();
		for(int row = 0; row < grille.length; row++) {
			for(int col = 0; col < grille[row].length; col++) {
				int val = r.nextInt(max-min)+min;
				grille[row][col] = val;
				if( this.max < val) this.max = val;
			}
		}
		return true;
	}
	
	/**
	 * permet de gerer le formatage
	 * @param value
	 * @param padding
	 */
	private void printValue(int value, int padding) {
		System.out.print("|"+value);
		for(int i = (value+"").length(); i < padding; i++) {
			System.out.print(" ");
		}
	}
	
	/**
	 * affiche la grille avec un formatage
	 */
	public void affiche() {
		int frmt = (this.max+"").length();
		for(int row = 0; row < grille.length; row++) {
			for(int col = 0; col < grille[row].length; col++) {
				this.printValue(grille[row][col], frmt);
				//System.out.print("|"+String.format("%"+frmt+"s", grille[row][col]));
			}
			System.out.println("|");
		}
	}
	
	/**
	 * Affiche la grille dans une fenêtre avec des param left et top
	 * @param left position du bord gauche de l'écran
	 * @param top  position du bord haut de l'écran
	 */
	public void fenetre(int left, int top) {
		new Tableau(left, top, grille);
	}
}
