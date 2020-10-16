package lab01.exercise04;

import java.util.Scanner;

public class Solution {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the upper limit");
		int upperLimit = input.nextInt();
		for (int number = 1; number <= upperLimit; number++) {
			boolean isPrime = false;
			for (int index = 2; index <= number / 2; index++) {
				if (number % index == 0) {
					isPrime = true;
					break;
				}
			}
			if (!isPrime) {
				System.out.println(number);
			}
		}
	}

}
