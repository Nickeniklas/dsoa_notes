// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        // Press Alt+Enter with your caret at the highlighted text to see how
        // IntelliJ IDEA suggests fixing it.
        System.out.printf("Hello and yes åäö!");

        // Press Shift+F10 or click the green arrow button in the gutter to run the code.
        // Press Shift+F9 to start debugging your code. We have set one breakpoint
        // for you, but you can always add more by pressing Ctrl+F8.
        for (int i = 1; i <= 5; i++) System.out.println("i = " + i);
        //  DEKLARERA = vem.
        //  INITIERA eller INITIALISERA = hur mycket.
        //  INSTANSIERA = Skapar en instans, skapar ett objekt av en klass. (new x).
        //  TEX: Player player = new Player();      >vart "Player()" är klasskonstruktorn.

        //  public   static     void      main      (String[]   args)
        //  Åtkomst, nyckelord, returtyp, metodnamn, datatyp, parameter(kan innehålla argument)


        //  TESTAR klassen Car
        //  instansiering av objekt
        Car caddyCar = new Car("Caddy");
        Car volvoCar = new Car("VolvoD24");

        Bike shittyBike = new Bike("2wheels");
        System.out.println(caddyCar.getName());
        System.out.println(volvoCar.getName());

        volvoCar.setName("kööööööööööl");
        System.out.println(volvoCar.getName());

        System.out.println(shittyBike.getName() + " " + shittyBike.getType());

        //  LEKTIONS UPGIFT
        Shirt shirt = new Shirt("Gucci-jacket");
        System.out.println(shirt.getBrand() + " " + shirt.getType() + " " + shirt.getPrice());

        shirt.setBrand("LV");
        shirt.setPrice("69$");
        shirt.setType("not-a-shirt");
        System.out.println(shirt.getBrand() + " " + shirt.getType() + " " + shirt.getPrice());
    }
}

