package coo.tp9;

public class OrdoPseudoEquitable extends OrdoAvecPriorite{
    private int[] priorite;

    public OrdoPseudoEquitable(int taille) {
        super(taille);
        this.priorite = new int[taille];
    }

    @Override
    public Prioritaire plusPrioritaire() {
        for(int i = 0; i < priorite.length; i++) {
            if(priorite[i] > i+1) {
                return ordofile[i].plusPrioritaire();
            }
        }
        return super.plusPrioritaire();
    }
}
