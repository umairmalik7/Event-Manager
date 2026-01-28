// PaymentProcessor.java
public class PaymentProcessor {
    public Payment makePayment(int amount, String method) {
        // Simple fake payment
        Payment payment = new Payment(1, amount, method, "Paid", "Today");
        return payment;
    }
}