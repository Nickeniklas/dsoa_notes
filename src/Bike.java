public class Bike extends Vechicle {

    public Bike(String name) {
        super(name, "Pedals");
    }

    @Override
    public void warningSound() {
        System.out.println("Pling-Plong");
    }

}
