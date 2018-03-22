package tp52;

import util.Plateau;

import java.awt.*;

public class SuperPlateau {
    private Plateau plateau;
    private int taille;

    public SuperPlateau(String[] images, int taille) {
        this.plateau = new Plateau(images, taille);
        this.taille = taille;
    }

    public void paintComponent(Graphics g) {
        plateau.paintComponent(g);
    }

    public void setJeu(int[][] jeu) {
        plateau.setJeu(jeu);
    }

    public int[][] getJeu() {
        return plateau.getJeu();
    }

    public void affichage() {
        plateau.affichage();
    }

    public boolean deplacer(int x, int y, int a, int b) {
        if(!indiceValide(x,y,a,b)) return false;
        int[][] jeu = this.getJeu();
        if(jeu[a][b] == 0) {
            jeu[a][b] = jeu[x][y];
            jeu[x][y] = 0;
            return true;
        }
        return false;
    }

    private boolean indiceValide(int x, int y, int a, int b) {
        return x >= 0 && x < taille
                && y >= 0 && y < taille
                && a >= 0 && a < taille
                && b >= 0 && b < taille;
    }
}
