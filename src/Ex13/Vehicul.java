package Ex13;

public class Vehicul {
    private String model; // incapsulare
    public Vehicul(String model) {
        this.model = model;
    }
    public String getModel() {
        return model;
    }
    public void porneste() {
        System.out.println("Vehiculul porneste...");
    }
}
