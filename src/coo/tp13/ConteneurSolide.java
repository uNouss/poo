package coo.tp13;

public class ConteneurSolide extends Conteneur{
    public ConteneurSolide(int capaciteMax) {
        super(capaciteMax);
    }

    @Override
    public int peutContenir(Produit p) {
        return 0;
    }

    @Override
    public int ajout(Produit p, int quantite) {
        if(this.peutContenir(p) == 0 && p.getQuantite() < this.getCapaciteRestante()){
            produits.add(p);
            this.setCapaciteRestante(this.getCapaciteRestante() - p.getQuantite());
            return this.getCapaciteRestante();
        }
        return 0;
    }
}
