package MoneyTransfer;

public class MoneyDeposit extends Thread {
	Account ac;
	int amt;
	MoneyDeposit(Account a,int val){
		this.ac = a;
		this.amt = val;
	}	
	@Override
	public void run() {
		try {
			ac.deposit(amt);
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}
}
