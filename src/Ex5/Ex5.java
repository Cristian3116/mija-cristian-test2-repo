package Ex5;

public class Ex5 {
    public static void main(String[] args) {

        int[] numere = {2, 3, 7, 9, 11, 10};
        int suma = 0;


        for (int i = 0; i < numere.length; i++) {
            suma = suma + numere[i];
        }

        System.out.println("Suma elementelor este: " + suma);
    }
}
