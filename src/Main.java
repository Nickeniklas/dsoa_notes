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
    }
}

