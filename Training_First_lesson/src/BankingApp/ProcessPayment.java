package BankingApp;

public abstract class ProcessPayment implements EmailProcessing {
	public int processcount;
	public static void processFund(Customer initiator, Customer bene, double amount) {
		if(initiator!=null && bene!=null) {
			if(initiator.getAmountBalance()>amount) {
				double balanceamt = initiator.getAmountBalance()-amount;
				initiator.setAmountBalance(balanceamt);
				bene.setAmountBalance(bene.getAmountBalance()+amount);
			}
			else {
				System.out.println("Not having sufficient balance");
			}
		}
	}
	public abstract boolean validateCust(Customer c1);
	@Override
	public boolean validateEmail(Customer c1) {
		if(c1.getEmail()!=null && c1.getEmail().contains("@")) {
			return true;
		}
		return false;
	}
}
