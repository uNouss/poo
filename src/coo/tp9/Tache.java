package coo.tp9;

public class Tache implements  Prioritaire{
    private int priorite;
    private String label;

    public Tache(int priorite) {
        this.priorite = priorite;
    }

    public void setPriorite(int priorite) {
        this.priorite = priorite;
    }

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    @Override
    public String toString() {
        return "\n\tTache: [ label = " + label + " de priorité='" + priorite + " ]";
    }

    @Override
    public int getPriorite() {
        return priorite;
    }
}
