package tp42;

public class Module {
	private Bulletin bulletin;

	public Module() {
		this.bulletin = new Bulletin();
	}

	public void ajout(String nom, int[] notes) {
		bulletin.ajout(nom, notes);
	}

	public void bilan() {
		System.out.println("Module "+this.bulletin);
		bulletin.bilan();
	}

	public void affiche() {
		bulletin.affiche();
	}
	
	public static void main(String[] args) {
		Module m1 = new Module(), m2 =  new Module();
		
		m1.ajout("A", new int[] {1, 2, 3, 4, 5});
		m1.ajout("B", new int[] {1, 2, 3, 4, 5});
		
		m2.ajout("B", new int[] {1, 2, 3, 4, 5});
		m2.ajout("C", new int[] {1, 2, 3, 4, 5});
		
		m1.bilan();
		m2.bilan();
		
		m1.affiche();
		m2.affiche();
	}
	
	
}
