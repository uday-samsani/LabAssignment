package lab01.exercise06;

import java.util.Scanner;

public class Solution {
	public static int calculateDifference(int n) {
		int diff = 0;
		diff = (int) (((n * (n + 1) * ((2 * n) + 1)) / 6) - Math.pow(((n + 1) / 2), 2));
		return diff;
	}

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter te number");
		int number = input.nextInt();
		System.out.println(calculateDifference(number));
		input.close();
	}

}
