package SOLID;

public class CheckOut{
    private PaymentMethod paymentMethod;
    private Discount discount;

    public CheckOut(PaymentMethod paymentMethod, Discount discount){
        this.paymentMethod = paymentMethod;
        this.discount = discount;
    }

    public void processPayment(Product product){
        double finalPrice = discount.applyDiscount(product.getPrice());
        paymentMethod.pay(finalPrice);
    }
}
