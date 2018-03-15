package tp52;

import util.Plateau;

import java.util.Arrays;
import java.util.Random;

public class EssaiPlateau {
    public static void main(String[] args) {
        String[] images = new String[]{"ressource/sea.png", "ressource/blue.png",
                "ressource/red.png", "ressource/green.png", "ressource/yellow.png"};
        int taille = 10;
        Plateau p = new Plateau(images, taille);

        Random random = new Random();

        int[][] jeu = new int[taille][taille];
        for(int idxL = 0; idxL < jeu.length; idxL++){
            for (int idxC = 0; idxC < jeu[idxL].length; idxC++) {
                jeu[idxL][idxC] = random.nextInt(6);
            }
            System.out.println(Arrays.toString(jeu[idxL]));
        }
        p.setJeu(jeu);
        p.affichage();

        SuperPlateau sp = new SuperPlateau(images, taille);
        jeu = new int[taille][taille];
        jeu[0][0] = 2;
        sp.setJeu(jeu);
        sp.affichage();

        sp.deplacer(0, 0, 1, 1);
        sp.affichage();
    }
}