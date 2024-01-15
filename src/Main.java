import java.sql.SQLOutput;
import java.util.HashMap;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        //  instansiering av objekt
        Car caddyCar = new Car("Caddy");
        //  SKRIVER UT NAMNEN
        System.out.println(caddyCar.getName());
        //  NYTT NAMN
        caddyCar.setName("kööööööööööl");
        //  SKRIV UT
        System.out.println(caddyCar.getName());
        System.out.println(caddyCar.getPrice());

        //  LEKTIONS UPGIFT 11.1 | CODE CHALLENGE
        Shirt shirt = new Shirt("Gucci");
        System.out.println(shirt.getBrand() + " " + shirt.getType() + " " + shirt.getPrice());
        shirt.setBrand("LV");
        shirt.setPrice(69);
        shirt.setType("not-a-shirt");
        System.out.println(shirt.getBrand() + " " + shirt.getType() + " " + shirt.getPrice());

        //LEKTION 11.1
        Bike shittyBike = new Bike("2wheels");
        System.out.println(shittyBike.getName() + " " + shittyBike.getType());

        shittyBike.warningSound();
        caddyCar.warningSound();

        //  POLYMORFISM EXEMPEL | första dagens bil.
        Vechicle todaysRide = new Car("Rolls");
        System.out.println(todaysRide.getName());
        System.out.println(todaysRide.getType());
        //  FUEL EXEMPEL
        Car car = new Car("Whip");
        car.refuel();
        System.out.println(car.getFuel());

        //  NÄSTA DAG
        todaysRide = new Bike("Pedalermaster 3000");
        System.out.println(todaysRide.getName());
        System.out.println(todaysRide.getType());

        //  LEKTION 15.1
        System.out.println(shirt.getCondition());

        System.out.println("I am god and I see that " + Car.getCarsCreated() + " beautiful cars has been created!");

        /*System.out.println(String.format("Brand: %s, its has %s fuel left",
                car.getName(),
                car.getFuel())
        );
        */  //BÄTTRE SÄTT ATT SKRIVA String.format()
        System.out.printf("Brand: %s, its has %s fuel left\n",
                car.getName(),
                car.getFuel()
        );

        BikeShop bikeShop = new BikeShop();
        bikeShop.addBike(shittyBike);
        bikeShop.addBike(new Bike("Jopo"));
        for (int i = 0; i < bikeShop.getBikes().size(); i++) {
            System.out.printf("%s ",
                    bikeShop.getBikes().get(i).getName());
        }
        HashMap<String, Car> drivers = new HashMap<>();
        drivers.put("Kalle", caddyCar);
        drivers.put("Lisa", car);

        System.out.printf("\nKalle drives so that it goes %s! While Lisa drives a boring %s",
                drivers.get("Kalle").getName(),
                drivers.get("Lisa").getName());

        //  CODE CHALLENGE OVERLOADING
        Calculator calc = new Calculator();
        System.out.println("\nYour numbers equal to: " + calc.multiply(2,3));
        System.out.println("Your numbers equal to: " + calc.multiply(2,3, 4));
    }
}

