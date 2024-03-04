public class Person implements Comparable<Person> {

    String name;
    Person next = null;
    int rank;

    public Person(String name) {
        this.name = name;
    }

    public Person(String name, Person next) {
        this.next = next;
    }

    public Person (String name, int rank) {
        this.name = name;
        this.rank = rank;

    }

    public String getName() {
        return name;
    }

    public Person getNext() {
        return next;
    }

    @Override
    public int compareTo(Person otherPerson) {
        return name.compareTo(otherPerson.getName());
    }

    @Override
    public String toString() {
        return name + " " + rank;

    }

    public int getRank() {
        return rank;
    }
}
