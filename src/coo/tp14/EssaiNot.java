package coo.tp14;

public class EssaiNot {
    public static void main(String[] args) {
        // création de la borne d’entrée du circuit
        Entree src = new Entree();
        // création de la porte NOT
        Not porteNOT_A = new Not();
        Not porteNOT_B = new Not();
        // raccordement de l’entrée de la porte NOT
        porteNOT_A.connect(src);
        porteNOT_B.connect(porteNOT_A);
        // affectation d’une valeur à l’entrée du circuit
        src.setValeur(false);
        // calcul du résultat de la porte
        porteNOT_B.activer();
        // affichage du résultat
        System.out.println(porteNOT_B.sortie.valeur);
        System.out.println(porteNOT_A.sortie.valeur);
    }
}
