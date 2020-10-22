package lab02.exercise02;

import java.util.Arrays;
import java.util.Scanner;

public class Solution {
	public String[] sortStrings(String[] strs) {
		Arrays.sort(strs);
		for(int index=0;index<strs.length;index++) {
			if(strs[index].length()%2==0) {
				strs[index] = strs[index].substring(0, strs[index].length()/2).toUpperCase()+strs[index].substring(strs[index].length()/2, strs[index].length()).toLowerCase();
			}else {
				strs[index] = strs[index].substring(0, (strs[index].length()/2)+1).toUpperCase()+strs[index].substring((strs[index].length()/2)+1, strs[index].length()).toLowerCase();
			}
		}
		return strs;
	}

	public static void main(String[] args) {
		Solution a = new Solution();
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the size");
		int size = input.nextInt();
		String[] strs = new String[size];
		System.out.println("Enter the strings");
		for(int index=0;index<size;index++) {
			strs[index]=input.next();
		}
		strs=a.sortStrings(strs);
		System.out.println("Strings after sorting");
		for(int index=0;index<strs.length;index++) {
			System.out.println(strs[index]);
		}
		input.close();
	}

}
