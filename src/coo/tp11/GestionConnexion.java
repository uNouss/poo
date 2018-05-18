package coo.tp11;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class GestionConnexion {
    public final static String loginCorrect = "login";
    public final static String pwdCorrect = "PASS";

    public void getUserPwd() throws IOException, NumberFormatException, WrongLoginException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.print("USER: ");
        String login = br.readLine();
        System.out.print("PASS: ");
        String pass = br.readLine();
        if ( !login.equals(loginCorrect)){
            throw new WrongLoginException();
        } else if ( !pass.equals(pwdCorrect)){
            throw new WrongLoginException();
        }
    }

    public static void main(String[] args) {
        GestionConnexion gc = new GestionConnexion();
        try {
            gc.getUserPwd();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (WrongLoginException e) {
            e.printStackTrace();
        }
    }
}
