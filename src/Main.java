import java.util.Scanner;

public class Main {

    public static void main(String[] args) {


        //FileUtils.writeTextFile("Hellöu", "hello.txt");
        //String fileContent = FileUtils.readTextFile("hello.txt");
        //System.out.println(fileContent);

        //  SPAWN NEW CUSTOMER
        Customer customer = new Customer(4200);

        BikeShop shop = new BikeShop();
        shop.addBike(new Bike("Scott", 500, DiscountCategory.DEMO));
        shop.addBike(Bike.createExpensiveBike("Nishiki"));
        shop.addBike(new Bike("Jopo", Utils.getRandomPrice()));

        System.out.println("Välj cykel att köpa:");
        for (int i = 0; i < shop.getBikes().size(); i++) {
            Bike b = shop.getBikes().get(i);
            System.out.printf("[%d] %s kostar %.2f\n",
                    i,
                    b.getName(),
                    b.getPrice()
            );
        }

        // Code Challenge: input
        Bike bikeToBuy = shop.chooseBike();

        customer.buyBike(bikeToBuy);

        System.out.printf("Your bike:  %s\nFunds left: %.0f",
                bikeToBuy.getName(),
                customer.getFunds()
        );
    }
}