
//ClientCode
public class ECommerceApplication {

    private PaymentProcessor paymentProcessor;

    public ECommerceApplication(PaymentProcessor paymentProcessor) {
        this.paymentProcessor = paymentProcessor;
    }

    public void checkout(int amount) {
        paymentProcessor.pay(amount);
    }

    public static void main(String[] args) {
        // Create a PayPal payment object
        PayPalPayment payPalPayment = new PayPalPayment();

        // Adapt PayPalPayment to PaymentProcessor using PayPalPaymentAdapter
        PaymentProcessor paymentProcessor = new PayPalPaymentAdapter(payPalPayment);

        // Use the adapter in the e-commerce application
        ECommerceApplication app = new ECommerceApplication(paymentProcessor);
        app.checkout(100);  // Check out with $100
    }
}
