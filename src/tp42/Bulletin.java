package tp42;

import java.util.HashMap;

import javax.swing.JOptionPane;

public class Bulletin {
	HashMap<String, int[]> releve;

	public Bulletin() {
		this.releve = new HashMap<String, int[]>();
	}

	public void ajout(String nom, int[] notes) {
		this.releve.put(nom, notes);
	}
	
	public void bilan() {
		this.releve.forEach((nom,notes)->System.out.println("Notes de " + nom + " : [" +afficheNote(notes) + "]"));
	}
	
	private String afficheNote(int[] notes) {
		String res = "";
		for(int idx = 0; idx < notes.length; idx++) {
			res += notes[idx]+", ";
		}
		return res;
	}
	
	public void affiche() {
		String key;
		do {
			key = JOptionPane.showInputDialog("Saisir nom etu: ");
		}while(!this.releve.containsKey(key));
		JOptionPane.showMessageDialog(null, "Notes de "+key+": [ "+afficheNote(releve.get(key))+"]");
	}
	
	public static void main(String[] args) {
		Bulletin b = new Bulletin();
		
		b.ajout("A", new int[] {1, 2, 3});
		b.ajout("B", new int[] {3, 4, 3});
		b.ajout("C", new int[] {7, 2, 3});
		
		b.bilan();
		b.affiche();
	}
}
