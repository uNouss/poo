package coo.tp11;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SaisieClavier {
    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int x, y;
        boolean sortie = false;
        while( ! sortie) {
            try {
                System.out.print("x =  ");
                x = Integer.parseInt(br.readLine());
                System.out.print("y = ");
                y = Integer.parseInt(br.readLine());
                sortie = true;
                try {
                    System.out.println(x + "/" + y + "=" + x / y);
                } catch (ArithmeticException e) {
                    System.out.println("Impossible de diviser par 0");
                    System.out.println(x + "/" + 1 + "=" + x / 1);
                }
            } catch (IOException e) {
                e.printStackTrace();
            } catch (NumberFormatException ne) {
                System.out.println("Entier attendu");
            }
            System.out.println("brtrrrrrrrrrrrrrr");
        }
    }
}
