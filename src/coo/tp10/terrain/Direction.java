package coo.tp10.terrain;

public enum Direction {
    HAUT(new Coordonnees(0,-1)),
    BAS(new Coordonnees(0,1)),
    GAUCHE(new Coordonnees(-1,0)),
    DROITE(new Coordonnees(1,0));

    private final Coordonnees deplacement;

    private Direction(Coordonnees deplacement) {
        this.deplacement = deplacement;
    }

    public Coordonnees getDeplacement() {
        return deplacement;
    }
}
