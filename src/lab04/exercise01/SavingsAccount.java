package lab04.exercise01;

public class SavingsAccount extends Account {
	private double minBalance;
	SavingsAccount(String name, float age, double balance, double minBalance) {
		super(name, age, balance);
		this.minBalance=minBalance;
	}
	
	@Override
	public void withdraw(double amount) {
		if(this.balance-amount>this.minBalance) {
			this.balance = this.balance-amount;
		}
	}
}
