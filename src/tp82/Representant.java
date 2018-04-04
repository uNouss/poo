package tp82;

import java.time.LocalDate;

public class Representant extends Commercial {
    private final static double COM_REP = 0.20;
    private final static int BONUS_REP = 800;

    public Representant(String nom, LocalDate dateEmbauche, double chiffreAffaire) {
        super(nom, dateEmbauche, chiffreAffaire);
    }

    @Override
    public double getSalaire() {
        return this.COM_REP*this.getChiffreAffaire()+this.BONUS_REP;
    }

    @Override
    public String getTitre() {
        return super.getTitre();
    }

    @Override
    public String toString() {
        return "objectif = "+ Ouvrier.getObjectif()+" "+super.toString();
    }
}
