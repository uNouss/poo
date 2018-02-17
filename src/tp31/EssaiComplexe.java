package tp31;

public class EssaiComplexe {
	public static void main(String[] args) {
		Complexe z1 = new Complexe(2.0, 2.0);
		Complexe z2 = new Complexe(2.0, -4.0);

		Complexe z3 = z1.somme(z2);

		System.out.println(z1 + " + " + z2 + " = " + z3);
		System.out.println(Complexe.produit(Complexe.somme(z1, z2), 2));
		System.out.println("module de " + z3 + " = " + z3.module());
		System.out.println("argument de " + z3 + " = " + z3.argument());
		System.out.println("conjugué de " + z3 + " = " + z3.conjugue());
	}
}
