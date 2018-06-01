package coo.tp13;

public class ConteneurLiquide extends Conteneur{
    public ConteneurLiquide(int capaciteMax) {
        super(capaciteMax);
    }

    @Override
    public int peutContenir(Produit p) {
        return super.getCapaciteMax()/p.getQuantite();
    }

    @Override
    public int ajout(Produit p, int quantite) {
        if(this.peutContenir(p) != 0 && p.getQuantite() < this.getCapaciteRestante()){
            produits.add(p);
            this.setCapaciteRestante(this.getCapaciteRestante() - p.getQuantite());
            return this.getCapaciteRestante();
        }
        return 0;
    }

}
