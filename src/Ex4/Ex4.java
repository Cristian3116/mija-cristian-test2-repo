package Ex4;

import java.util.Scanner;

public class Ex4 {

    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.println("Introdu trei numere: ");

        System.out.print("Primul numar: ");
        int num1 = obj.nextInt();

        System.out.print("Al doilea numar: ");
        int num2 = obj.nextInt();

        System.out.print("Al treilea numar: ");
        int num3 = obj.nextInt();

        if (num1 == num2 && num2 == num3) {
            System.out.println("Toate numerele sunt egale");
        } else if (num1 != num2 && num2 != num3 && num1 != num3) {
            System.out.println("Toate numerele sunt diferite");
        } else {
            System.out.println("Nici nu sunt egale, nici diferite");
        }
    }

}