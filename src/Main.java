import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        //new BigO();

        String[] moominCharacters = {"Moomintroll", "Snufkin", "Snorkmaiden", "Little My", "Moominmamma", "Moominpappa", "Sniff", "Hemulen", "Snork", "Fillyjonk", "Too-Ticky"};
        StringArray strArrMoomin = new StringArray(moominCharacters);
        //strArrMoomin.toString();
        //strArrMoomin.reverse();

        Stacky stacky = new Stacky(7);
        stacky.push(moominCharacters[0]);
        stacky.push(moominCharacters[5]);
        stacky.push(moominCharacters[6]);
        stacky.push(moominCharacters[2]);

        System.out.println(stacky);


        //  CODE CHALLENGE Circular array
        int today = 1;
        int futureDay = 6;
        int futureDay2 = 15;
        System.out.printf("I dag är det %s\n",CircArr.CircArrWeekDays(today));
        System.out.printf("Om %d är det %s\n", futureDay,
                CircArr.CircArrWeekDays(today + futureDay));
        System.out.printf("Om %d är det %s\n", futureDay2,
                CircArr.CircArrWeekDays(today + futureDay2));

    }
}