package lab03.exercise02;

import java.util.Scanner;

public class Solution {
	public String getImage(String str) {
		String temp=str+"|";
		for(int index=str.length()-1;index>=0;index--) {
			temp=temp+str.charAt(index);
		}
		return temp;
	}
	
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("Enter the string");
		String str = input.next();
		Solution obj =new Solution();
		System.out.println(obj.getImage(str));
		input.close();
	}

}
