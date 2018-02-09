package tp11;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class TestCarte {

	public Carte c1;
	public Carte c2;
	public Carte c3;
	public Carte c4;
	
	@BeforeClass
	public static void avantTest() {
		System.out.println("Début de la série de test");
	}
	
	@Before
	public void avantUnTest() {
		c1 = new Carte(0, 4);
		c2 = new Carte(0, 4);
		c3 = new Carte(1, 2);
		System.out.print("Début du test");
	}
	
	@After
	public void apresUnTest() {
		System.out.println("--- fin d'un test ----------------------");
	}
	
	@AfterClass
	public static void apresTest() {
		System.out.println("Fin de la série de test");
	}
	
	@Test
	public void testGetCouleur() {
		System.out.println(" testGetCouleur");
		assertTrue(c1.getCouleur()==0);
		assertFalse(c1.getCouleur()==1);
		assertEquals(c1.getCouleur(), c1.getCouleur());
	}

	@Test
	public void testGetRang() {
		System.out.println(" testGetRang");
		assertSame(c1,c1);
		assertNotSame(c1,c2);
		assertTrue(c3.getRang() < c2.getRang());
		assertNull(c4);
	}

	@Test
	public void testEqualsCarte() {
		System.out.println(" testEqualsCarte");
		assertEquals(c1,c1);
		assertNotEquals(c1,c2);
	}

	@Test
	public void testToString() {
		System.out.println(" testToString");
		assertEquals(new String("Valet de Trèfle"), c1.toString());
		assertFalse("Valet de Trèfle" == c1.toString());
	}

}
