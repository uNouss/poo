package coo.tp10.actions;

import coo.tp10.parcelles.Taupe;
import coo.tp10.terrain.Coordonnees;
import coo.tp10.terrain.Direction;

public class Creuser extends Action{

    public Creuser(Taupe taupe, Direction direction) {
        super(taupe, direction);
    }

    @Override
    public void agit() {
        Coordonnees coord_src = taupe.getCoordonnees();
        Coordonnees coord_dst = coord_src.modifier(direction.getDeplacement());

        taupe.getPlateau().creuserTrou(coord_dst.getAbscisse(), coord_dst.getOrdonne(), taupe.getEquipe());
    }
}
