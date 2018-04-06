package coo.tp9;

import tp12.Saisie;

public class ProcessusLectureEcriture implements Processus, Prioritaire{
    private final static int PRIORITE = 1;
    private int nbExecution = 2;
    private String msg;

    @Override
    public int getPriorite() {
        return this.PRIORITE;
    }

    @Override
    public void execute() {
        switch (nbExecution) {
            case 2:
                Saisie scanner = new Saisie();
                this.msg = scanner.saisieChaine("Saisir message");
                this.nbExecution--;
                break;
            case 1:
                System.out.println(this.msg);
                this.nbExecution--;
                break;
        }
    }

    @Override
    public boolean estFini() {
        return this.nbExecution < 1;
    }

    @Override
    public String toString() {
        return "\nProcessus Lecture Ecriture: " +
                "\n\t Priorité     = " + PRIORITE +
                "\n\t Nb Execution = " + nbExecution+
                "\n\t message      = " + msg+"\n";
    }
}
