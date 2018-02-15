package tp22;

public class EssaiCatalogue {

	public static void main(String[] args) {
		Collector[] collectors = new Collector[] {
				new Collector("xdf10"),
				new Collector("koz106", 100),
				new Collector("qwerty", 33)
		};
		Catalogue catalogue = new Catalogue("monCatalogue");
		
		collectors[1].ajouter(30);
		collectors[2].ajouter(3);

		
		catalogue.ajouter(collectors[0].getIdentifiant());
		
		catalogue.ajouter(collectors[1].getIdentifiant(), collectors[1].getNbExemplaires());
		catalogue.changerPrix(collectors[1].getIdentifiant(), collectors[1].getPrix());
		
		System.out.println(catalogue);
		
		catalogue.ajouter(catalogue.get("xdf10").getIdentifiant(), 10);
		catalogue.enlever(10, catalogue.get("koz106").getIdentifiant());
		catalogue.changerPrix(catalogue.get("xdf10").getIdentifiant(), 10);
		
		System.out.println(catalogue);
		
		catalogue.ajouter("qwerty", 3);
		catalogue.changerPrix(catalogue.get("qwerty").getIdentifiant(), 33);		

		System.out.println(catalogue);
		
		if(catalogue.get("azerty") == null ) System.out.println("Collector azerty inconnu");
		
		catalogue.enlever(5, catalogue.get("qwerty").getIdentifiant());

		System.out.println(catalogue);

		int prixTotal = 0;
		String[] identifiants = catalogue.getIdentifiants();
		for(int idx = 0; idx < identifiants.length; idx++) {
			prixTotal += catalogue.get(identifiants[idx]).getNbExemplaires()*catalogue.get(identifiants[idx]).getPrix();
		}
		System.out.println("Valeur marchande totale = "+prixTotal);
	}

}
