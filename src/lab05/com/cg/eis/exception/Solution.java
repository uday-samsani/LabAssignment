package lab05.com.cg.eis.exception;

import java.util.Scanner;

public class Solution {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		try {
			System.out.println("Enter the salary");
			float salary = input.nextFloat();
			input.close();
			if(salary<3000) {
				throw new EmployeeException();
			}
		} catch (EmployeeException e) {
			System.out.println("Emplyee should not have salary less than 3000");
		}
	}
}
