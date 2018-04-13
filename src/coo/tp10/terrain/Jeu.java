package coo.tp10.terrain;

import coo.tp10.actions.Action;
import coo.tp10.actions.Creuser;
import coo.tp10.actions.Deplacer;
import coo.tp10.parcelles.Taupe;
import tp12.Saisie;

import javax.swing.*;
import java.util.Random;

public class Jeu {
    public final static int TAILLE = 10;
    public final static int NBJ = 2;
    public Terrain plateau;
    public Taupe[] joueurs;
    public int j;

    public void initialisation(){
        this.plateau = new Terrain(this.TAILLE);
        // TIRAGE AU SORT
        Random rand = new Random();
        this.j = rand.nextInt(this.NBJ);

        joueurs = new Taupe[this.NBJ];
        for(int idJ = 0; idJ < joueurs.length; idJ++){
            joueurs[idJ] = new Taupe(idJ, plateau, idJ, idJ);
        }
    }

    public int finJeu(){
        return this.plateau.estTrou(joueurs[j].getCoordonnees().getAbscisse(), joueurs[j].getCoordonnees().getOrdonne());
    }

    public void changerJoueur(){
        this.j = (j == 1) ? 0: 1;
    }

    public void affichage(){
        this.plateau.affichage();
    }

    public Action saisie(){
        Saisie saisie = new Saisie();
        int dir;
        do {
            dir = saisie.saisieEntier("Saisir un entier pour une direction [ 1=HAUT, 2=DROITE, 3=BAS, 4=GAUCHE ]");
        }while( dir < 1 && dir > 4);

        int act;
        do{
            act = saisie.saisieEntier("Saisir un entier pour une action (1=Deplacer, 2=Creuser");
        }while( act < 1 && act > 2);
        Direction direction;
        switch (dir){
            case 1: direction = Direction.HAUT; break;
            case 2: direction = Direction.DROITE; break;
            case 3: direction = Direction.BAS; break;
            default: direction = Direction.GAUCHE; break;
        }

        Action action;
        switch (act){
            case 1: action = new Deplacer(joueurs[j], direction); break;
            default: action = new Creuser(joueurs[j], direction); break;
        }
        return action;
    }

    public static void main(String[] args) {
        Jeu jeu = new Jeu();
        jeu.initialisation();
        jeu.affichage();
        while (jeu.finJeu() == -1) {
            System.out.println(jeu.joueurs[jeu.j]);
            Action a = jeu.saisie();
            a.agit();
            jeu.changerJoueur();
            jeu.affichage();
            try{Thread.sleep(1000);}catch(Exception e){e.printStackTrace();}
            System.out.println(jeu.finJeu());
        }
        JOptionPane.showMessageDialog(null, "Fin Du jeu");
    }

}
