package BankingApp;

public class Customer {
	private String name;
	private double amountBalance;
	private String email;
	private String accountno;
	private int age;
	Customer(){
		System.out.println("This is customer class");
	}
	public Customer(String name, String accdetails, String email, double amount,int age){
		this.name = name;
		this.accountno = accdetails;
		this.email = email;
		this.amountBalance = amount;
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getAmountBalance() {
		return amountBalance;
	}
	public void setAmountBalance(double amountBalance) {
		this.amountBalance = amountBalance;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getAccountno() {
		return accountno;
	}
	public void setAccountno(String accountno) {
		this.accountno = accountno;
	}
	
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
//	public int compareTo(Object o) {
//		Customer c  = (Customer)o;
//		if(this.amountBalance>c.amountBalance) {
//			return 1;
//		}
//		else if(this.amountBalance<c.amountBalance) {
//			return -1;
//		}
//		return 0;
//	}
	@Override
	public int hashCode() {
		return this.age;
	}
	@Override
	public boolean equals(Object o) {
		Customer c = (Customer)o;
		if(this.age == c.getAge() && this.name.equalsIgnoreCase(c.getName()) && this.accountno.equals(c.getAccountno())) {
			return true;
		}
		return false;
	}
}
