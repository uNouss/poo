package tp71;

import java.time.LocalDate;
import java.util.Objects;

public class Document {
    private final String cote;
    private final String auteur;
    private final String titre;
    private final LocalDate dateParution;
    private int emprunteur;
    private LocalDate dateEmprunt;

    public Document(String cote, String auteur, String titre, LocalDate dateParution) {
        this.cote = cote;
        this.auteur = auteur;
        this.titre = titre;
        this.dateParution = dateParution;
        this.emprunteur = -1;
        this.dateEmprunt = null;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Document document = (Document) o;
        return Objects.equals(cote, document.cote) &&
                Objects.equals(auteur, document.auteur) &&
                Objects.equals(titre, document.titre) &&
                Objects.equals(dateParution, document.dateParution);
    }

    public boolean equals(Document doc){
        return this.getCote().equals(doc.getCote());
    }

    @Override
    public String toString() {
        return  "cote:" + cote + '\n' +
                "\tauteur           = " + auteur + '\n' +
                "\ttitre            = " + titre + '\n' +
                "\tdate de parution = " + dateParution +'\n';
    }

    public String getCote() {
        return cote;
    }

    public String getAuteur() {
        return auteur;
    }

    public String getTitre() {
        return titre;
    }

    public LocalDate getDateParution() {
        return dateParution;
    }

    public boolean aPourCote(String cote){
        return this.getCote().equals(cote);
    }

    public int getEmprunteur() {
        return emprunteur;
    }

    public void setEmprunteur(int emprunteur) {
        this.emprunteur = emprunteur;
    }

    public LocalDate getDateEmprunt() {
        return dateEmprunt;
    }

    public void setDateEmprunt(LocalDate dateEmprunt) {
        this.dateEmprunt = dateEmprunt;
    }

    public boolean emprunt(int emprunteur){
        setEmprunteur(emprunteur);
        setDateEmprunt(LocalDate.now());
        return true;
    }

    public boolean restitution(){
        setDateEmprunt(null);
        return true;
    }

    public boolean estLibre(){
        return emprunteur == -1;
    }

    public int getDureeMax(){
        return 15;
    }

    public LocalDate getDateRetour(){
        if(estLibre()) return null;
        return dateEmprunt.plusDays(getDureeMax());
    }

}
