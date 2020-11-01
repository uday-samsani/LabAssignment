package lab03.exercise03;

import java.util.Scanner;

public class Solution {

	public String alterString(String str) {
		String alteredStr = "";
		for (int index = 0; index < str.length(); index++) {
			if (str.toLowerCase().charAt(index) == 'a' || str.toLowerCase().charAt(index) == 'e'
					|| str.toLowerCase().charAt(index) == 'i' || str.toLowerCase().charAt(index) == 'o'
					|| str.toLowerCase().charAt(index) == 'u') {
				alteredStr = alteredStr + str.charAt(index);
			} else {
				alteredStr = alteredStr + (char) (str.charAt(index) + 1);
			}
		}
		return alteredStr;
	}

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the string");
		String str = input.nextLine();
		input.close();
		Solution obj = new Solution();
		System.out.println(obj.alterString(str));

	}
}
