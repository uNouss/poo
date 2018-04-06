package coo.tp9;

import java.util.Arrays;

public class OrdoAvecPriorite implements Ordonnanceur{
    protected OrdoFile[] ordofile;
    private int nbElt;

    public OrdoAvecPriorite(int taille) {
        this.ordofile = new OrdoFile[taille];
        for(int i = 0; i < this.ordofile.length; i++){
            this.ordofile[i] = new OrdoFile();
        }
        this.nbElt = 0;
    }

    @Override
    public String toString() {
        return "OrdoAvecPriorite : " + Arrays.toString(ordofile);
    }

    @Override
    public void ajouteElt(Prioritaire p) {
        if(p.getPriorite() < ordofile.length){
            ordofile[p.getPriorite()].ajouteElt(p);
            this.nbElt++;
        }
    }

    @Override
    public Prioritaire plusPrioritaire() {
        for (OrdoFile anOrdofile : ordofile) {
            if (!anOrdofile.estVide()){
                this.nbElt--;
                return anOrdofile.plusPrioritaire();
            }
        }
        return null;
    }

    @Override
    public boolean estVide() {
        return nbElt == 0;
    }
}
