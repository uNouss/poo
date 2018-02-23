package tp41;

import java.time.LocalDate;

public class Evenement {
	private String intitule;
	private String lieu;
	private LocalDate deb;
	private LocalDate fin;
	
	public String getIntitule() {
		return intitule;
	}

	public String getLieu() {
		return lieu;
	}

	public LocalDate getDeb() {
		return deb;
	}

	public LocalDate getFin() {
		return fin;
	}

	public Evenement(String intitule, String lieu, LocalDate deb, LocalDate fin) {
		this.intitule = intitule;
		this.lieu = lieu;
		this.deb = deb;
		this.fin = fin;
		
		if( this.deb.isAfter(fin)) {
			this.fin = deb;
		}
	}

	public String toString() {
		return "Evenement [intitule=" + intitule + ", lieu=" + lieu + ", deb=" + deb + ", fin=" + fin + "]";
	}
	
	public boolean equals(Evenement event) {
		return this.intitule == event.intitule
				&& this.lieu == event.lieu
				&& this.deb.isEqual(event.deb)
				&& this.fin.isEqual(fin);
	}
	
	public boolean chevauche(Evenement event) {
		return ! (this.fin.isBefore(event.deb)
				|| event.fin.isBefore(this.deb));
	}
}
