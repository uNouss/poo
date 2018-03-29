package tp72;

public class Poulet extends Volaille{
    private static double PRIX_INITIAL = 1.0;
    private static double POIDS_MIN = 1.2;

    public Poulet(int identite, double poids) {
        super(identite, poids);
    }

    @Override
    public String toString() {
        return "Poulet : "+ super.toString() +
                ": PRIX_INITIAL = " + PRIX_INITIAL +
                ", POIDS_MIN    = " + POIDS_MIN +
                "\n";
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
