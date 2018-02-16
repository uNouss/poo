package tp31;

public class Carte {
	private Couleur c;
	private Rang r;
	
	public Carte(Couleur c, Rang r) {
		this.c = c;
		this.r = r;
	}

	public Couleur getC() {
		return c;
	}

	public void setC(Couleur c) {
		this.c = c;
	}

	public Rang getR() {
		return r;
	}

	public void setR(Rang r) {
		this.r = r;
	}

	public String toString() {
		return this.r + " de " + this.c;
	}
	
	public boolean equals(Carte carte) {
		return this.c.ordinal() == carte.c.ordinal() 
				&& this.r.ordinal() == carte.r.ordinal();
	}
	
	public int compareTo(Carte carte) {
		return this.r.ordinal() - carte.r.ordinal();
	}
	
	public boolean precede(Carte carte) {
		return this.r.ordinal() < carte.r.ordinal()
				|| (this.r.ordinal() == carte.r.ordinal() && this.c.ordinal() < carte.c.ordinal());
	}	
}
