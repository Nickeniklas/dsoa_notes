import java.util.Random;

public class Bike extends Vehicle implements ShopFeatures {

    private double price = 0;
    DiscountCategory discountCat;

    public Bike(String name) {
        super(name, "Pedaled");
        discountCat = DiscountCategory.NEW;
    }
    public Bike(String name, double price) {
        super(name, "Pedaled");
        this.price = price;
        discountCat = DiscountCategory.NEW;
    }
    //  DISCOUNT CATEGORY
    public Bike(String name, double price, DiscountCategory discountCat){
        super(name, "loserBike");
        discountCat = DiscountCategory.NEW;
    }
    // Static factory method
    static Bike createExpensiveBike(String name) {
        double price = (new Random()).nextInt(800, 1500);
        return new Bike(name, price);
    }

    @Override
    public void soundWarning() {
        System.out.println("Pling-pling");
    }

    @Override
    public String getProductNumber() {
        return null;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        try {
            if (price <= 0) {
                throw new IllegalArgumentException();
            }
            this.price = price;

        } catch (IllegalArgumentException e) {
            System.out.println("Priset måste vara positivt!");
        }

    }

}