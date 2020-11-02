package lab06.exercise01;

import java.util.Collections;
import java.util.HashMap;
import java.util.ArrayList;

public class Solution {
	public ArrayList<String> getValues(HashMap<Integer, String> map) {
			ArrayList<String> sortValues = new ArrayList<String>(map.values());
			Collections.sort(sortValues);
			return sortValues;
	}

	public static void main(String[] args) {
		HashMap<Integer, String> map=new HashMap<Integer, String>();
		map.put(1, "uday");
		map.put(2, "satya");
		map.put(3, "sai");
		map.put(4, "samsani");
		Solution obj = new Solution();
		System.out.println(obj.getValues(map));
	}
}
