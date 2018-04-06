package coo.tp9;

public class ProcessusAfficheur implements Processus, Prioritaire{
    private final static int PRIORITE = 3;
    private int nbExecution = 1;
    private final String msg;

    public ProcessusAfficheur(String msg) {
        this.msg = msg;
    }

    @Override
    public int getPriorite() {
        return this.PRIORITE;
    }

    @Override
    public void execute() {
        System.out.println(this.msg);
        this.nbExecution--;
    }

    @Override
    public boolean estFini() {
        return nbExecution < 1;
    }

    @Override
    public String toString() {
        return "\nProcessus Afficheur: " +
                "\n\t Priorité     = " + PRIORITE +
                "\n\t Nb Execution = " + nbExecution+
                "\n\t message      = " + msg+"\n";
    }
}
