package Ex14;

import java.util.Scanner;

public class Ex14 {

    static void verificaVarsta() throws Exception {
        System.out.print("Introdu varsta: ");
        Scanner intr = new Scanner(System.in);
     byte varsta = intr.nextByte();
        if (varsta < 18) {
            throw new Exception("Eroare: varsta prea mica pentru acces!");
        } else {
            System.out.println("Acces permis.");
        }
    }

    public static void main(String[] args) {
        try {
            verificaVarsta();
        } catch (Exception e) {
            System.out.println("Exceptie prinsa: \n" + e.getMessage());
        }
    }

}
