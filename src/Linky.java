public class Linky {

        Node first;
        Node last;

        private class Node {
            Person person;
            Node next;

            Node(Person person, Node next) {
                this.person = person;
                this.next = next;
            }
        }

        public void add(Person person) {
            Node n = new Node(person, null);
        }



        public void printLinky() {
            System.out.printf("Linky: " );
            Node n = first;
            while(n != null) {
                System.out.println(n.person.getName() + " ");
                n = n.next;
            }
        }
}
