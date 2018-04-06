package coo.tp9;

import java.util.ArrayList;

public class OrdoFile implements Ordonnanceur{
    private ArrayList<Prioritaire> laFile;

    public OrdoFile() {
        this.laFile = new ArrayList<>();
    }

    @Override
    public String toString() {
        return "la File = " + laFile;
    }

    @Override
    public void ajouteElt(Prioritaire p) {
        laFile.add(p);
    }

    @Override
    public Prioritaire plusPrioritaire() {
        return laFile.remove(0);
    }

    @Override
    public boolean estVide() {
        return laFile.isEmpty();
    }
}
