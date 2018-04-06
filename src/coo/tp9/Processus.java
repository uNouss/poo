package coo.tp9;

public interface Processus {
    /**
     * Exécute le comportement du processus.
     */
    void execute();

    /**
     * Retourne true si le processus n’a plus à être exécuté, i.e., si la méthode execute a été invoquée autant de fois que nécessaire.
     * @return True ou False
     */
    boolean estFini();
}
