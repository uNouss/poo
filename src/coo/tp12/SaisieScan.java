package coo.tp12;

import java.io.File;
import java.io.FileNotFoundException;
import java.time.LocalDate;
import java.util.InputMismatchException;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class SaisieScan {
    private static final String PROMPT = "Saisir un entier ou \"bye\" pour quitter > ";
    public static void main(String[] args) {
        /*System.out.print(PROMPT);
        Scanner scanner = new Scanner(System.in);
        String saisie = scanner.nextLine();
        int res = 0;
        while(!"bye".equals(saisie.toLowerCase())){
            if(saisie.equals("[0-9][0-9]*]")) res += Integer.parseInt(saisie);
            System.out.print(PROMPT);
            saisie = scanner.nextLine();
        }
        scanner.close();
        System.out.println("la somme est : " + res);*/

        try {
            Scanner sc = new Scanner(new File("ressource/annuaire.txt"));
            String personne;
            try {
                while(sc.hasNext()) {
                    try {
                        System.out.println(sc.next() + " " + (LocalDate.now().getYear() - sc.nextInt()) + " ans");
                    }
                    catch (InputMismatchException ime){
                        System.out.println("C'est pas un entier ");
                    }
                }
            } catch (NoSuchElementException nsee) {
                System.out.println("Fin de fichier atteint");
            }
        }
        catch(FileNotFoundException fnfe) {fnfe.printStackTrace();}
    }
}
