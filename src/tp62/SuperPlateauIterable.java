package tp62;

import tp52.SuperPlateau;

import java.awt.*;
import java.util.Iterator;

public class SuperPlateauIterable implements Iterable<Integer>{
    private SuperPlateau sp;

    public SuperPlateauIterable(String[] images, int taille) {
        this.sp = new SuperPlateau(images, taille);
    }

    @Override
    public Iterator<Integer> iterator() {
        return new PlateauIterator(sp.getJeu());
    }

    public void paintComponent(Graphics g) {
        sp.paintComponent(g);
    }

    public void setJeu(int[][] jeu) {
        sp.setJeu(jeu);
    }

    public int[][] getJeu() {
        return sp.getJeu();
    }

    public void affichage() {
        sp.affichage();
    }

    public boolean deplacer(int x, int y, int a, int b) {
        return sp.deplacer(x, y, a, b);
    }


}
