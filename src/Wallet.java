
public class Wallet {

	private double balance;
	
	public Wallet(double money) {
		balance = money;
	}
	
	public Wallet() {		//default constructor sets balance to $100000
		balance = 100000;
	}
	
	public double getBalance() {
		return this.balance;
	}
	
	public void setBalance(double amount) {
		this.balance = amount;
	}
	
	public void add(double amount) {
		this.balance = balance + amount;
	}
	
	public void spend(double amount) {
		this.balance = balance - amount;
	}
}
