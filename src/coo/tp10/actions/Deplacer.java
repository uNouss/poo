package coo.tp10.actions;

import coo.tp10.parcelles.Taupe;
import coo.tp10.terrain.Coordonnees;
import coo.tp10.terrain.Direction;

public class Deplacer extends Action{
    public Deplacer(Taupe taupe, Direction direction) {
        super(taupe, direction);
    }

    @Override
    public void agit() {
        Coordonnees coord_src = taupe.getCoordonnees();
        Coordonnees coord_dst = coord_src.modifier(direction.getDeplacement());
        taupe.setCoordonnees(coord_dst);

        taupe.getPlateau().retirerTaupe(coord_src.getAbscisse(), coord_src.getOrdonne());
        taupe.getPlateau().poserTaupe(coord_dst.getAbscisse(), coord_dst.getOrdonne(), taupe);

    }
}
