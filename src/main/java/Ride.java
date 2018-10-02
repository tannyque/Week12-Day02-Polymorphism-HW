public abstract class Ride {

    private String name;
    private double price;
    private int minHeight;
    private int minAge;

    public Ride(String name, double price, int minHeight, int minAge) {
        this.name = name;
        this.price = price;
        this.minHeight = minHeight;
        this.minAge = minAge;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public int getMinHeight() {
        return minHeight;
    }

    public int getMinAge() {
        return minAge;
    }

    public boolean checkHeight(Customer customer) {
        if (customer.getHeight() >= this.minHeight) {
            return true;
        } else {
            return false;
        }

    }

    public void takeMoney(Customer customer){
        if (customer.getMoney() >= this.price){
            customer.pay(this.price);}
    }

}
