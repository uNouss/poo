package tp82;

import java.time.LocalDate;

public class Vendeur extends Commercial{
    private final static double COM_VEND = 0.20;
    private final static int BONUS_VEND = 400;

    public Vendeur(String nom, LocalDate dateEmbauche, double chiffreAffaire) {
        super(nom, dateEmbauche, chiffreAffaire);
    }

    @Override
    public double getSalaire() {
        return this.COM_VEND*this.getChiffreAffaire()+this.BONUS_VEND;
    }

    @Override
    public String getTitre() {
        return super.getTitre();
    }

    @Override
    public String toString() {
        return ", objectif = "+ Ouvrier.getObjectif()+ " "+super.toString();
    }
}
