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
        Volaille v;
        for(v: volailles){
            if(v.getIdentite() == volaille) {
                break;
            }
        }
        return v;
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
        return "Elevage{" +
                "volailles=" + volailles +
                ", TAILLEMAX=" + TAILLEMAX +
                ", nbBetes=" + nbBetes +
                "}\n";
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



    @Override
    public Iterator<Volaille> iterator() {
        return new IterateurVolaille(volailles);
    }


}
