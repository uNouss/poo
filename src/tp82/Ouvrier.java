package tp82;

import java.time.LocalDate;

public class Ouvrier extends Employe{
    private final static double FACTEUR_UNITE = 5.0;
    private int unite;
    private static int objectif;

    public Ouvrier(String nom, LocalDate dateEmbauche, int unite) {
        super(nom, dateEmbauche);
        this.unite = unite;
    }

    public static int getObjectif() {
        return objectif;
    }

    public static void setObjectif(int objectif) {
        Ouvrier.objectif = objectif;
    }

    @Override
    public double getSalaire() {
        return this.unite*FACTEUR_UNITE;
    }

    @Override
    public String toString() {
        return super.toString();
    }

    @Override
    public String getTitre() {
        return super.getTitre()+" unité = "+ this.unite + ", objectif = "+ Ouvrier.getObjectif();
    }

    public boolean satisfaitObjectif(){
        return this.unite >= Ouvrier.objectif;
    }
}
