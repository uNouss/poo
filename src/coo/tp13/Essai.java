package coo.tp13;

import java.util.ArrayList;
import java.util.List;

public class Essai {
    public static void main(String[] args) {
        List<Produit> produits =new ArrayList<>();
        produits.add(new ProduitLiquide("eau", 100));

        produits.add(new ProduitSolide("chaussettes", 10, 20));

        produits.add(new ProduitSolide("boulons", 10, 5));


        /*for(Produit p: produits)
            System.out.print(p);*/

        List<Conteneur> conteneur = new ArrayList<>();
        conteneur.add(new ConteneurLiquide(10));
        conteneur.add(new ConteneurSolide(10));


        conteneur.get(0).ajout(new ProduitLiquide("bidons", 5), 5);
        conteneur.get(1).ajout(new ProduitSolide("boites", 10), 5);
        conteneur.get(1).ajout(new ProduitSolide("caisses", 100), 5);

        for(Conteneur c: conteneur) {
            System.out.print(c);
        }

        Produit p1 = new ProduitSolide("Chaussette", 10, 5);
        Produit p2 = new ProduitSolide("Boulon", 5, 20);
        ConteneurSolide cs = new ConteneurSolide(100);
        cs.ajout(p1,3);
        cs.ajout(p2, 2);
        for(Produit p: cs) System.out.println(p);

    }
}