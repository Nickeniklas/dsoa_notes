// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        // Press Alt+Enter with your caret at the highlighted text to see how
        // IntelliJ IDEA suggests fixing it.
        System.out.printf("Hello and yes åäö!");

        // Press Shift+F10 or click the green arrow button in the gutter to run the code.
        for (int i = 1; i <= 5; i++) {

            // Press Shift+F9 to start debugging your code. We have set one breakpoint
            // for you, but you can always add more by pressing Ctrl+F8.
            System.out.println("i = " + i);
        }
        //  DEKLARERA = vem.
        //  INITIERA eller INITIALISERA = hur mycket.
        //  INSTANSIERA = Skapar en instans, skapar ett objekt av en klass. (new x).
        //  TEX: Player player = new Player();      >vart "Player()" är klasskonstruktorn.

        //  public   static     void      main      (String[]   args)
        //  Åtkomst, nyckelord, returtyp, metodnamn, datatyp, parameter(kan innehålla argument)


        //  TESTAR klassen Car
        //  instansiering av objekt
        Car car = new Car("Caddy");
        Car fastCar = new Car("VolvoD24");

        System.out.println(car.getName());
        System.out.println(fastCar.getName());

        fastCar.setName("kööööööööööl");
        System.out.println(fastCar.getName());

    }
}

