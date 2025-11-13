package MoneyTransfer;

public class Account {
	private int balance;
	private void processBalance(int diff) {
		if(diff<0) {
			throw new IllegalArgumentException("Insufficient Balance");
		}
		System.out.println("Balance after withdraw is:"+diff);
	}
	Account(int bal){
		this.balance = bal;
	}
	public synchronized void deposit(int amt) {
		balance += amt;
		System.out.println("Balance after Deposit:"+balance);
	}
	public synchronized void withdraw(int amt) {
		try {
			int diff = balance-amt;
			processBalance(diff);
			balance = diff;
		}
		catch(IllegalArgumentException e) {
			System.out.println(e.getMessage());
		}
	}
	
}
