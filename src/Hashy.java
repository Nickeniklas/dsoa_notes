public class Hashy {
    //  variables
    private Person[] hashTable;
    private int size;
    int totalCollisions = 0;

    //  constructor
    public Hashy(int dataSize) {
        size = dataSize * 10;
        hashTable = new Person[size];
    }

    //  hash/create hash
    public int hash(String str) {
        int ret = 0;
        for (int i = 0; i < str.length(); i++) {
            //      typecast to ASCII
            ret += ((int) str.charAt(i)) * 9.8;
        }
        return ret % size;
    }

    //  add/insert
    public void add(Person person) {
        int idx = hash(person.getName());
        int collisions = 0;

        while(hashTable[idx] != null) {
            idx++;
            collisions++;
            System.out.println("COLLISION!");
        }
        hashTable[idx] = person;
        totalCollisions += collisions;

        System.out.printf("Add %s, at idx %d %s\n",
                person.getName(),
                idx,
                (collisions > 0) ? collisions + " COLLISIONS" : ""
        );

    }

    //  search/find
    public Person search(String name) {
        int idx = hash(name);
        int ops = 1;
        //  linear probing
        while(!hashTable[idx].getName().equals(name)) {
            idx++;
            idx = idx % size;   //circles if neccessary.
            ops++;

            //  guard statement
            if(ops > size) return null;
        }
        System.out.printf("Searched for %s ops: %d\n",
                name,
                ops
        );
        return hashTable[idx];
    }
}
