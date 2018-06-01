package coo.tp13;

public class ProduitLiquide extends Produit{
    public ProduitLiquide(String nom, int quantite) {
        super(nom, quantite);
    }

    @Override
    public int conditionnement() {
        return 1;
    }

    @Override
    public boolean estLiquide() {
        return true;
    }

    @Override
    public boolean estDangereux() {
        return false;
    }
}
