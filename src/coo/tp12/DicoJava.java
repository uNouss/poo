package coo.tp12;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class DicoJava {
    public static void main(String[] args) {
        List<String> motcles = new ArrayList<>();
        try {
            BufferedReader br = new BufferedReader(new FileReader("ressource/DicoJava.txt"));
            try {
                String line = br.readLine();
                while (line != null) {
                    String mot = line.split("\t")[0];
                    motcles.add(mot);
                    line = br.readLine();
                }
                br.close();
            } catch (IOException ioe) {
                System.out.println("Erreur de lecture:" + ioe.getMessage());
            }
        } catch (FileNotFoundException fnfe) {
            System.out.println("Fichier introuvable");
        }
        Collections.sort(motcles);
        try {
            PrintWriter pw = new PrintWriter("ressource/MotsJava.txt");
            for(String mot: motcles)
                pw.println(mot);
            pw.close();
        } catch (IOException ioe) {
            ioe.printStackTrace();
        }
    }
}
