package tp0;

public class HallOfFame {
	int[] scores = new int[] {0, 0, 0} ;
	String[] noms = new String[] { "", "", ""} ;
	/**
	 * Enregistre une partie (score + nom).
	 * Les valeurs renseignées sont insérées à leur position (par ordre décroissant de score).
	 * Un score plus bas que la dernière ligne du tableau ne modifiera rien.
	 * Un score plus haut que la première ligne décalera toutes les lignes (et éjectera
	 * la dernière ligne). Si deux parties ont exactement le même score, c'est la plus ancienne 
	 * qui sera placée avant l'autre.
	 * @param score Le score à enregistrer.
	 * @param nom Le nom à enregistrer. Plusieurs parties différentes peuvent porter le même nom).
	 */
	public void enregistrer(int score, String nom) {
		int tmpScore ;
		String tmpNom ;
		// Recherche la position où doit être inséré le score.
		int index = 0 ;
		while ((index < scores.length) && (score <= scores[index])) {
			index++ ;
		}
		// Pour chacune des lignes suivantes (et dans l'ordre), on permutte
		// la valeur courante et l'élément des tableaux scores et noms
		while (index < scores.length) {
			tmpScore = score ; score = scores[index] ; scores[index] = tmpScore ;
			tmpNom = nom ; nom = noms[index] ; noms[index] = tmpNom ;
			index++ ;
		}
	}
	/**
	 * Retourne la valeur du score de la ligne index.
	 * @param index La ligne désirée (0 à 3)
	 * @return le score
	 */
	public int lireScore(int index) {
		return scores[index] ;
	}
	
	/**
	 * Retourne la valeur du nom de la ligne index.
	 * @param index La ligne désirée (0 à 3)
	 * @return le nom
	 */
	public String lireNom(int index) {
		return noms[index] ;
	}
	
	public String toString(){
		String res = "";
		for(int i = 0; i < scores.length; i++){
			res += lireNom(i) + ":" + lireScore(i) + " ";
		}
		return res;
	}
	
    public static void main(String[] args) {
        HallOfFame hall = new HallOfFame() ;
        hall.enregistrer(20, "Alain");
        hall.enregistrer(20, "Bruno");
        hall.enregistrer(20, "Charles");
        hall.enregistrer(20, "Denis");

        System.out.println(hall);
        
        HallOfFame amateur = new HallOfFame() ;
        amateur.enregistrer(10, "Sel");
        amateur.enregistrer(4, "Poivre");
        amateur.enregistrer(3, "Cury");
        amateur.enregistrer(25, "Sucre");
        
        System.out.println(amateur);
        
        HallOfFame pro = new HallOfFame() ;
        pro.enregistrer(5, "Tomate");
        pro.enregistrer(11, "Patate");
        pro.enregistrer(9, "Pomme");
        pro.enregistrer(7, "Poire");
        
        System.out.println(pro);

      }
}