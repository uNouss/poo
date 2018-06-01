package coo.tp14;

public class CircuitBinaireNAND implements Porte,Source{
    public Borne sortie;
    public AndBinaire and;
    public Not not;

    public CircuitBinaireNAND() {
        this.and = new AndBinaire();
        this.not = new Not();
        this.not.connect(and.getBorne());
        this.sortie = not.getBorne();
    }

    public void connectA(Borne borne){
        this.and.connectA(borne);
    }

    public void connectA(Source source){
        this.and.connectA(source);
    }

    public void connectB(Borne borne){
        this.and.connectB(borne);
    }

    public void connectB(Source source){
        this.and.connectB(source);
    }

    @Override
    public void activer() {
        if(this.not != null ) {
            this.not.activer();
        }
    }

    @Override
    public Borne getBorne() {
        return this.sortie;
    }
}
