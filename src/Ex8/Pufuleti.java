package Ex8;

public class Pufuleti {
    private String nume;

    public Pufuleti(String nume) {
        this.nume = nume;
    }

    public String getNume() {
        return nume;
    }

    public void setNume(String numeNou) {
        nume = numeNou;
    }

    @Override
    public String toString() {
        return "Pufuleti{" +
                "nume='" + nume + '\'' +
                '}';
    }

    public void afiseazaLocatia(String locatie) {
        System.out.println(nume + " se afla acum la " + locatie + ".");
    }
}

