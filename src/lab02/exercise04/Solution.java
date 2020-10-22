package lab02.exercise04;

import java.util.Scanner;

public class Solution {
	public int[] modifyArray(int[] arr) {
		int[] unique=new int[arr.length];
		int k=0;
		for(int index=0;index<arr.length;index++) {
			boolean isUnique=true;
			for(int indexj=0;indexj<=k;indexj++) {
				if(arr[index]==unique[indexj]) {
					isUnique=false;
					break;
				}
			}
			if(isUnique) {
				unique[k++]=arr[index];
			}
		}
		return unique;
	}

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the size");
		int size = input.nextInt();
		int[] arr = new int[size];
		System.out.println("Enter the elements");
		for (int index=0;index<size;index++) {
			arr[index]=input.nextInt();
		}
		input.close();
		Solution a = new Solution();
		int[] unique = a.modifyArray(arr);
		for(int index=0;index<unique.length;index++) {
			if(unique[index]!=0) {				
				System.out.println(unique[index]);
			}
		}
	}

}
