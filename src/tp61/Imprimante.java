package tp61;

public class Imprimante{
    private String reference;
    private TypeImprimante type;
    private String nomPublic;
    private ICollCartouches lesPossible;

    public Imprimante(String reference, TypeImprimante type, String nomPublic, ICollCartouches lesPossible) {
        this.reference = reference;
        this.type = type;
        this.nomPublic = nomPublic;
        this.lesPossible = lesPossible;
    }

    public int getNbCartouchesCompatibles(){
        return lesPossible.getNbCartouches();
    }

    @Override
    public String toString() {
        return reference + ':' + type+'('+type.getType()+")\t"+lesPossible.getNbCartouches();
    }

    public String getReference() {
        return reference;
    }

    public void setReference(String reference) {
        this.reference = reference;
    }

    public TypeImprimante getType() {
        return type;
    }

    public void setType(TypeImprimante type) {
        this.type = type;
    }

    public String getNomPublic() {
        return nomPublic;
    }

    public void setNomPublic(String nomPublic) {
        this.nomPublic = nomPublic;
    }

    public ICollCartouches getLesPossible() {
        return lesPossible;
    }

    public void setLesPossible(ICollCartouches lesPossible) {
        this.lesPossible = lesPossible;
    }

    public void addCartouche(Cartouche c){
        this.lesPossible.addCartouche(c);
    }
}
