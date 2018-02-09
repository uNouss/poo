package tp12;

public class JeuADeux {
	Joueur j1;
	Joueur j2;
	public JeuADeux(Joueur j1, Joueur j2) {
		this.j1 = j1;
		this.j2 = j2;
	}

	public void gagnant() {
		System.out.println(this.j1.getNom()+": lancers = " + this.j1.getLancers()+ " et total = "+ this.j1.getTotal());
		System.out.println(this.j2.getNom()+": lancers = " + this.j2.getLancers()+ " et total = "+ this.j2.getTotal());
		if(this.j1.getLancers() < this.j2.getLancers()) {
			System.out.println(this.j1.getNom());
		}
		else if (this.j1.getLancers() > this.j2.getLancers()) {
			System.out.println(this.j2.getNom());
		}
		else {
			if(this.j1.getTotal() < this.j2.getTotal()) {
				System.out.println(this.j2.getNom());
			}
			else {
				System.out.println(this.j1.getNom());
			}
		}
	}
	
	public static void main(String[] args) {
		final int TARGET = 20;
		
		JeuADeux jad = new JeuADeux(new Joueur("Joueur 1"), new Joueur("Joueur 2"));
		
		do {
			jad.j1.jouer();
		}while(jad.j1.getTotal() < TARGET );
		
		do {
			jad.j2.jouer();
		}while(jad.j2.getTotal() < TARGET);
		
		jad.gagnant();
	}
}
