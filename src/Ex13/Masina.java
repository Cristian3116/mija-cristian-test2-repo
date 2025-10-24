package Ex13;

class Masina extends Vehicul {
    public Masina(String model) {
        super(model);
    }

    @Override
    public void porneste() {
        System.out.println("Masina " + getModel() + " porneste usor.");
    }
}
