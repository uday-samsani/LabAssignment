package lab04.exercise01;

public class CurrentAccount extends Account {
	private double overdraftLimit;
	CurrentAccount(String name, float age, double balance, double overdraftLimit){
		super(name,age,balance);
		this.overdraftLimit = overdraftLimit;
	}
	
	@Override
	public void withdraw(double amount) {
		if(-1*this.overdraftLimit==this.balance) {
			System.out.println("Limit croosed");
		}else if(this.balance-amount<this.overdraftLimit) {
			System.out.println("Limit croosed");			
		}else {
			this.balance = this.balance-amount;
		}
	}
}
