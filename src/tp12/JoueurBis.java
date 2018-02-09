package tp12;

import java.util.Random;

public class JoueurBis {
	private String nom;
	private int lancers;
	private int total;
	
	public JoueurBis(String nom) {
		this.nom = nom;
		this.lancers = 0;
		this.total = 20;
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
		this.total -= r.nextInt(6)+1;
		this.lancers += 1;
	}	
	/*
	 * Joueur j;

	
	public JoueurBis(Joueur j) {
		this.j = j;
		this.j.setTotal(20);
	}

	public String getNom() {
		return j.getNom();
	}

	public void setNom(String nom) {
		j.setNom(nom);
	}

	public int getLancers() {
		return j.getLancers();
	}

	public void setLancers(int lancers) {
		j.setLancers(lancers);
	}

	public int getTotal() {
		return j.getTotal();
	}

	public void setTotal(int total) {
		j.setTotal(total);
	}

	public void jouer() {
		Random r = new Random();
		this.j.setTotal(j.getTotal() - r.nextInt(6)+1);
		this.j.setLancers(j.getLancers() + 1);
	}*/
		
}
