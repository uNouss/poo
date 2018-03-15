package tp52;

import util.Plateau;

import java.util.Random;

public class Traversee {
    public static void main(String[] args) {
        String[] images = new String[]{"ressource/sea.png", "ressource/blue.png",
                "ressource/red.png", "ressource/green.png", "ressource/yellow.png"};
        int taille = 10;
        SuperPlateau p = new SuperPlateau(images, taille);

        Random random = new Random();

        int[][] jeu = new int[taille][taille];

        jeu[0][0] = 2;
        p.setJeu(jeu);

        int nbTour = 0;
        int x = 0, y =0;
        while(jeu[taille-1][taille-1] == 0){
            int a = x, b = y;
            int direction = random.nextInt(3);
            if( direction == 0 && (y+1) < taille) {
                b = y + 1;
            }else if( direction == 1 && (x+1) < taille && (y+1) < taille){
                a = x + 1;
                b = y + 1;
            }else if((x+1) < taille){
                a = x + 1;
            }
            p.deplacer(x,y, a, b);
            x = a;
            y = b;
            p.affichage();
            nbTour++;
            try{Thread.sleep(1000);}catch(Exception ie){}
        }

        System.out.println("nbTour = " + nbTour);
    }
}
