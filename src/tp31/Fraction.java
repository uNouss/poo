package tp31;

public class Fraction {
	private int numerateur;
	private int denominateur;

	public Fraction(int numerateur, int denominateur) {
		this.numerateur = numerateur;
		this.denominateur = denominateur == 0 ? 1: denominateur;
	}
	
	public Fraction(int numerateur) {
		this(numerateur, 1);
	}
	
	public Fraction() {
		this(0, 1);
	}

	public String toString() {
		if( this.numerateur % this.denominateur == 0)
			return this.numerateur/this.denominateur+"";
		return this.numerateur + "/" + this.denominateur;
	}

	public int getNumerateur() {
		return this.numerateur;
	}

	public void setNumerateur(int numerateur) {
		this.numerateur = numerateur;
	}

	public int getDenominateur() {
		return this.denominateur;
	}

	public void setDenominateur(int denominateur) {
		this.denominateur = denominateur;
	}
	
	private boolean sontAuMemeDenominateur(Fraction f) {
		return this.denominateur == f.denominateur;
	}
	
	public int compareTo(Fraction f) {
		return this.numerateur*f.denominateur - f.numerateur*this.denominateur;
	}

	private void mettreAuMemeDenominateur(Fraction f) {
		this.setDenominateur(this.denominateur*f.denominateur);
		f.setDenominateur(this.denominateur*f.denominateur);
		this.setNumerateur(this.numerateur*f.denominateur);
		this.setNumerateur(f.numerateur*this.denominateur);
	}
	
	public Fraction addition(Fraction f) {
		if(!sontAuMemeDenominateur(f)) {
			this.mettreAuMemeDenominateur(f);
		}
		return new Fraction(this.numerateur+f.numerateur,
							this.denominateur+f.denominateur);
	}
	
	public Fraction addition(int n) {
		return addition(new Fraction(n, 1));
	}
	
	public Fraction multiplication(Fraction f) {
		return new Fraction(this.numerateur*f.numerateur,
							this.denominateur*f.denominateur);
	}
	
	public Fraction multiplication(int n) {
		return multiplication(new Fraction(n, 1));
	}
	
	public double fractionToDouble() {
		return this.numerateur*1.0/this.denominateur;
	}
}
