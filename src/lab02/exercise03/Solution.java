package lab02.exercise03;

import java.util.Scanner;

public class Solution {
	
	public int[] sortArray(int[] arr) {
		for(int index=0;index<arr.length;index++) {
			String number = ""+arr[index];
			String revNumber ="";
			for(int indexi=number.length()-1;indexi>=0;indexi--) {
				revNumber+=number.charAt(indexi);
			}
			arr[index]=Integer.parseInt(revNumber);
		}
		for(int indexi=0;indexi<arr.length;indexi++) {
			for(int indexj=0;indexj<arr.length-indexi-1;indexj++) {
				if(arr[indexi]<arr[indexj]) {
					int temp = arr[indexi];
					arr[indexi]=arr[indexj];
					arr[indexj]=temp;
				}
			}
		}
		return arr;
	}

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the size of array: ");
		int size=input.nextInt();
		System.out.println("Enter array elements: ");
		int[] arr = new int[size];
		for(int index=0;index<size;index++) {
			arr[index]= input.nextInt();
		}
		Solution a = new Solution();
		arr=a.sortArray(arr);
		System.out.println("Array after sorting: ");
		for(int index=0;index<size;index++) {
			System.out.println(""+arr[index]);
		}
		input.close();
	}
}
