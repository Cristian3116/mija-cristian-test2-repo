package Ex1;

public class Ex1 {
    public static void main(String[] args) {
        byte valoareByte = 100;
        short rezultatShort = valoareByte;
        System.out.println("Din byte în short: " + rezultatShort);


        int valoareInt = 123116;
        double rezultatDouble = valoareInt;
        System.out.println("Din int în double: " + rezultatDouble);


        long valoareLong = 1000000L;
        int rezultatInt = (int) valoareLong;
        System.out.println("Din long în int: " + rezultatInt);
    }
}
