package tp61;

import java.util.ArrayList;
import java.util.List;

public class ListCartouches implements ICollCartouches{
    private List<Cartouche> lc;

    public ListCartouches(){
        this.lc = new ArrayList<>();
    }
    public ListCartouches(Cartouche[] desCartouches){
        for(Cartouche c: desCartouches){
            this.lc.add(c);
        }
    }
    @Override
    public void addCartouche(Cartouche maCartouche) {
        this.lc.add(maCartouche);
    }

    @Override
    public int getNbCartouches() {
        return dernierElt();
    }

    @Override
    public Cartouche getCartouche(int i) {
        if( i >= 0 && i < this.lc.size()) return this.lc.get(i);
        else return null;
    }

    private int dernierElt(){
        return this.lc.size();
    }
}
