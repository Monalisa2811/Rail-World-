package TestEncapsulation;

public class Account {
	private long accountNumber;
	private String name;
	private String email;
	private double amount;
	
	public void setAccountNumber(long accountNumber) {
		
		this.accountNumber=accountNumber;
		
	}
	public long getAccountNumber() {
		return accountNumber;
		
	}
	
	public void setName(String name) {
		this.name=name;
	}
	public String getName() {
		return name;
	}
	
	public void setEmail(String email) {
		this.email=email;
	}
	public String getEmail() {
		return email;
	}
	
	public void setAmount(double amount) {
		this.amount=amount;
	}
	public double getAmount() {
		return amount;
	}

}
