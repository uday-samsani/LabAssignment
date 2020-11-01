package lab03.exercise05;

import java.util.Scanner;

public class Solution {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String str = input.nextLine();
		input.close();
		System.out.println("Letters: "+str.length());
		System.out.println("Words: "+str.split(" ").length);
		System.out.println("Lines: "+str.split(".").length);
	}
}
