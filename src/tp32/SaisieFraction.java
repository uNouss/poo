package tp32;


import tp31.Fraction;

public class SaisieFraction {
	public static final int EXIT_SUCCESS = 0;
	public static final int EXIT_FAILURE = 1;

	public static void main(String[] args) {
		if( args.length != 2 || ! ( Saisie.isInteger(args[0]) && Saisie.isInteger(args[1]))) {
			System.exit(EXIT_FAILURE);
		}
		
		int min = Integer.parseInt(args[0]);
		int max = Integer.parseInt(args[1]);
		
		if ( min > max) {
			System.exit(EXIT_FAILURE);
		}
		
		int numerateur = Saisie.controle(min, max);
		int denominateur = Saisie.controle(min, max);
		
		Fraction fraction = new Fraction(numerateur, denominateur);
		
		System.out.println(fraction.fractionToDouble());
		
		
	}
}
