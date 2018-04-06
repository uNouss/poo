package coo.tp9;

public interface Ordonnanceur {
    /**
     * Ajoute un élément prioritaire à l'ordonnanceur
     * @param p
     */
    void ajouteElt(Prioritaire p);
    Prioritaire plusPrioritaire();
    boolean estVide();
}
