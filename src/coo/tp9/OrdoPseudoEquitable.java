package coo.tp9;

public class OrdoPseudoEquitable extends OrdoAvecPriorite{
    private int[] priorite;

    public OrdoPseudoEquitable(int taille) {
        super(taille);
        this.priorite = new int[taille];
    }


}
