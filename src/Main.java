import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        new BigO();

        String[] moominCharacters = {"Moomintroll", "Snufkin", "Snorkmaiden", "Little My", "Moominmamma", "Moominpappa", "Sniff", "Hemulen", "Snork", "Fillyjonk", "Too-Ticky"};

        StringArray strArrMoomin = new StringArray(moominCharacters);

        //strArrMoomin.toString();

        //strArrMoomin.reverse();

        Person bob = new Person("Bob");
        Person bobiina = new Person("Bobiina", bob);
        Person boberKurwa = new Person("BoberKurwa", bobiina);

        Person current = bobiina;
        do {
            System.out.println(current.getName());
            current = current.next;
        } while(current != null);
    }
}