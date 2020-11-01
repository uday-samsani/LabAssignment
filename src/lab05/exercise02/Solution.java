package lab05.exercise02;

import java.util.Scanner;

public class Solution {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		try {
			System.out.println("Enter first name: ");
			String firstName = input.nextLine();
			System.out.println("Enter last name: ");
			String lastName = input.nextLine();
			input.close();
			if (firstName.trim().compareTo("") == 0 || lastName.trim().compareTo("") == 0) {
				throw new EmptyNameException();
			}
		} catch (EmptyNameException e) {
			System.out.println("Name should not be empty");
		}

	}

}
