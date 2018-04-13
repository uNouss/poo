package coo.tp10.actions;

import coo.tp10.parcelles.Taupe;
import coo.tp10.terrain.Coordonnees;
import coo.tp10.terrain.Direction;

public abstract class Action {
    protected Taupe taupe;
    protected Direction direction;

    public Action(Taupe taupe, Direction direction) {
        this.taupe = taupe;
        this.direction = direction;
    }

    public Direction getDirection() {
        return direction;
    }

    public void setDirection(Direction direction) {
        this.direction = direction;
    }

    public Taupe getTaupe() {
        return taupe;
    }

    public void setTaupe(Taupe taupe) {
        this.taupe = taupe;
    }

    public Coordonnees getCoordonnees(){
        return this.taupe.getCoordonnees();
    }

    public void setCoordonnees(Coordonnees coord){
        this.taupe.setCoordonnees(coord);
    }

    public abstract void agit();
}

