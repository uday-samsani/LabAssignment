package lab03.exercise08;

import java.util.Scanner;

public class Solution {

	public boolean checkPostive(String str) {
		boolean isPositive = true;
		for(int index=0;index<str.length()-1;index++) {
			if(str.charAt(index)>str.charAt(index+1) ){
				isPositive=false;
				break;
			}
		}
		return isPositive;
	}
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the string you want to check");
		String str = input.next();
		input.close();
		Solution obj = new Solution();
		if(obj.checkPostive(str)) {
			System.out.println("String is positive");
		}else {
			System.out.println("String is negative");
		}
	}
}
