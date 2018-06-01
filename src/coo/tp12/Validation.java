package coo.tp12;

import java.io.*;
import java.util.InputMismatchException;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class Validation {
    public static boolean estValide(String filename) {
        File file = new File(filename);
        try {
            Scanner scanner = new Scanner(file);
            while (scanner.hasNextLine()) {
                try {
                    String line = scanner.nextLine();
                    Scanner sc = new Scanner(line);
                    sc.useDelimiter(";");
                    //System.out.println(line);
                    try {
                        int type = sc.nextInt();
                        System.out.println(type);
                        int nombre = sc.nextInt();
                        System.out.println(nombre);
                        for(int i = 0; i < nombre; i++){
                            switch (type) {
                                case 1: {
                                    System.out.println(sc.nextBoolean());
                                    break;
                                }
                                case 2: {
                                    System.out.println(sc.nextInt());
                                    break;
                                }
                                default: {
                                    System.out.println(sc.next());
                                    break;
                                }
                            }
                        }
                    }
                    catch (InputMismatchException ime){
                        System.out.println("InputMismatchException");
                    }
                    sc.close();
                } catch (NoSuchElementException nsee) {
                    System.out.println("NoSuchElementException");
                }
            }
            scanner.close();
        }
        catch (FileNotFoundException e) {
                e.printStackTrace();
        }
        return true;
    }
}
