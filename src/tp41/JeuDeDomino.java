package tp41;

import java.util.BitSet;

public class JeuDeDomino {
	BitSet dominos;

	public JeuDeDomino() {
		this.dominos =  new BitSet();
	} 
		
	public JeuDeDomino(int[] dominos) {
		this();
		for(int idx = 0; idx < dominos.length; idx++) {
			this.dominos.set(dominos[idx]);
		}
	}

	public String toString() {
		return "dominos: " + this.dominos;
	}
	
	public boolean add(int face1, int face2) {
		this.dominos.set(coder(face1, face2));
		return true;
	}
	
	public boolean remove(int face1, int face2) {
		if(this.dominos.isEmpty()) return false;
		this.dominos.clear(coder(face1, face2));
		return true;
	}
	
	private int coder(int face1, int face2) {
		return face1 < face2 ? Integer.parseInt(face1+""+face2): Integer.parseInt(face2+""+face1);
	}
	public static void main(String[] args) {
		JeuDeDomino d = new JeuDeDomino();
		System.out.println(d);
		d = new JeuDeDomino(new int[] {46,11,56});
		System.out.println(d);
		
		d.add(1, 1);
		System.out.println(d);

		d.remove(6, 5);
		System.out.println(d);
		
		JeuDeDomino d2 = new JeuDeDomino(new int[] {11,24,36});
		System.out.println(d2);
		
		d.dominos.or(d2.dominos);
		
		System.out.println(d);
	}
	
}
