package coo.tp9;

public class OrdoPseudoEquitable extends OrdoAvecPriorite{
    private int[] priorite;

    public OrdoPseudoEquitable(int taille) {
        super(taille);
        this.priorite = new int[taille];
    }

    @Override
    public Prioritaire plusPrioritaire() {
        int priority;
        for(int i = 0; i < priorite.length; i++) {
            if(priorite[i] > i+1) {
                priorite[i] = 0;
                return ordofile[i].plusPrioritaire();
            }
        }
        Prioritaire p = super.plusPrioritaire();
        priority = p.getPriorite();
        changePriorite(priority);
        return super.plusPrioritaire();
    }

    private void changePriorite(int priority) {
        for(int i = 0; i < priorite.length; i++){
            if(i != priority) priorite[i] += 1;
        }
    }
}
