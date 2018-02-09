package tp0;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestHallOfFame {

	@Test(timeout=1000)
	public void initial_devrait_etre_0() {
		HallOfFame hall = new HallOfFame() ;
		assertEquals(0, hall.lireScore(0)) ;
		assertEquals("", hall.lireNom(0)) ;	
	}

	@Test(timeout=1000)
	public void unique_devrait_etre_au_sommet() {
		HallOfFame hall = new HallOfFame() ;
		hall.enregistrer(5, "Alain");
		assertEquals(5, hall.lireScore(0)) ;
		assertEquals("Alain", hall.lireNom(0)) ;
		assertEquals(0, hall.lireScore(1)) ;
		assertEquals("", hall.lireNom(1)) ;
		assertEquals(0, hall.lireScore(2)) ;
		assertEquals("", hall.lireNom(2)) ;		
	}

	@Test(timeout=1000)
	public void double_croissant_devrait_etre_Bruno_Alain() {
		HallOfFame hall = new HallOfFame() ;
		hall.enregistrer(5, "Alain");
		hall.enregistrer(8, "Bruno");
		
		assertEquals(8, hall.lireScore(0)) ;
		assertEquals("Bruno", hall.lireNom(0)) ;
		assertEquals(5, hall.lireScore(1)) ;
		assertEquals("Alain", hall.lireNom(1)) ;
		
		assertEquals(0, hall.lireScore(2)) ;
		assertEquals("", hall.lireNom(2)) ;	
	}

	@Test(timeout=1000)
	public void double_egaux_devrait_etre_Alain_Bruno() {
		HallOfFame hall = new HallOfFame() ;
		hall.enregistrer(9, "Alain");
		hall.enregistrer(9, "Bruno");

		assertEquals(9, hall.lireScore(0)) ;
		assertEquals("Alain", hall.lireNom(0)) ;
		
		assertEquals(9, hall.lireScore(1)) ;
		assertEquals("Bruno", hall.lireNom(1)) ;
		
		assertEquals(0, hall.lireScore(2)) ;
		assertEquals("", hall.lireNom(2)) ;	
	}

	@Test(timeout=1000)
	public void double_decroissant_devrait_etre_Alain_Bruno() {
		HallOfFame hall = new HallOfFame() ;
		hall.enregistrer(15, "Alain");
		hall.enregistrer(8, "Bruno");
		
		assertEquals(15, hall.lireScore(0)) ;
		assertEquals("Alain", hall.lireNom(0)) ;

		assertEquals(8, hall.lireScore(1)) ;
		assertEquals("Bruno", hall.lireNom(1)) ;
		
		assertEquals(0, hall.lireScore(2)) ;
		assertEquals("", hall.lireNom(2)) ;	
	}

	@Test(timeout=1000)
	public void quadruple_devrait_etre_Alain_Charles_Denis() {
		HallOfFame hall = new HallOfFame() ;
		hall.enregistrer(15, "Alain");
		hall.enregistrer(8, "Denis");
		hall.enregistrer(3, "Bruno");
		hall.enregistrer(12, "Charles");
		
		assertEquals(15, hall.lireScore(0)) ;
		assertEquals("Alain", hall.lireNom(0)) ;

		assertEquals(12, hall.lireScore(1)) ;
		assertEquals("Charles", hall.lireNom(1)) ;
		
		assertEquals(8, hall.lireScore(2)) ;
		assertEquals("Denis", hall.lireNom(2)) ;
	}

	@Test(timeout=1000)
	public void quadruple_egaux_devrait_etre_Alain_Bruno_Charles() {
		HallOfFame hall = new HallOfFame() ;
		hall.enregistrer(20, "Alain");
		hall.enregistrer(20, "Bruno");
		hall.enregistrer(20, "Charles");
		hall.enregistrer(20, "Denis");
		
		assertEquals(20, hall.lireScore(0)) ;
		assertEquals("Alain", hall.lireNom(0)) ;

		assertEquals(20, hall.lireScore(1)) ;
		assertEquals("Bruno", hall.lireNom(1)) ;
		
		assertEquals(20, hall.lireScore(2)) ;
		assertEquals("Charles", hall.lireNom(2)) ;
	}
}
