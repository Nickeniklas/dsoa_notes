//  exempel på en klass
public class Car extends Vechicle {

    private double discount = 0.9; // 10%
    private double price = 1000;
    private int fuel;

    public Car(String name) {
        super(name, "Ground Vechicle");
    }
    public void warningSound() {
        System.out.println("Tuut TUUUUT");
    }
    public void refuel() {
        this.fuel = 100;
    }

    //  GETTERS
    public double getPrice() {
        return price * discount;
    }
    public int getFuel() {
        return fuel;
    }
}
