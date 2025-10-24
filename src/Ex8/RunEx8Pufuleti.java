package Ex8;

public class RunEx8Pufuleti {
    public static void main(String[] args) {

        Fabrica fabrica = new Fabrica();

        Pufuleti p = fabrica.producePufuleti();
        p.afiseazaLocatia("fabrica de productie");


        Camion camion = new Camion();
        camion.incarca(p);

        camion.transportaLaChisinau();

        camion.distribuieMagazine();
    }
}
