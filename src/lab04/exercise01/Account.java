package lab04.exercise01;

public class Account implements Bank {
	protected long accNum;
	protected double balance;
	protected Person accHolder;
	
	Account(String name, float age, double balance){
		this.accHolder = new Person(name, age);
		this.balance=balance;
	}
	
	public long getAccNum() {
		return this.accNum;
	}
	
	public double getBalance() {
		return this.balance;
	}
	public Person getAccHolder() {
		return accHolder;
	}
	
	@Override
	public void deposit(double amount) {
		this.balance= this.balance+amount;
	};
	
	@Override
	public void withdraw(double amount) {
		this.balance=this.balance-amount;
	};
}
