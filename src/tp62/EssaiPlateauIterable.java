package tp62;

import tp52.SuperPlateau;
import util.Plateau;

import java.util.Arrays;
import java.util.Iterator;
import java.util.Random;

public class EssaiPlateauIterable {
    private static int NB_RESSOURCE;

    public static void main(String[] args) {
        String[] images = new String[]{"ressource/blue.png",
                "ressource/red.png", "ressource/green.png", "ressource/yellow.png"};
        NB_RESSOURCE = images.length;
        int taille = 10;
        SuperPlateauIterable sp = new SuperPlateauIterable(images, taille);


        sp.setJeu(generateJeu(taille));
        sp.affichage();
        Iterator<Integer> it_sp = sp.iterator();

        int nbBlue = 0, nbRed = 0, nbGreen = 0, nbYellow = 0;

        while(it_sp.hasNext()){
            switch(it_sp.next()){
                case 1: nbBlue++; break;
                case 2: nbRed++; break;
                case 3: nbGreen++; break;
                case 4: nbYellow++; break;
                default: break;
            }
        }

        System.out.printf("%10s : %4d\n", "Bleu", nbBlue);
        System.out.printf("%10s : %4d\n", "Red", nbRed);
        System.out.printf("%10s : %4d\n", "Green", nbGreen);
        System.out.printf("%10s : %4d\n", "Yellow", nbYellow);

    }

    private static int[][] generateJeu(int taille) {
        Random random = new Random();
        int[][] jeu = new int[taille][taille];
        for (int y = 0; y < jeu.length; y++) {
            for (int x = 0; x < jeu[y].length; x++) {
                jeu[y][x] = random.nextInt(NB_RESSOURCE)+1;
            }
            System.out.println(Arrays.toString(jeu[y]));
        }
        return jeu;
    }

}
