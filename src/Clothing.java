abstract class Clothing {

    String brand;
    double price = 0;
    String type;

    //  GETTERS
    public String getBrand() {
        return brand;
    }
    public double getPrice() {
        return price;
    }
    public String getType() {
        return type;
    }
    //  SETTERS
    public void setBrand(String brand) {
        this.brand = brand;
    }
    public void setPrice(double price) {
        this.price = price;
    }
    public void setType(String type) {
        this.type = type;
    }
}
