package coo.tp14;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class CircuitAND3Test {
    Entree A;
    Entree B;
    Entree C;

    CircuitAND3 and1;
    CircuitAND3 and2;

    @Before
    public void setUp() throws Exception {
        A = new Entree();
        B = new Entree();
        C = new Entree();
        and1 = new CircuitAND3();
        and2 = new CircuitAND3();
        and1.connectA(A);
        and1.connectB(B);
    }

    @Test
    public void test0(){
        A.setValeur(false);
        B.setValeur(false);
        this.and1.activer();
        assertTrue(and1.sortie.valeur);
    }

    @Test
    public void test1(){
        A.setValeur(false);
        B.setValeur(true);
        this.and1.activer();
        assertTrue(and1.sortie.valeur);
    }

    @Test
    public void test2(){
        A.setValeur(true);
        B.setValeur(false);
        this.and1.activer();
        assertTrue(and1.sortie.valeur);
    }

    @Test
    public void test3(){
        A.setValeur(true);
        B.setValeur(true);
        this.and1.activer();
        assertFalse(and1.sortie.valeur);
    }

    @Test
    public void test5(){
        A.setValeur(false);
        B.setValeur(false);
        this.and1.activer();
        assertTrue(and1.sortie.valeur);
    }

    @Test
    public void test5(){
        A.setValeur(false);
        B.setValeur(true);
        this.and1.activer();
        assertTrue(and1.sortie.valeur);
    }

    @Test
    public void test6(){
        A.setValeur(true);
        B.setValeur(false);
        this.and1.activer();
        assertTrue(and1.sortie.valeur);
    }

    @Test
    public void test7(){
        A.setValeur(true);
        B.setValeur(true);
        this.and1.activer();
        assertFalse(and1.sortie.valeur);
    }
}