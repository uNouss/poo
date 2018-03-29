package tp72;

import java.util.ArrayList;
import java.util.Iterator;

public class IterateurVolaille implements Iterator<Volaille>{
    private ArrayList<Volaille> volailles;
    private final int taille;
    private int idx = -1;

    public IterateurVolaille(ArrayList<Volaille> volailles) {
        this.volailles = volailles;
        this.taille = volailles.size();
        suivant();
    }

    @Override
    public boolean hasNext() {
        return idx < taille;
    }

    @Override
    public Volaille next() {
        Volaille v = volailles.get(idx);
        suivant();
        return v;
    }

    private void suivant() {
        int idVolaille = idx+1;
        while(idVolaille < taille && volailles.get(idVolaille).getPoids() < volailles.get(idVolaille).getPOIDS_MIN()){
            idVolaille++;
        }
        this.idx = idVolaille;
    }
}
