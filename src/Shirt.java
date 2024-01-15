public class Shirt extends Clothing implements ShopFeatures {

    public Shirt(String brand, String price) {
        super.brand = brand;
        super.type = type;
    }
    public Shirt(String brand) {
        super.brand = brand;
        super.type = type;
    }

    @Override
    public String getProductNumber() {
        return null;
    }
}
