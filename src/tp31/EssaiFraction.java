package tp31;

import java.util.Random;

public class EssaiFraction {
	
	public static void trier(Fraction[] fractions) {
		for (int idx = fractions.length ; idx > 1; idx--) {
			for(int idxB = 0; idxB < idx - 1; idxB++) {
				if(fractions[idxB].compareTo(fractions[idxB+1]) > 1 ) {
					Fraction tmp = fractions[idxB];
					fractions[idxB] = fractions[idxB+1];
					fractions[idxB+1] = tmp;
				}
			}
		}
	}

	public static void initier(Fraction[] fractions) {
		Random r = new Random();
		for (int idx = 0; idx < fractions.length; idx++) {
			fractions[idx] = new Fraction(r.nextInt(10)+1, r.nextInt(10)+1);
		}
	}

	public static void afficher(Fraction[] fractions) {
		for (int idx = 0; idx < fractions.length; idx++) {
			System.out.println(String.format("%5s", fractions[idx])+ " ~ " + fractions[idx].fractionToDouble());
		}
	}

	public static void main(String[] args) {
		Fraction[] fractions = new Fraction[Integer.parseInt(args[0])];

		EssaiFraction.initier(fractions);
		EssaiFraction.afficher(fractions);	
		System.out.println();
		EssaiFraction.trier(fractions);
		EssaiFraction.afficher(fractions);	
	}

}
