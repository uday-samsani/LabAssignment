package lab06.exercise07;

import java.util.Arrays;

public class Solution {
	public int reverseNumber(int num) {
		String numStr = num+"";
		String temp="";
		for(int index=numStr.length()-1;index>=0;index--) {
			temp+=numStr.charAt(index);
		}
		return Integer.parseInt(temp);
	}
	public int[] getSorted(int[] arr) {
		int[] revArr=new int[arr.length];
		for(int index=0;index<arr.length;index++) {
			revArr[index] = this.reverseNumber(arr[index]);
		}
		Arrays.sort(revArr);
		return revArr;
	}
	
	public static void main(String[] args) {
		int[] arr= {456,152,42,2};
		Solution obj = new Solution(); 
		int[] arrRev = obj.getSorted(arr);
		for(int index=0;index<arrRev.length;index++)
			System.out.println("Index: "+index+" Value: "+arrRev[index]);
	}
}
