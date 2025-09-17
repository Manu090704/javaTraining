package SOLID;

public class Product{
    private String name;
    private double price;

    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }
}

class EffectivePayment implements PaymentMethod{
    @Override
    public void pay(double amount){
        System.out.println("Pagando" + amount + " en efectivo.");
    }
}

interface Discount{
    double applyDiscount(double price);
}

