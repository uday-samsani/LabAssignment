package lab05.exercise01;

import java.util.Scanner;

public class Solution {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		try {
			System.out.println("Enter the age: ");
			float age = input.nextFloat();
			input.close();
			if (age < 15) {
				throw new AgeException();
			}
		} catch (AgeException e) {
			System.out.println("Age should not be less than 15");
		}
	}

}
