package tp52;

import java.util.Random;

public class Course {
    public static void main(String[] args) {
        String[] images = new String[]{"ressource/sea.png", "ressource/blue.png",
                "ressource/red.png", "ressource/green.png", "ressource/yellow.png"};
        int taille = 10;
        SuperPlateau p = new SuperPlateau(images, taille);

        int[][] jeu = new int[taille][taille];

        jeu[0][0] = 2;
        jeu[0][1] = 3;

        p.setJeu(jeu);
        Random random = new Random();

        int tour

        while(jeu[taille-1][taille-1] == 0){
            int direction = random.nextInt(3);
            int x1 = 0, y1 = 0, x2, y2;
            switch (direction){
                int a, b;
                case 0:
                    if((y1+1) < taille){
                        b = y+1;
                    }
                    break;
                case 1:
                    if((x+1) < taille && (y+1) < taille){
                        a = x + 1;
                        b = y + 1;
                    }
                    break;
                default:
                    if((x+1) < taille){
                        a = x + 1;
                    }
                    break;
            }
        }
    }

    private int swap(int joueur){
        return !;
    }
}
