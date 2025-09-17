package SOLID;

public class ImplementDiscount implements Discount{
    private double percentage;

    public ImplementDiscount(double percentage){
        this.percentage = percentage;
    }

    @Override
    public double applyDiscount(double price){
        return price - (price * percentage / 100);
    }
}
