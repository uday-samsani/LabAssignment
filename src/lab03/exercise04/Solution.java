package lab03.exercise04;

import java.util.Scanner;

public class Solution {

	public int modifyNumber(int number) {
		String numStr = number+"";
		String resultStr = "";
		for(int index=0;index<numStr.length()-1;index++) {
			if(numStr.charAt(index)-numStr.charAt(index+1)>0) {				
				resultStr += numStr.charAt(index)-numStr.charAt(index+1);
			}else {
				resultStr += numStr.charAt(index+1)-numStr.charAt(index);
			}
		}
		resultStr +=numStr.charAt(numStr.length()-1);
		return Integer.parseInt(resultStr);
	}
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the number");
		int number = input.nextInt();
		input.close();
		Solution obj = new Solution();
		System.out.println(obj.modifyNumber(number));
	}

}
