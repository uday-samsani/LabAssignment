package lab06.exercise04;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Solution {
	public Map<String, String> getStudents(HashMap<String, Integer> marksMap){
		Set<Entry<String, Integer>> set = marksMap.entrySet();
		Map<String, String> medalsMap = new HashMap<String, String>();
		for(Entry<String, Integer> entry : set) {
			if(entry.getValue()>=90) {
				medalsMap.put(entry.getKey(), "gold");
			}else if(entry.getValue()>=80 && entry.getValue()<=90) {
				medalsMap.put(entry.getKey(), "silver");				
			} else if(entry.getValue()>=70 && entry.getValue()<=80) {
				medalsMap.put(entry.getKey(), "bronze");								
			}
		}
		return medalsMap;
	}

	public static void main(String[] args) {
		HashMap<String, Integer> marksMap = new HashMap<String, Integer>();
		marksMap.put("1", 75);
		marksMap.put("2", 85);
		marksMap.put("3", 95);
		marksMap.put("4", 91);
		Solution obj = new Solution();
		System.out.println(obj.getStudents(marksMap));
	}

}
