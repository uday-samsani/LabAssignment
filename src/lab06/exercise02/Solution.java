package lab06.exercise02;

import java.util.HashMap;
import java.util.Map;

public class Solution {

	public Map<Character, Integer> countChars(char[] arr){
		Map<Character, Integer> count = new HashMap<Character, Integer>();
		for(int index=0;index<arr.length;index++) {
			if(count.get(arr[index])==null) {
				count.put(arr[index], 1);
			}else {
				count.put(arr[index], count.get(arr[index])+1);
			}
		}
		return count;
	}
	
	public static void main(String[] args) {
		char[] chars= {'a','a','b','c'};
		
		Solution obj = new Solution();
		System.out.println(obj.countChars(chars));
	}

}
