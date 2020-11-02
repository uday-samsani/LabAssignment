package lab06.exercise05;

import java.util.ArrayList;
import java.util.Collections;

public class Solution {
	public int getSecondSmallest(int[] arr) {
		ArrayList<Integer> arrList = new ArrayList<Integer>();
		for(int index=0;index<arr.length;index++) {
			arrList.add(arr[index]);
		}
		Collections.sort(arrList);
		return arrList.get(1);
	}

	public static void main(String[] args) {
		int[] arr = {4,5,6,1,2,0,3,45,10};
		
		Solution obj=new Solution();
		System.out.println(obj.getSecondSmallest(arr));

	}

}
