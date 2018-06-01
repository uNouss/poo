package coo.tp14;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class CircuitBinaireNANDTest {
    Entree A;
    Entree B;

    CircuitBinaireNAND nand;

    @Before
    public void setUp() throws Exception {
        A = new Entree();
        B = new Entree();
        nand = new CircuitBinaireNAND();
        nand.connectA(A);
        nand.connectB(B);
    }

    @Test
    public void test0(){
        A.setValeur(false);
        B.setValeur(false);
        this.nand.activer();
        assertTrue(nand.sortie.valeur);
    }

    @Test
    public void test1(){
        A.setValeur(false);
        B.setValeur(true);
        this.nand.activer();
        assertTrue(nand.sortie.valeur);
    }

    @Test
    public void test2(){
        A.setValeur(true);
        B.setValeur(false);
        this.nand.activer();
        assertTrue(nand.sortie.valeur);
    }

    @Test
    public void test3(){
        A.setValeur(true);
        B.setValeur(true);
        this.nand.activer();
        assertFalse(nand.sortie.valeur);
    }
}