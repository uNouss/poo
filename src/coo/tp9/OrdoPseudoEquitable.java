package coo.tp9;

public class OrdoPseudoEquitable extends OrdoAvecPriorite{
    private int[] priorite;

    public OrdoPseudoEquitable(int taille) {
        super(taille);
        this.priorite = new int[taille];
    }

    @Override
    public Prioritaire plusPrioritaire() {
        Prioritaire p = super.plusPrioritaire();
        int priority = p.getPriorite();
        for(int i = 0; i < priorite.length; i++) {
            priorite[i] += 1;
        }
        priorite[priority] = 0;
        ((Processus)p).execute();
        return null;
    }



}
