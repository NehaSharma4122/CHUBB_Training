package BankingApp;

public class ProcessFund extends ProcessPayment{
	public int processcount;
	public static void processFund(Customer initiator, Customer bene, double amount) {
		System.out.println("THis is child program");
		if(initiator!=null && bene!=null) {
			if(initiator.getAmountBalance()>amount && amount>20000) {
				double balanceamt = initiator.getAmountBalance()-amount;
				initiator.setAmountBalance(balanceamt);
				bene.setAmountBalance(bene.getAmountBalance()+amount);
				System.out.println("Process transfer successful");
			}
			else {
				System.out.println("Not having sufficient balance");
			}
		}
	}
	@Override
	public boolean validateCust(Customer c1) {
		if(c1.getName()!=null && !c1.getName().equals("Bin Laden")) {
			return true;
		}
		return false;
	}
	

	
	
	
	
	
}
