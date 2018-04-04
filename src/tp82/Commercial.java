package tp82;

import java.time.LocalDate;

public abstract class Commercial extends Employe{
    private double chiffreAffaire;
    private static double objectif;

    public Commercial(String nom, LocalDate dateEmbauche, double chiffreAffaire) {
        super(nom, dateEmbauche);
        this.chiffreAffaire = chiffreAffaire;
    }

    public static double getObjectif() {
        return objectif;
    }

    public static void setObjectif(double objectif) {
        Commercial.objectif = objectif;
    }

    public double getChiffreAffaire() {
        return chiffreAffaire;
    }

    public String getTitre(){
        return super.getTitre();
    }

    @Override
    public String toString() {
        return "chiffre d'affaire = " + chiffreAffaire + super.getTitre()+"\n";
    }

    public boolean satisfaitObjectif(){
        return this.getChiffreAffaire() >= Commercial.objectif;
    }
}
