package coo.tp13;

public class ProduitSolide extends Produit{
    private int conditionnement;

    public ProduitSolide(String nom, int quantite) {
        super(nom, quantite);
    }

    public ProduitSolide(String nom, int quantite, int conditionnemen) {
        super(nom, quantite);
        this.conditionnement = conditionnement;
    }

    @Override
    public int conditionnement() {
        return this.conditionnement;
    }

    @Override
    public boolean estLiquide() {
        return false;
    }

    @Override
    public boolean estDangereux(){
        return false;
    }

    @Override
    public String toString() {
        return super.toString()+" ["+conditionnement+"] ";
    }
}
