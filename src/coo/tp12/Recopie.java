package coo.tp12;

import java.io.*;

public class Recopie {
    public static void main(String[] args) {
        BufferedReader src;
        PrintWriter dest;
        try {
            if (args.length != 2) {
                throw new UsageIncorrectException();
            }
            src = new BufferedReader(new FileReader("ressource/"+args[0]));

            File out = new File("ressource/"+args[1]);
            if(out.isFile() && out.exists()){
                throw new FichierDejaExistant();
            }

            dest = new PrintWriter("ressource/"+args[1]);

            String line = src.readLine();
            while(line != null){
                dest.println(line);
                line = src.readLine();
            }
            src.close();
            dest.close();
        }catch (UsageIncorrectException uie){
            System.out.println("USAGE: java Recopie FILE_SRC FILE_DEST");
            System.exit(127);
        }
        catch (FileNotFoundException fnfe){
            System.out.println ("Fichier introuvable");
        }
        catch (FichierDejaExistant fichierDejaExistant) {
            System.out.println ("Fichier déjà éxistant");
        }
        catch (IOException e) {
            e.printStackTrace();
        }
    }
}
