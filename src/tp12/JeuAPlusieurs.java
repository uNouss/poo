package tp12;

public class JeuAPlusieurs {
	private Joueur[] joueurs;

	public JeuAPlusieurs(int nbjoueurs) {
		this.joueurs = new Joueur[nbjoueurs];
		Saisie input = new Saisie();
		
		for(int idx = 0; idx < this.joueurs.length; idx++) {
			String nomJoueur = input.saisieChaine("Saisir le nom du joueur " + (idx+1));
			this.joueurs[idx] = new Joueur(nomJoueur);
		}
	}
	
	private Joueur[] gagnant() {
		int idxG = 0;
		// recherche de l'indice du plus petit lancers
		for(int idx = 0; idx < this.joueurs.length; idx++) {
			if(this.joueurs[idxG].getLancers() > this.joueurs[idx].getLancers()) {
				idxG = idx;
			} else if (this.joueurs[idxG].getLancers() == this.joueurs[idx].getLancers()) {
				if( this.joueurs[idxG].getTotal() < this.joueurs[idx].getTotal())
					idxG = idx;
			}
		}

		//recherche des gagnant avec le bon indice
		Joueur[] jgTmp  = new Joueur[this.joueurs.length];
		int idx = 0;
        for (Joueur joueur : this.joueurs) {
            if (this.joueurs[idxG].getLancers() == joueur.getLancers())
                jgTmp[idx++] = joueur;
        }
        Joueur[] jg = new Joueur[idx];
        for(int i = 0; i < jg.length; i++){
        	jg[i] = jgTmp[i];
        }
        return jg;
	}
	
	public static void main(String[] args) {
		final int TARGET = 20;
		boolean winner = false;
		
		Saisie input = new Saisie();
		
		int nbJoueurs;
		do {
			nbJoueurs = input.saisieEntier("saisir le nombre de joueur");
		}while (nbJoueurs < 0);
		
		JeuAPlusieurs jap = new JeuAPlusieurs(nbJoueurs);
		
		while(!winner) {
            for (int idx = 0; idx < jap.joueurs.length; idx++) {
                jap.joueurs[idx].jouer();
                winner = jap.joueurs[idx].getTotal() >= TARGET;
            }
        }
        for (Joueur joueur: jap.gagnant()) {
            System.out.println(joueur.toString());
        }
    }
	
}
