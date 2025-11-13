package AccountDetails;

import java.util.*;

public class AccountOperations {
	public boolean exists(String accountNumber) {
		if(accountNumber==null || accountNumber.startsWith("0")) {
			return false;
		}
		if(accountNumber.length()!=10) {
			return false;
		}
		return true;
	}
	public double checkBalance(String accnum, double amt) {
		Account obj = new Account();
		if(obj.accNumber == accnum) {
			return obj.amount;
		}	
		return 0;
	}
	public static void main(String[] args) {
		List<Account> acc = new ArrayList<Account>();
		System.out.print("Enter the accounts you want to add:");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		for(int i=0;i<n;i++) {
			String accNumber = sc.next();
			String name = sc.nextLine();
			double amount = sc.nextDouble();
			acc.add(new Account(accNumber,name,amount));
		}
	}
}
