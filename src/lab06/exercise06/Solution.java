package lab06.exercise06;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Solution {
	
	public List<String> votersList(Map<String, Integer> voters){
		Set<Entry<String, Integer>> set = voters.entrySet();
		List<String> eligibleVoters = new ArrayList<String>();
		for(Entry<String, Integer> entry:set) {
			if(entry.getValue()>=18) {
				eligibleVoters.add(entry.getKey());
			}
		}
		return eligibleVoters;
	}

	public static void main(String[] args) {
		Map<String, Integer> voters = new HashMap<String, Integer>();
		voters.put("1",19);
		voters.put("2",42);
		voters.put("3",22);
		voters.put("4",12);
		voters.put("5",18);
		
		Solution obj = new Solution();
		System.out.println(obj.votersList(voters));
	}

}
