package coo.tp13;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public abstract class Conteneur implements Iterable<Produit>{
    protected ArrayList<Produit> produits;
    private int capaciteMax;
    private int capaciteRestante;

    public Conteneur(int capaciteMax) {
        this.produits = new ArrayList<>();
        this.capaciteMax = capaciteMax;
        this.capaciteRestante = this.capaciteMax;
    }


    public boolean estVide(){
        return this.capaciteRestante == this.capaciteMax;
    }

    public int getCapaciteMax() {
        return capaciteMax;
    }

    public void setCapaciteMax(int capaciteMax) {
        this.capaciteMax = capaciteMax;
    }

    public int getCapaciteRestante() {
        return capaciteRestante;
    }

    public void setCapaciteRestante(int capaciteRestante) {
        this.capaciteRestante = capaciteRestante;
    }

    public abstract int peutContenir(Produit p);
    public abstract int ajout(Produit p, int quantite);

    @Override
    public String toString() {
        String res = "";
        for(Produit p: produits){
            res += (p.estLiquide()) ? p: p+""+p.conditionnement();
        }
        return "Conteneur ["+capaciteRestante+"|"+capaciteMax+"]"+res;
    }


    public Iterator<Produit> iterator(){
        return produits.iterator();
    }

}
