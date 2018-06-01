package coo.tp13;

public class ProduitLiquideDangereux extends ProduitLiquide implements Dangereux{
    public ProduitLiquideDangereux(String nom, int quantite) {
        super(nom, quantite);
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
