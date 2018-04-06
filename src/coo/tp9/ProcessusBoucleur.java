package coo.tp9;

public class ProcessusBoucleur implements Processus, Prioritaire{
    private final static int PRIORITE = 2;
    private int nbExecution;
    private final String msg;

    public ProcessusBoucleur(String msg, int nbExecution) {
        this.msg = msg;
        this.nbExecution = nbExecution;
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
        return this.nbExecution < 1;
    }
    @Override
    public String toString() {
        return "\nProcessus Boucleur: " +
                "\n\t Priorité     = " + PRIORITE +
                "\n\t Nb Execution = " + nbExecution+
                "\n\t message      = " + msg+"\n";
    }
}
