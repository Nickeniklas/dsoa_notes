//  exempel på en klass
public class Car {
    //  deklarerar instansvariabeln "name"
    private String name;

    public Car(String name) {
        this.name = name;
    }

    //  GETTER
    public String getName() {
        return name;    //  behövs inte this.name
    }

    //  SETTER
    public void setName(String name) {
        this.name = name;
    }
}
