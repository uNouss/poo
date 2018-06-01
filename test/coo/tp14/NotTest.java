package coo.tp14;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class NotTest {
    Entree src;
    Not not;

    @Before
    public void setUp() {
        this.src = new Entree();
        this.not = new Not();
        this.not.connect(src);
    }

    @After
    public void tearDown() {
    }

    @Test
    public void test0(){
        this.src.setValeur(false);
        this.not.activer();
        assertTrue(not.sortie.valeur);
    }

    @Test
    public void test1(){
        this.src.setValeur(true);
        this.not.activer();
        assertFalse(not.sortie.valeur);
    }
}