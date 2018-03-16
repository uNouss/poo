package tp61;

import java.util.ArrayList;
import java.util.List;

public class TabCartouches implements ICollCartouches{
    private Cartouche[] mesCartouches;
    private int idx = -1;
    private final int TAILLE_MAX = 3;

    public TabCartouches(){
        this.mesCartouches = new Cartouche[TAILLE_MAX];
    }
    public TabCartouches(Cartouche[] desCartouches){
        this();
        if( desCartouches.length <= TAILLE_MAX) {
            this.mesCartouches = desCartouches;
        }
    }
    @Override
    public void addCartouche(Cartouche maCartouche) {
        int last = dernierElt();
        if(last < TAILLE_MAX) {
            mesCartouches[last] = maCartouche;
            idx++;
        }
    }

    @Override
    public int getNbCartouches() {
        return dernierElt();
    }

    @Override
    public Cartouche getCartouche(int i) {
        if( i >= 0 && i < mesCartouches.length) return mesCartouches[i];
        else return null;
    }

    private int dernierElt(){
        return this.idx+1;
    }
}
