package coo.tp14;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class XorBinaireTest {
    Entree A;
    Entree B;

    XorBinaire S;

    @Before
    public void setUp() throws Exception {
        A = new Entree();
        B = new Entree();
        S = new XorBinaire();
        S.connectA(A);
        S.connectB(B);
    }

    @Test
    public void test0(){
        this.A.setValeur(false);
        this.B.setValeur(false);
        this.S.activer();
        assertFalse(S.sortie.valeur);
    }

    @Test
    public void test1(){
        this.A.setValeur(false);
        this.B.setValeur(true);
        this.S.activer();
        assertTrue(S.sortie.valeur);
    }

    @Test
    public void test2(){
        this.A.setValeur(true);
        this.B.setValeur(false);
        this.S.activer();
        assertTrue(S.sortie.valeur);
    }

    @Test
    public void test3(){
        this.A.setValeur(true);
        this.B.setValeur(true);
        this.S.activer();
        assertFalse(S.sortie.valeur);
    }
}