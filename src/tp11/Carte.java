package tp11;
/**
 * 
 * @author sowy
 *
 */
public class Carte {
	int couleur;
	int rang;
	/**
	 * instancie un objet de type Carte avec une couleur et un rang donnés.
	 * @param color
	 * @param rang
	 */
	public Carte(int color, int rang) {
		this.couleur = color;
		this.rang = rang;
	}
	
	/**
	 * retourne la couleur de la carte courant
	 * @return couleur
	 */
	public int getCouleur() {
		return this.couleur;
	}
	
	/**
	 * retourne le rang de la carte courante
	 * @return rang : 
	 */
	public int getRang() {
		return this.rang;
	}
	
	/**
	 * Retourne <b>true</b> si les deux cartes sont identiques, <b>false</b> sinon
	 * @param c
	 * @return
	 */
	public boolean equals(Carte c) {
		return this.couleur == c.getCouleur()
				&& this.rang == c.getRang();
	}
	
	/**
	 * Compare le rang(puis la couleur en cas d'égalité), retourne <b>true</b> si la carte courante
	 * précède la carte passée en paramètre ou <b>false</b> sinon
	 * @param c
	 * @return
	 */
	public boolean precede(Carte c) {
		return this.rang < c.getRang()
				|| (this.rang == c.getRang() && this.couleur < c.getCouleur());
	}
	
	/**
	 * Retourne la carte sous la forme d'une chaîne: "7 de Trèfle".
	 */
	public String toString() {
		String res = "";
		switch(this.rang) {
			case 0: res += "7"; break; 
			case 1: res += "8"; break; 
			case 2: res += "9"; break; 
			case 3: res += "10"; break; 
			case 4: res += "Valet"; break; 
			case 5: res += "Dame"; break; 
			case 6: res += "Roi"; break; 
			case 7: res += "As"; break; 
		}
		res += " de ";
		switch(this.couleur) {
			case 0: res += "Trèfle"; break; 
			case 1: res += "Carreau"; break; 
			case 2: res += "Coeur"; break; 
			case 3: res += "Pique"; break;
		}
		return res;
	}

	/**
	 * <pre>Retourne: 0 si les deux cartes sont de même rang;
	 *			 &#60;0 si le rang est inférieur à celui de la carte passée en paramètre;
	 *			 &#62; si le rang est supérieur à celui de la carte passée en paramètre.</pre>
	 * @param c de type Carte
	 * @return
	 */
	public int compareRang(Carte c) {
		return this.rang - c.getRang();
	}
}
