package PaymentApp;

public class Payment {
	private String id;
	private double amt;
	private String currency;
	private String status;
	
	public Payment(String id, double amt, String currency,String status) {
		this.id = id;
		this.amt = amt;
		this.currency = currency;
		this.status = status;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public double getAmt() {
		return amt;
	}

	public void setAmt(double amt) {
		this.amt = amt;
	}

	public String getCurrency() {
		return currency;
	}

	public void setCurrency(String currency) {
		this.currency = currency;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}
	
	public int compareTo(Payment other) {
		return this.id.compareTo(other.id);
	}
	@Override
	public String toString() {
		return String.format("Payment{id='%s', amount=%.2f %s, status='%s'}", 
                id, amt, currency, status);
	}
	
}
