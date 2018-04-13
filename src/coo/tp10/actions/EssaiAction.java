package coo.tp10.actions;

import coo.tp10.parcelles.Taupe;
import coo.tp10.terrain.Direction;
import coo.tp10.terrain.Terrain;

public class EssaiAction {
    public static void main(String[] args) {

        Terrain terrain = new Terrain(10);

        Taupe t1 = new Taupe(1, terrain, 2,6);
        Taupe t2 = new Taupe(2, terrain, 4,2);



        terrain.creuserTrou(3,3,1);
        terrain.creuserTrou(4,4,2);
        terrain.creuserTrou(1,2,2);

        terrain.poserTaupe(t1.getCoordonnees().getAbscisse(),t1.getCoordonnees().getOrdonne(),t1);
        terrain.poserTaupe(t2.getCoordonnees().getAbscisse(),t2.getCoordonnees().getOrdonne(),t2);
        terrain.poserMur(2,1);
        terrain.affichage();

        try{Thread.sleep(1000);}catch(Exception e){e.printStackTrace();}
        Action[] actions = new Action[4];
        actions[0] = new Deplacer(t1, Direction.BAS);
        actions[1] = new Deplacer(t1, Direction.DROITE);
        actions[2] = new Creuser(t2, Direction.BAS);
        actions[3] = new Deplacer(t2, Direction.BAS);

        for(Action a: actions){
            a.agit();
            terrain.affichage();
            try{Thread.sleep(1000);}catch(Exception e){e.printStackTrace();}
        }
    }
}
