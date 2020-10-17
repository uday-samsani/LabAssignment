package lab01.exercise08;

import java.util.Scanner;

public class Solution {
	public static boolean checkNumber(int n) {
		boolean isPower = false;
		int prod=1;
		for (int index=0;index<n/2;index++) {
			if(prod>n) {
				break;
			}
			if(prod==n) {
				isPower=true;
				break;
			}
			prod*=2;
		}
		return isPower;
	}
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int number = input.nextInt();
		if(checkNumber(number)) {			
			System.out.println("Number is a power of 2");
		}else {
			System.out.println("Number is not a power of 2");			
		}	
	}
}
