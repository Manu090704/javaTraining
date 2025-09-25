package SOLID;

public class CreditCardPayment implements PaymentMethod{
    @Override
    public void pay(double amount){
        System.out.println("Pagando " + amount + " con tarjeta de crédito.");
    }
}
