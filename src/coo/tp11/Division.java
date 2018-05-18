package coo.tp11;

public class Division {
    public static void main(String[] args) {
        int x = Integer.parseInt(args[0]), y = Integer.parseInt(args[1]);
        try {
            System.out.println(x+"/"+y+"="+division(x, y));
        }
        catch (ArithmeticException e) {
            System.out.println("Division par 0 interdit");
            y = 1;
            System.out.println(x+"/"+y+"="+division(x, y));
        }

    }

    private static int division(int x, int y) {
        return x/y;
    }
}
