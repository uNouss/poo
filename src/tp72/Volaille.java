package tp72;

public abstract class Volaille {
    protected int identite;
    protected double poids;

    public Volaille(int identite, double poids) {
        this.identite = identite;
        this.poids = poids;
    }

    public int getIdentite() {
        return identite;
    }

    public void setIdentite(int identite) {
        this.identite = identite;
    }

    public double getPoids() {
        return poids;
    }

    public void setPoids(double poids) {
        this.poids = poids;
    }

    @Override
    public String toString() {
        return "[ identite = " + identite + ", poids = " + poids + "]";
    }

    public abstract double getPRIX_INITIAL();
    public abstract double getPOIDS_MIN();
    public abstract void setPrixInitial(double prixInitial);
    public abstract void setPoidsMin(double poidsMin);
}
