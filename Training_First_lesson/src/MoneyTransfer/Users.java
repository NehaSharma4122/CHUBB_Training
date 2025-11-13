package MoneyTransfer;

public class Users {
	String name;
	static public int balance = 1000;
	
	public static void main(String[] args) throws InterruptedException {
		Account acc = new Account(balance);
		MoneyDeposit md = new MoneyDeposit(acc,balance);
		MoneyWithdraw mw = new MoneyWithdraw(acc,balance);
		md.start();
		mw.start();
		md.join();
		mw.join();
		System.out.println("Balance:"+balance);
	}
}
