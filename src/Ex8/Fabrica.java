package Ex8;

class Fabrica  {

    Pufuleti obj = new Pufuleti(toString());

    public Pufuleti producePufuleti() {
        obj.setNume("Pufuletii Cristinel si Cristinuta");

        System.out.println("Pufuletii Cristinel si Cristinuta au fost creati in fabrica!");

        return obj;
    }
}