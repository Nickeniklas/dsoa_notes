//  exempel på en klass
public class Car extends Vechicle {

    //  KLASSVARIABEL, samma värde samma/ variabel inom alla klasser.
    static int carsCreated = 0;

    private double discount = 0.9; // 10%
    private double price = 1000;
    private int fuel;

    public Car(String name) {
        super(name, "Ground Vechicle");
        carsCreated++;
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
    public static int getCarsCreated() {
        return carsCreated;
    }
}
