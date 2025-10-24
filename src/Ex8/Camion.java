package Ex8;

class Camion {
    private Pufuleti pufuleti;

    public void incarca(Pufuleti puf) {
        this.pufuleti = puf;
        System.out.println(puf.getNume() + " au fost incarcati in camion.");
    }
    public void transportaLaChisinau() {
            System.out.println("Camionul transporta " + pufuleti.getNume() + " spre Chisinau...");
    }

    public void distribuieMagazine() {
        System.out.println("Camionul a ajuns la magazinele: Metro, Nr1, Linella.");
        System.out.println(pufuleti.getNume() + " au fost livrati cu succes!");
    }
}

