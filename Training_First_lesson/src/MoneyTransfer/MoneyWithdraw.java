package MoneyTransfer;

public class MoneyWithdraw extends Thread {
	Account ac;
	int amt;
	MoneyWithdraw(Account a,int val){
		this.ac = a;
		this.amt = val;
	}	
	@Override
	public void run() {
		try {
			ac.withdraw(amt);
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}
}
