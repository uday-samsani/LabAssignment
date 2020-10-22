package lab01.exercise07;

import java.util.Scanner;

public class Solution {
	public static boolean checkNumber(int n) {
		int previous=(n%10)+1;
		boolean isOrdered = true;
		while (n > 0) {
			if (previous > n % 10) {
				previous = n % 10;
				n /= 10;
			} else {
				isOrdered = false;
				break;
			}

		}
		return isOrdered;
	}

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the number to check");
		int number = input.nextInt();
		if (checkNumber(number)) {
			System.out.println("It is ordered");
		} else {
			System.out.println("It is not ordered");
		}
		input.close();
	}

}
