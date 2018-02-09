package tp12;

import java.util.Random;

public class Joueur {
	private String nom;
	private int lancers;
	private int total;
	
	public Joueur(String nom) {
		this.nom = nom;
		this.lancers = 0;
		this.total = 0;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public int getLancers() {
		return lancers;
	}

	public void setLancers(int lancers) {
		this.lancers = lancers;
	}

	public int getTotal() {
		return total;
	}

	public void setTotal(int total) {
		this.total = total;
	}
	
	public void jouer() {
		Random r = new Random();
		this.total += r.nextInt(6)+1;
		this.lancers += 1;
	}
}
