package PaymentApp;

import java.util.HashSet;

public class Processing {
	
    public static void main(String[] args) {
        // Display application configuration
        
        // Create payment processor
        
        // Create sample payments
        Payment p1 = new Payment("PAY001", 100.50, "USD", "PENDING");
        Payment p2 = new Payment("PAY002", 250.75, "EUR", "PENDING");
        Payment p3 = new Payment("PAY003", 50.00, "USD", "PENDING");
        
        // Add payments to processor;
        HashSet<Payment> ls = new HashSet<>();
        ls.add(p1);
        ls.add(p3);
        ls.add(p2);
        
        // Display all payments
        System.out.println("\n=== All Payments ===");
        if (ls.isEmpty()) {
            System.out.println("No payments available.");
        } 
        else {
            for (Payment payment : ls) {
                System.out.println(payment);
            }
        }
        
    }
}
