package tp82;

import java.time.LocalDate;

public abstract class Employe implements Comparable<Employe>{
    private String nom;
    private LocalDate dateEmbauche;

    public Employe(String nom, LocalDate dateEmbauche) {
        this.nom = nom;
        this.dateEmbauche = dateEmbauche;
    }

    public String getNom() {
        return nom;
    }

    public LocalDate getDateEmbauche() {
        return dateEmbauche;
    }

    @Override
    public String toString() {
        return  "["+this.getTitre()+"]" +
                "Nom = " + this.getNom() + ", dated'embauche = " + dateEmbauche +"\n";
    }

    public String getTitre(){
        return this.getClass().toString();
    }

    public abstract double getSalaire();

    public int compareTo(Employe e){
        return -1*this.dateEmbauche.compareTo(e.dateEmbauche);
    }

    public abstract boolean satisfaitObjectif();
}
