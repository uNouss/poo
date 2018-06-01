package coo.tp13;

public abstract class Produit {
    private String nom;
    private int quantite;

    public Produit(String nom, int quantite) {
        this.nom = nom;
        this.quantite = quantite;
    }

    public int getQuantite() {
        return quantite;
    }

    public void setQuantite(int quantite) {
        this.quantite = quantite;
    }

    public void addQauntite(int quantite){
        this.quantite += quantite;
    }

    @Override
    public String toString() {
        return this.nom+":"+this.quantite;
    }

    public abstract int conditionnement();
    public abstract boolean estLiquide();
    public abstract boolean estDangereux();
}
