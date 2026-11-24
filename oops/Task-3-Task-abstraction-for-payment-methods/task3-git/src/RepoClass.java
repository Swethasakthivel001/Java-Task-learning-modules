
public class RepoClass {

    public void makePayment(Payment payment) {

        if (payment == null) {
            System.out.println("Invalid payment");
            return;
        }

        payment.displayAmount();
        payment.processPayment();
    }
}
