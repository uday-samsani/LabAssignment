package lab01.exercise05;

import java.util.Scanner;

public class Solution {
	public static int calculateSum(int n) {
		int sum=0;
		for(int index=1;index<=n;index++) {
			if(index%3==0 && index%5==0) {
				sum+=index;
			}
		}
		return sum;
	}
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the number upto which should be summed:");
		int upperLimit = input.nextInt();
		System.out.println(calculateSum(upperLimit));
	}

}
