package coo.tp10.terrain;

public class Coordonnees {
    private int abscisse;
    private int ordonne;

    public Coordonnees(int abscisse, int ordonne) {
        this.abscisse = abscisse;
        this.ordonne = ordonne;
    }

    public int getAbscisse() {
        return abscisse;
    }

    public int getOrdonne() {
        return ordonne;
    }

    public Coordonnees modifier(Coordonnees coord){
        return new Coordonnees(this.getAbscisse()+coord.getAbscisse(), this.getOrdonne()+coord.getOrdonne());
    }

    @Override
    public String toString() {
        return "(" + abscisse + "; " + ordonne + ")";
    }
}
