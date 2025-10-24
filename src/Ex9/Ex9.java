package Ex9;

public class Ex9 {
    static int calculeazaPerimetrul(int latura) {
        return 4 * latura;
    }

    public static void main(String[] args) {
        int perimetru = calculeazaPerimetrul(8);
        System.out.println("Perimetrul este: " + perimetru + " cm");
    }
}
