package coo.tp9;

import java.util.Random;

public class EssaiOrdoAvecPriorite {
    public static void main(String[] args) {
        Tache[] taches = new Tache[15];
        Random rand = new Random();
        String label = "abcdefgh";
        for(int i = 0; i < taches.length; i++){
            taches[i] = new Tache(rand.nextInt(50));
            taches[i].setLabel(label.substring(rand.nextInt(label.length())));
        }
        OrdoAvecPriorite oap = new OrdoAvecPriorite(20);

        for(Prioritaire p: taches){
            oap.ajouteElt(p);
        }

        System.out.println(oap);
        System.out.println(oap.plusPrioritaire());
        System.out.println(oap.plusPrioritaire());
    }
}
