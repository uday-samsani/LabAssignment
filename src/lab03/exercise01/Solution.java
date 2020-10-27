package lab03.exercise01;

import java.util.Scanner;
import java.util.StringTokenizer;

public class Solution {
	public static void main(String[] args) {
		System.out.println("Enter the number of integers");
		Scanner input=new Scanner(System.in);
		String numbers = input.nextLine();
		StringTokenizer token = new StringTokenizer(numbers," ");
		int sum=0;
		while(token.hasMoreTokens()) {
			sum=sum+Integer.parseInt(token.nextToken());
		}
		System.out.println("Sum :"+sum);
		input.close();
	}
}