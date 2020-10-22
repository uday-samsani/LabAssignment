package lab02.exercise01;

import java.util.Scanner;

public class Solution {
	public int getSecondSmallest(int[] array) {
		int temp;
		for(int indexi=0;indexi<array.length-1;indexi++) {
			for(int indexj=0;indexj<array.length-indexi-1;indexj++) {
				temp=array[indexi];
				array[indexi]=array[indexj];
				array[indexj]=temp;
			}
		}
		return array[1];
	}

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the size of array");
		int size=input.nextInt();
		System.out.println("Enter the array elements");
		int[] array = new int[size];
		for(int index=0;index<size;index++) {
			array[index] = input.nextInt();
		}
		input.close();
		Solution a = new Solution();
		System.out.println(a.getSecondSmallest(array));
	}

}
