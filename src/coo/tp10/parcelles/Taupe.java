package coo.tp10.parcelles;

import coo.tp10.terrain.Coordonnees;
import coo.tp10.terrain.Terrain;

public class Taupe {
    private int equipe;
    private Coordonnees xy;
    private Terrain plateau;

    public Taupe(int equipe, Terrain plateau, int abscisse, int ordonne) {
        this.equipe = equipe;
        this.plateau = plateau;
        this.xy = new Coordonnees(abscisse, ordonne);
    }

    public int getEquipe() {
        return equipe;
    }

    public Coordonnees getCoordonnees() {
        return xy;
    }

    public Terrain getPlateau() {
        return plateau;
    }

    public void setCoordonnees(Coordonnees coordonnees) {
        this.xy = coordonnees;
    }

    @Override
    public String toString() {
        return "Taupe : " + "equipe = " + equipe + ", Coordonnee = " + xy + ", plateau = " + plateau;
    }
}
