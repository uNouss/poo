package coo.tp9;

public class Systeme {
    public static void main(String[] args) {
        Ordonnanceur oap = new OrdoAvecPriorite(12);

        oap.ajouteElt(new ProcessusAfficheur("j'affiche"));
        oap.ajouteElt(new ProcessusBoucleur("je boucle", 5));
        oap.ajouteElt(new ProcessusLectureEcriture());
        oap.ajouteElt(new ProcessusBoucleur("je boucle aussi", 4));
        oap.ajouteElt(new ProcessusBoucleur("je boucle encore", 6));
        oap.ajouteElt(new ProcessusAfficheur("j'affiche"));


        runProcessus(oap);

        Ordonnanceur oap1 = new OrdoPseudoEquitable(12);

        oap1.ajouteElt(new ProcessusAfficheur("j'affiche"));
        oap1.ajouteElt(new ProcessusBoucleur("je boucle", 5));
        oap1.ajouteElt(new ProcessusLectureEcriture());
        oap1.ajouteElt(new ProcessusBoucleur("je boucle aussi", 4));
        oap1.ajouteElt(new ProcessusBoucleur("je boucle encore", 6));
        oap1.ajouteElt(new ProcessusAfficheur("j'affiche"));


        runProcessus(oap1);

    }

    private static void runProcessus(Ordonnanceur oap1) {
        while(!oap1.estVide()){
            Processus p = (Processus) oap1.plusPrioritaire();
            p.execute();
            if(!p.estFini()) oap1.ajouteElt((Prioritaire)p);
        }
    }
}
