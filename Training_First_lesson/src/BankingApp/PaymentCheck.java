package BankingApp;


import java.util.*;

public class PaymentCheck implements Comparable<PaymentCheck> {
    private String accountHolderName;
    private long accountNo;
    private String transCode;
    private String country;
    private String ifscCode;
    private double balance;

    public PaymentCheck(String accountHolderName, long accountNo, String transCode, String country, String ifscCode, double balance) {
        this.accountHolderName = accountHolderName;
        this.accountNo = accountNo;
        this.transCode = transCode;
        this.country = country;
        this.ifscCode = ifscCode;
        this.balance = balance;
    }

    public String getAccountHolderName() { return accountHolderName; }
    public long getAccountNo() { return accountNo; }
    public String getTransCode() { return transCode; }
    public String getCountry() { return country; }
    public String getIfscCode() { return ifscCode; }
    public double getBalance() { return balance; }

    @Override
    public String toString() {
        return accountHolderName + " | " + accountNo + " | " + balance;
    }

    @Override
    public int compareTo(PaymentCheck other) {
        return this.accountHolderName.compareToIgnoreCase(other.accountHolderName);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof PaymentCheck)) return false;
        PaymentCheck other = (PaymentCheck) obj;
        return this.accountNo == other.accountNo &&
               Objects.equals(this.accountHolderName, other.accountHolderName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(accountHolderName, accountNo);
    }


    public static void main(String[] args) {
    	Map<Long, PaymentCheck> paymentMap = new HashMap<>();

        PaymentCheck p1 = new PaymentCheck("Lakshay", 103, "T1", "India", "HDFC0001", 20000);
        PaymentCheck p2 = new PaymentCheck("Kunal", 101, "T2", "India", "HDFC0002", 15000);
        PaymentCheck p3 = new PaymentCheck("Himanshu", 102, "T3", "India", "HDFC0003", 50000);
        PaymentCheck p4 = new PaymentCheck("Lakshay", 103, "T1", "India", "HDFC0001", 20000);

        paymentMap.put(p1.getAccountNo(), p1);
        paymentMap.put(p2.getAccountNo(), p2);
        paymentMap.put(p3.getAccountNo(), p3);
        paymentMap.put(p4.getAccountNo(), p4); 

        System.out.println("All Accounts in HashMap:");
        for (Map.Entry<Long, PaymentCheck> entry : paymentMap.entrySet()) {
            System.out.println("Key (AccountNo): " + entry.getKey() + " => Value: " + entry.getValue());
        }

        System.out.println("\nRetrieving account with key 102:");
        System.out.println(paymentMap.get(102L));

        System.out.println("\nContains key 101? " + paymentMap.containsKey(101L));
        System.out.println("Contains value p3? " + paymentMap.containsValue(p3));

        System.out.println("\nRemoving account 101.");
        paymentMap.remove(101L);

        System.out.println("\nUpdated HashMap after removal:");
        paymentMap.forEach((key, value) -> System.out.println(key + " => " + value));

        System.out.println("\nAll Keys (Account Numbers): " + paymentMap.keySet());
        System.out.println("All Values (Account Details): " + paymentMap.values());

        System.out.println("\nChecking equality of p1 and p4:");
        System.out.println("p1.hashCode() = " + p1.hashCode());
        System.out.println("p4.hashCode() = " + p4.hashCode());
        System.out.println("p1.equals(p4): " + p1.equals(p4));
    }
    


}

