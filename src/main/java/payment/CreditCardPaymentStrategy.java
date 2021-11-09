package payment;

public class CreditCardPaymentStrategy implements Payment{

    @Override
    public String pay(double price){
        return "The payment will be done by credit card.";
    }
}