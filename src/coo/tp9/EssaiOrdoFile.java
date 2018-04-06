package coo.tp9;

import java.util.Random;

public class EssaiOrdoFile {
    public static void main(String[] args) {
        Tache[] taches = new Tache[5];
        Random rand = new Random();
        for(int i = 0; i < taches.length; i++){
            taches[i] = new Tache(rand.nextInt(50)+10);
        }
        OrdoFile of = new OrdoFile();
        for(Prioritaire p: taches) {
            //System.out.println(p);
            of.ajouteElt(p);
        }
        System.out.println(of);
        System.out.println(of.plusPrioritaire());
        System.out.println(of.plusPrioritaire());
    }
}
