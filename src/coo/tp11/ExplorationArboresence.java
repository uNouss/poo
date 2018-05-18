package coo.tp11;

import java.io.File;
import java.io.IOException;

public class ExplorationArboresence {
    public static void afficheContenu(String path){
    }

    private static boolean valid(String path) {
        return path.matches("(/?[a-b]+)+");
    }

    public static void main(String[] args) throws IOException {
        File file = new File("tata.txt");
        System.out.println(file);
        System.out.println(file.getParent());
    }
}
