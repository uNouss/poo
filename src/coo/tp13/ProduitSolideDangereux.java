package coo.tp13;

public class ProduitSolideDangereux extends ProduitSolide implements Dangereux{
    public ProduitSolideDangereux(String nom, int quantite) {
        super(nom, quantite);
    }

    public ProduitSolideDangereux(String nom, int quantite, int conditionnemen) {
        super(nom, quantite, conditionnemen);
    }

    @Override
    public boolean estInflammable() {
        return false;
    }

    @Override
    public boolean estCorrosif() {
        return false;
    }
}
