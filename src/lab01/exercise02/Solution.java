package lab01.exercise02;

import java.util.Scanner;

public class Solution {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Choose the signal:\n1.Red\n2.Yellow\n3.Green");
		int choice = input.nextInt();
		if(choice==1) {
			System.out.println("Stop");
		}else if(choice==2){
			System.out.println("Ready");
		}else {
			System.out.println("Green");
		}
	}

}
