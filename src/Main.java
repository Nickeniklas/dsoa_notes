import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        //new BigO();

        String[] moominCharacters = {"Moomintroll", "Snufkin", "Snorkmaiden", "Little My", "Moominmamma", "Moominpappa", "Sniff", "Hemulen", "Snork", "Fillyjonk", "Too-Ticky"};
        StringArray strArrMoomin = new StringArray(moominCharacters);
        //strArrMoomin.toString();
        //strArrMoomin.reverse();

        Stacky stacky = new Stacky(3);
        stacky.push(moominCharacters[0]);
        stacky.push(moominCharacters[5]);
        stacky.push(moominCharacters[6]);
        stacky.push(moominCharacters[2]);

        System.out.println(stacky);

    }
}