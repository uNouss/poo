package coo.tp10.terrain;

import java.awt.Frame;
import java.awt.Graphics;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.HashMap;
import java.util.Map;

import javax.swing.ImageIcon;
import javax.swing.JPanel;

import coo.tp10.parcelles.Parcelle;
import coo.tp10.parcelles.Taupe;

/**
 * La classe <b><i>Terrain</i></b> représente une grille carrée de parcelles 
 * sur laquelle évoluent les taupes
*/
public class Terrain extends JPanel{
	/** grille de parcelles */
	public static Parcelle[][] terrain; 
	/** table associant nom et icône */
	private static Map<String,ImageIcon> images= new HashMap<>();
	/** taille d'une parcelle */
	private static final int tailleParcelle=new ImageIcon("ressource/terre.png").getIconHeight()+2;
	/** taille du territoire */
	private static int tailleTerrain; 
	/** indicateur de fin de partie */
	public static boolean fin = false;

	/**
	 * Retourne la taille du terrain
	 * @return la taille du terrain
	 */
	public static int getTaille(){
		return tailleTerrain;
	}
	
	/**
	 * Crée une fenêtre et affiche le territoire dedans
	 * @param taille la taille du territoire
	 */
	public Terrain(int taille) {
		Terrain.tailleTerrain=taille;
		terrain=new Parcelle[tailleTerrain][tailleTerrain];
		
		// les images manipulées
		images.put("terre",new ImageIcon("ressource/terre.png"));
		images.put("mur",new ImageIcon("ressource/mur.png"));
		images.put("tas",new ImageIcon("ressource/tas.png"));
		images.put("trou",new ImageIcon("ressource/trou.png"));
		images.put("taupe1",new ImageIcon("ressource/taupe1.png"));
		images.put("taupe2",new ImageIcon("ressource/taupe2.png"));
		
		// taille de la fenêtre
		Frame f = new Frame("Terrain");
		f.setBounds(0,100, tailleParcelle*tailleTerrain+20, tailleParcelle*tailleTerrain+50);
		f.add(this);
		
		// remplissage du terrain
		for(int i=0; i<tailleTerrain; i++)
			for(int j=0; j<tailleTerrain; j++)
				terrain[i][j] = new Parcelle(i,j);
		// pose des murs autour du terrain
		for (int i=0; i<tailleTerrain-1;i++) {
			terrain[i][0].poserMur();
			terrain[0][i].poserMur();
			terrain[i][tailleTerrain-1].poserMur();
			terrain[tailleTerrain-1][i].poserMur();
		}
		terrain[tailleTerrain-1][tailleTerrain-1].poserMur();
		// gestion de la fermeture de la fenêtre
		f.addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e)  {System.exit(0);}
		});
		// Affichage de la fenêtre
		f.setVisible(true);
	}

	/**
	 * (non-Javadoc)
	 * @see javax.swing.JComponent#update(java.awt.Graphics)
	 */
	public void update(Graphics g) {paint(g);}
	public void affichage() {repaint();}
	
	/**
	 *(non-Javadoc)
	 * @see javax.swing.JComponent#paint(java.awt.Graphics)
	 */
	public void paint(Graphics g) {
		for (int x=0; x<tailleTerrain; x++){
			for (int y=0; y<tailleTerrain; y++){ 
				if (estMur(x,y)) {
					g.drawImage(images.get("mur").getImage(),x*tailleParcelle+10,y*tailleParcelle+35,null);
				}
				else {
					if(estTrou(x,y) != -1){
						g.drawImage(images.get("trou").getImage(),x*tailleParcelle+10,y*tailleParcelle+35,null);
					}
					else{ 
						switch (estTaupe(x,y))
						{
						case 1: {
							g.drawImage(images.get("taupe1").getImage(),x*tailleParcelle+10,y*tailleParcelle+35,null);
							break;
						}
						case 2: {
							g.drawImage(images.get("taupe2").getImage(),x*tailleParcelle+10,y*tailleParcelle+35,null);
							break;
						}
						default: {
							g.drawImage(images.get("terre").getImage(),x*tailleParcelle+10,y*tailleParcelle+35,null);
							break;
						}
						}
					}
				}
			}
		}
	}

    public int estTaupe(int x, int y) {
        return terrain[x][y].estTaupe();
    }

    public int estTrou(int x, int y) {
	    return terrain[x][y].estTrou();
    }

    public boolean estMur(int x, int y) {
        return terrain[x][y].estMur();
    }

    public void poserMur(int x, int y){
	    terrain[x][y].poserMur();
    }

    public void retirerMur(int x, int y){
        terrain[x][y].retirerMur();
    }

    public void poserTaupe(int x, int y, Taupe taupe){
        terrain[x][y].poserTaupe(taupe);
    }

    public void retirerTaupe(int x, int y){
        terrain[x][y].retirerTaupe();
    }

    public void creuserTrou(int x, int y, int equipe){
        terrain[x][y].creuserTrou(equipe);
    }

    public void boucherTrou(int x, int y){
        terrain[x][y].boucherTrou();
    }

    public void setLibre(int x, int y){
	    terrain[x][y].vider();
    }

}