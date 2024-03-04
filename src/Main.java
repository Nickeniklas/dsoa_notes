import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        String[] lotrCharacters = {"Frodo", "Samwise", "Gandalf", "Aragorn", "Legolas", "Gimli", "Boromir", "Gollum", "Saruman", "Galadriel", "Elrond", "Glorfindel", "Bilbo", "Merry", "Pippin", "Treebeard", "Faramir", "Éowyn", "Éomer", "Grima"};

        ArrayList<Person> persons = new ArrayList<>();
        for (int i = 0; i < lotrCharacters.length; i++) {
            persons.add(new Person(lotrCharacters[i], i));

        }

        System.out.println(persons);

        Collections.sort(persons);

        System.out.println(persons);

        Recursy.loop(3, 420);
    }
}