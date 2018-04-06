package coo.tp9;

public class Systeme {
    public static void main(String[] args) {
        OrdoAvecPriorite oap = new OrdoAvecPriorite(12);

        oap.ajouteElt(new ProcessusAfficheur("j'affiche"));
        oap.ajouteElt(new ProcessusBoucleur("je boucle", 5));
        oap.ajouteElt(new ProcessusLectureEcriture());
        oap.ajouteElt(new ProcessusBoucleur("je boucle aussi", 4));
        oap.ajouteElt(new ProcessusBoucleur("je boucle encore", 6));
        oap.ajouteElt(new ProcessusAfficheur("j'affiche"));


        while(!oap.estVide()){
            Processus p = (Processus) oap.plusPrioritaire();
            p.execute();
            if(!p.estFini()) oap.ajouteElt((Prioritaire)p);
        }

    }
}
