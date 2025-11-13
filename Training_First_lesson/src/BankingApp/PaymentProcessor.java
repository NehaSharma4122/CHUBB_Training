//package BankingApp;
//import java.util.TreeSet;
//
//import paymentapp.Payment;
//
//public class PaymentProcessor {
//    private TreeSet<Payment> payments;
//    
//    public PaymentProcessor() {
//        this.payments = new TreeSet<>();
//    }
//    
//    public void addPayment(Payment payment) {
//        payments.add(payment);
//        System.out.println("Added: " + payment);
//    }
//    
//    public void processPayment(String paymentId) {
//        for (Payment payment : payments) {
//            if (payment.getPaymentId().equals(paymentId)) {
//                payment.setStatus("PROCESSED");
//                System.out.println("Processed: " + payment);
//                return;
//            }
//        }
//        System.out.println("Payment not found: " + paymentId);
//    }
//    
//    public void displayAllPayments() {
//        System.out.println("\n=== All Payments ===");
//        if (payments.isEmpty()) {
//            System.out.println("No payments available.");
//        } else {
//            for (Payment payment : payments) {
//                System.out.println(payment);
//            }
//        }
//    }
//    
//    public int getTotalPayments() {
//        return payments.size();
//    }
//}