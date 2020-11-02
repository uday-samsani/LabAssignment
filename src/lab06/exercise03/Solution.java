package lab06.exercise03;

import java.util.HashMap;
import java.util.Map;

public class Solution {

	public Map<Integer, Integer> getSquares(int[] arr){
		Map<Integer, Integer> squares = new HashMap<Integer, Integer>();
		for(int index=0;index<arr.length;index++) {
			if(squares.get(arr[index])==null) {
				squares.put(arr[index], arr[index]*arr[index]);
			}
		}
		return squares;
	}
	
	public static void main(String[] args) {
		int[] numbers= {1,2,3,1,3,4};
		
		Solution obj = new Solution();
		System.out.println(obj.getSquares(numbers));
	}

}
