package Ex2;

import java.util.Scanner;

public class Ex2 {
    public  static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.print("Introdu un numar: ");
        int numar = obj.nextInt();

        if (numar > 0) {
            System.out.println("Numarul este pozitiv.");
        } else if (numar < 0) {
            System.out.println("Numarul este negativ.");
        } else {
            System.out.println("Numarul este zero.");
        }
    }

}
