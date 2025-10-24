package Ex10;

public class Ex10 {

    public static void main(String[] args) {
        System.out.println("Se afiseaza numerele impare de la 18 la 32");
        for (int i = 18; i <= 32; i++) {
            if (i % 2 != 0) {
                System.out.println(i);
            }
        }
    }

}
