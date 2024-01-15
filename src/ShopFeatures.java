public interface ShopFeatures {
    double getPrice();

    String getProductNumber();

    default String getCondition() {
        return "brand new!";
    }

}
