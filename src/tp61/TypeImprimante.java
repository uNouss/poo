package tp61;

public enum TypeImprimante {
    matricielle ('M'),
    jetencre ('J'),
    laser ('L'),
    sublimation ('S'),
    troisd ('D');

    private final char type;


    private TypeImprimante(char type) {
        this.type = type;
    }
    public char getType(){
        return this.type;
    }
}
