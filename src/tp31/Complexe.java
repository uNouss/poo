package tp31;

public class Complexe {
	private double r;
	private double i;

	public Complexe(double r, double i) {
		this.r = r;
		this.i = i;
	}

	public Complexe(double r) {
		this(r,0);
	}

	public Complexe() {
		this(0,0);
	}

	public double getR() {
		return r;
	}

	public void setR(double r) {
		this.r = r;
	}

	public double getI() {
		return i;
	}

	public void setI(double i) {
		this.i = i;
	}

	public String toString(){
		return this.i < 0 ? r + "" + i + "i": r + "+" + i +"i";
	}

	public Complexe somme(Complexe z){
		return new Complexe(this.r + z.r, this.i + z.i);
	}

	public Complexe produit(int k){
		return new Complexe(k*this.r , k*this.i);
	}

	public Complexe produit(Complexe z){
		return new Complexe(this.r*z.r - this.i*z.i, this.r*z.i + this.i*z.r);
	}

	public Complexe conjugue(){
		return new Complexe(this.r, -1*this.i);
	}

	public double module(){
		return Math.sqrt(this.getR()*this.getR() + this.getI()*this.getI());
	}

	public double argument(){
		return Math.atan(this.getI()/this.getR());
	}

	public static Complexe produit(Complexe z, int k){
		return z.produit(k);
	}

	public static Complexe somme(Complexe z1, Complexe z2){
		return z1.somme(z2);
	}
}
