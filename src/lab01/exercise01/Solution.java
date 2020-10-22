package lab01.exercise01;

import java.util.Scanner;

public class Solution {
	public static long addDigitCubes(int number) {
		int sum=0;
		while(number>0) {
			sum=sum+((number%10)*(number%10)*(number%10));
			number /=10;
		}
		return sum;
	}

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the number");
		int number = input.nextInt();
		System.out.println(addDigitCubes(number));
		input.close();
	}

}
