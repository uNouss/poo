package tp12;

public class JeuAPlusieurs {
	private Joueur[] joueurs;

	public JeuAPlusieurs(int nbjoueurs) {
		this.joueurs = new Joueur[nbjoueurs];
		Saisie input = new Saisie();
		
		for(int idx = 0; idx < this.joueurs.length; idx++) {
			String nomJoueur = input.saisieChaine("Saisir le nom d'un joueur");
			this.joueurs[idx] = new Joueur(nomJoueur);
		}
	}
	
	private void gagnant() {
		int idxG = 0;
		// recherche de l'indice du plus petit lancers
		for(int idx = 0; idx < this.joueurs.length; idx++) {
			System.out.println(this.joueurs[idx].getNom()+": lancers = "
								+ this.joueurs[idx].getLancers()+ " et total = "
								+ this.joueurs[idx].getTotal());
			if(this.joueurs[idxG].getLancers() > this.joueurs[idx].getLancers()) {
				idxG = idx;
			} else if (this.joueurs[idxG].getLancers() == this.joueurs[idx].getLancers()) {
				if( this.joueurs[idxG].getTotal() < this.joueurs[idx].getTotal())
					idxG = idx;
			}
		}

		//affichage des personnes qui ont ce meme indice
        for (Joueur joueur : this.joueurs) {
            if (this.joueurs[idxG].getLancers() == joueur.getLancers())
                System.out.println(joueur.getNom());
        }
	}
	
	public static void main(String[] args) {
		final int TARGET = 20;
		
		Saisie input = new Saisie();
		
		int nbJoueurs;
		do {
			nbJoueurs = input.saisieEntier("Saisir un entier");
		}while (nbJoueurs < 0);
		
		JeuAPlusieurs jap = new JeuAPlusieurs(nbJoueurs);
		
		for(int idx = 0; idx < jap.joueurs.length; idx++) {
			do {
				jap.joueurs[idx].jouer();
			}while(jap.joueurs[idx].getTotal() < TARGET );
		}
		jap.gagnant();
	}	
	
}
