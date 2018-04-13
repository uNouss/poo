package coo.tp10.terrain;

import coo.tp10.parcelles.Taupe;

public class EssaiTerrain {
    public static void main(String[] args) {
        Terrain terrain = new Terrain(10);

        Taupe t1 = new Taupe(1, terrain, 0,0);
        Taupe t2 = new Taupe(2, terrain, 1,1);

        terrain.affichage();

        terrain.creuserTrou(3,3,1);
        terrain.creuserTrou(4,4,2);
        terrain.creuserTrou(1,2,2);

        terrain.poserTaupe(7,5,t1);
        terrain.poserTaupe(8,6,t2);
        terrain.poserMur(2,1);

        terrain.affichage();
    }
}
