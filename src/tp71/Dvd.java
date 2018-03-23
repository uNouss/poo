package tp71;

import java.time.LocalDate;

public class Dvd extends Document{
    private final String producteur;
    private final int duree;

    public Dvd(String cote, String auteur, String titre, LocalDate dateParution, String producteur, int duree) {
        super(cote, auteur, titre, dateParution);
        this.producteur = producteur;
        this.duree = duree;
    }

    public String getProducteur() {
        return producteur;
    }

    public int getDuree() {
        return duree;
    }

    @Override
    public String toString() {
        return super.toString()+
                "\tproducteur       = " + producteur + "\n" +
                "\tduree            = " + duree +"\n";
    }
    @Override
    public int getDureeMax(){
        return 5;
    }
}
