package coo.tp14;

public abstract class PorteBinaire implements Porte,Source{
    protected Borne sortie;
    protected Borne entreeA;
    protected Borne entreeB;

    public PorteBinaire() {
        this.entreeA = null;
        this.entreeB = null;
        this.sortie = new Borne(this);
    }

    protected abstract boolean fontionLogique(boolean x, boolean y);

    public void connectA(Borne borne){
        this.entreeA = borne;
    }

    public void connectA(Source source){
        this.entreeA = source.getBorne();
    }

    public void connectB(Borne borne){
        this.entreeB = borne;
    }

    public void connectB(Source source){
        this.entreeB = source.getBorne();
    }

    @Override
    public void activer() {
        if(this.entreeA != null && this.entreeB != null ) {
            this.sortie.valeur = fontionLogique(entreeA.valeur, entreeB.valeur);
        }
    }

    public Borne getBorne(){
        return this.sortie;
    }
}
