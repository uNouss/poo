package tp21;

public class EssaiGrille {

	public static void main(String[] args) {
		Grille grid = new Grille(3, 5);
		
		//grid.remplir(0, 200);
		//grid.affiche();
		//grid.fenetre(0, 0);
		
		grid.remplir(1, 99, false, 0.5);
		grid.affiche();
	}

}
