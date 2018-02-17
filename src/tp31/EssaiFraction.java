package tp31;

import java.util.Random;

public class EssaiFraction {

	private static void echanger(Fraction[] fractions, int idx1, int idx2) {
		Fraction tmp = fractions[idx1];
		fractions[idx1] = fractions[idx2];
		fractions[idx2] = tmp;
	}

	private static void trier(Fraction[] fractions) {
		for (int idx = fractions.length ; idx > 1; idx--) {
			for(int idxB = 0; idxB < idx - 1; idxB++) {
				if(fractions[idxB].compareTo(fractions[idxB+1]) > 1 ) {
					EssaiFraction.echanger(fractions, idxB, idxB + 1);
				}
			}
		}
	}

	private static void initier(Fraction[] fractions) {
		Random r = new Random();
		for (int idx = 0; idx < fractions.length; idx++) {
			fractions[idx] = new Fraction(r.nextInt(10)+1, r.nextInt(10)+1);
		}
	}

	private static void afficher(Fraction[] fractions) {
		for (Fraction fraction : fractions) {
			System.out.println(String.format("%5s", fraction) + " ~ " + fraction.fractionToDouble());
		}
	}

	public static void main(String[] args) {
		Fraction[] fractions = new Fraction[Integer.parseInt(args[0])];

		EssaiFraction.initier(fractions);
		EssaiFraction.afficher(fractions);	
		System.out.println();
		EssaiFraction.trier(fractions);
		EssaiFraction.afficher(fractions);
		
		System.out.println("somme de fraction:   "+fractions[0]+" + "+fractions[1]+" = "+fractions[0].addition(fractions[1]));
		System.out.println("produit de fraction: "+fractions[0]+" x "+fractions[1]+" = "+fractions[0].multiplication(fractions[1]));
	}

}
