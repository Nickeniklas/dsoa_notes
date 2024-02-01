public class Customer {
    private double funds;
    private Bike currentBike;

    public Customer(double funds) {
        this.funds = funds;
    }

    public void buyBike(Bike bike) {
        if(funds > bike.getPrice()) {
            setFunds(funds - bike.getPrice());
            currentBike = bike;
        } else {
            System.out.println("TOO BROKE TO BUY THIS BIKE, bro...");
        }
    }

    //  GETTERS & SETTERS
    public double getFunds() {
        return funds;
    }
    public void setFunds(double funds) {
        this.funds = funds;
    }


}
