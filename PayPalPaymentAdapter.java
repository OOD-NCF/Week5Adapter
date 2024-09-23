public class PayPalPaymentAdapter implements PaymentProcessor {

    private PayPalPayment payPalPayment;

    public PayPalPaymentAdapter(PayPalPayment payPalPayment) {
        this.payPalPayment = payPalPayment;
    }

    @Override
    public void pay(int amount) {
        // Convert the amount from int to double and adapt the call to PayPal's method
        double amountInDollars = amount;
        payPalPayment.sendPayment(amountInDollars);
    }
}
