package tp72;

public class Canard extends Volaille {
    private static double PRIX_INITIAL = 1.2;
    private static double POIDS_MIN = 1.5;

    public Canard(int identite, double poids) {
        super(identite, poids);
    }

    @Override
    public String toString() {
        return "Canard"+ super.toString();
    }

    public double getPRIX_INITIAL() {
        return PRIX_INITIAL;
    }

    public double getPOIDS_MIN() {
        return POIDS_MIN;
    }

    public void setPrixInitial(double prixInitial) {
        PRIX_INITIAL = prixInitial;
    }

    public void setPoidsMin(double poidsMin) {
        POIDS_MIN = poidsMin;
    }
}
