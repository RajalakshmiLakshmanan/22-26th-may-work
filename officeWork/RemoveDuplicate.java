package officeWork;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class RemoveDuplicate {
	public static String findDuplicate(String str) {
		Map<Character,Integer> map = new LinkedHashMap<Character,Integer>();
		String s= "";
		for (int i = 0; i < str.length(); i++) {
			if(map.containsKey(str.charAt(i))) {
				Integer value = map.get(str.charAt(i));
				map.put(str.charAt(i), value+1);
				
			}else {
				map.put(str.charAt(i), 1);
			}
			
		}
		for(Map.Entry<Character, Integer> entrySet : map.entrySet()) {
			s= s + entrySet.getKey();
			
		}
		
		return s;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str= "HappyNewYear";
		System.out.print(findDuplicate(str));
	   

	}

}
