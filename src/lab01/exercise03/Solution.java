package lab01.exercise03;

import java.util.Scanner;

public class Solution {

	public static void febanocci(int number) {
		System.out.println(1);
		for (int index = 1; index <= number; index++) {
			System.out.println(index + index - 1);
		}
	}

	public static void febanocciRecursive(int a, int b, int count, int upperLimit) {
		if (count == 0) {
			System.out.println(a);
		}
		if (count < upperLimit) {
			System.out.println(b);
			febanocciRecursive(b, b + a, count + 1, upperLimit);
		}
	}

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the number of febanocci numbers: ");
		int upperLimit = input.nextInt();
		System.out.println("Choose the method:\n1.Wihtout recusrion\n2.With recusrion");
		int choice = input.nextInt();
		if (choice == 1) {
			febanocci(upperLimit);
		} else {
			febanocciRecursive(1, 1, 0, upperLimit);
		}
	}

}
