public class Vechicle {
    private String name;
    private String type;

    public Vechicle(String name, String type) {
        this.name = name;
        this.type = type;
    }

    //  GETTER
    public String getName() {
        return name;    //  behövs inte this.name
    }
    public String getType() {
        return type;
    }
    //  SETTER
    public void setName(String name) {
        this.name = name;
    }
}
