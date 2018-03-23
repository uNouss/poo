package tp71;

import java.time.LocalDate;

public class Livre extends Document{
    private final String editeur;
    private final int nbPage;

    public Livre(String cote, String auteur, String titre, LocalDate dateParution, String editeur, int nbPage) {
        super(cote, auteur, titre, dateParution);
        this.editeur = editeur;
        this.nbPage  = nbPage;
    }

    public String getEditeur() {
        return editeur;
    }

    public int getNbPage() {
        return nbPage;
    }

    @Override
    public String toString() {
        return super.toString()+
                "\tediteur          = " + editeur + "\n" +
                "\tnombre de page   = " + nbPage +"\n";
    }
}
