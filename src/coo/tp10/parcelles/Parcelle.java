package coo.tp10.parcelles;

import coo.tp10.terrain.Coordonnees;

public class Parcelle {
    private Coordonnees mesCoordonnees;
    private int trou;
    private boolean mur;
    private Taupe taupe;

    public Parcelle(int abs, int ord) {
        this.mesCoordonnees = new Coordonnees(abs, ord);
        this.trou = -1;
        this.mur = false;
        this.taupe = null;
    }

    public Coordonnees getCoordonnees() {
        return mesCoordonnees;
    }

    public void setCoordonnees(Coordonnees coordonnees) {
        this.mesCoordonnees = coordonnees;
    }

    public int estTrou(){
        return this.trou;
    }

    public int estTaupe(){
        return (taupe != null ) ? taupe.getEquipe() : -1;
    }

    public boolean estMur(){
        return this.mur == true;
    }

    public void poserMur() {
        this.mur = true;
    }

    public void retirerMur(){
        this.mur = false;
    }

    public void creuserTrou(int equipe){
        if(this.trou == -1 ) this.trou = equipe;
    }

    public void boucherTrou(){
        if(this.trou != -1) this.trou = -1;
    }

    public Taupe getTaupe() {
        return taupe;
    }

    public void poserTaupe(Taupe taupe){
        this.taupe = taupe;
        if(this.trou != -1) this.taupe = null;
    }

    public void retirerTaupe(){
        this.taupe = null;
    }

    public void vider(){
        this.taupe = null;
        this.mur = false;
        this.trou = -1;
    }

    @Override
    public String toString() {
        return "Parcelle{" +
                "mesCoordonnees = " + mesCoordonnees +
                ", trou = " + trou +
                ", mur = " + mur +
                ", taupe = " + taupe +
                '}';
    }
}
