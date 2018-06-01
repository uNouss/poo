package coo.tp14;

public class CircuitAND3 implements Porte,Source{
    public Borne sortie;
    public AndBinaire and1;
    public AndBinaire and2;

    public CircuitAND3() {
        this.and1 = new AndBinaire();
        this.and2 = new AndBinaire();
        this.and2.connectA(and1.getBorne());
        this.sortie = and2.getBorne();
    }

    public void connectA(Borne borne){
        this.and1.connectA(borne);
    }

    public void connectA(Source source){
        this.and1.connectA(source);
    }

    public void connectB(Borne borne){
        this.and1.connectB(borne);
    }

    public void connectB(Source source){
        this.and1.connectB(source);
    }

    public void connectC(Borne borne){
        this.and2.connectB(borne);
    }

    public void connectC(Source source){
        this.and2.connectB(source);
    }
    @Override
    public void activer() {
        if(this.and2 != null ) {
            this.and2.activer();
        }
    }

    @Override
    public Borne getBorne() {
        return this.sortie;
    }
}
