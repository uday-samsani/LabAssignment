package lab04.exercise01;

public class Solution {

	public static void main(String[] args) {
		Account smith = new Account("smith",22,2000);
		Account kathy = new Account("kathy",22,3000);
		
		smith.deposit(2000);
		kathy.withdraw(2000);
		
		System.out.println(smith.getBalance());
		System.out.println(kathy.getBalance());
	}

}
