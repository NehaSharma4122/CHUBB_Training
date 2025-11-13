package BankingApp;

public interface EmailProcessing {
	public boolean validateEmail(Customer c);
	static boolean sendEmail() {
		System.out.println("sending emails");
		return true;
	}
	default void initializeEmail() {
		//by default is overridden
		System.out.println("initialize server");
	}
}
