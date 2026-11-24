
public class PayPalPayment extends Payment {

    private String email;

    public PayPalPayment(double amount, String email) {
        super(amount);
        this.email = email;
    }

    @Override
    public void processPayment() {
        System.out.println("Processing PayPal Payment...");
        System.out.println("PayPal Email: " + email);
        System.out.println("Payment of " + amount + " successful");
    }
}
