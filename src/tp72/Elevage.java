package tp72;

import java.util.ArrayList;
import java.util.Iterator;

public class Elevage implements Iterable<Volaille>{
    private ArrayList<Volaille> volailles;
    private final int TAILLEMAX;
    private int nbBetes;

    public Elevage(int TAILLEMAX) {
        this.volailles = new ArrayList<>();
        this.TAILLEMAX = TAILLEMAX;
        this.nbBetes = 0;
    }

    public void ajouter(Volaille v){
        if(this.nbBetes < this.TAILLEMAX){
            volailles.add(v);
            this.nbBetes++;
        }
    }

    public Volaille rechercher(int volaille){
        if(isValide(volaille)) return null;
        int idVolaille = 0;
        int taille = volailles.size();
        while(idVolaille < taille && volailles.get(idVolaille).getIdentite() != volaille){
            idVolaille++;
        }
        if(idVolaille >= taille ) return null;
        return volailles.get(idVolaille);
    }

    private boolean isValide(int volaille) {
        return volaille >=0 && volaille <= nbBetes;
    }

    public void changerPoids(int volaille, double poids){
        Volaille v = rechercher(volaille);
        if(v != null ) v.setPoids(poids);
    }

    @Override
    public String toString() {
        String res = "";
        for(Volaille v: volailles){
            res += v + "\n";
        }
        return res + "TAILLEMAX = " + TAILLEMAX + ", nbBetes = " + nbBetes + "\n";
    }

    public double gainPossible(){
        double gain = 0;
        Volaille v;
        IterateurVolaille itVolaille = new IterateurVolaille(volailles);
        while(itVolaille.hasNext()){
            v = itVolaille.next();
            gain += v.getPoids()*v.getPRIX_INITIAL();
        }
        return gain;
    }

    public ArrayList<Volaille> passageAbattoir(){
        ArrayList<Volaille> aLabatoire = new ArrayList<>();
        Volaille v;
        IterateurVolaille itVolaille = new IterateurVolaille(volailles);
        while(itVolaille.hasNext()){
            v = itVolaille.next();
            aLabatoire.add(v);
        }
        return aLabatoire;
    }

    @Override
    public Iterator<Volaille> iterator() {
        return new IterateurVolaille(volailles);
    }


}
