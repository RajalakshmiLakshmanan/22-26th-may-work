package officeWork;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class JavaChallenge {
	
public static int firstElementKTime(int[] a, int n, int k) { 
        
        
        Map<Integer,Integer> map = new LinkedHashMap<Integer,Integer>();
        for(int i =0;i<n;i++) {
        	if(map.containsKey(a[i])) {
        		Integer value = map.get(a[i]);
        		map.put(a[i], value+1);
        		 value = map.get(a[i]);
        		 if(value == k) {
        			 return a[i];
        		 }
        		
        	}else {
        		map.put(a[i], 1);
        	}
        	
        	
        }
        System.out.println(map);
        
//        for(Map.Entry<Integer, Integer> entrySet: map.entrySet()) {
//        	if(entrySet.getValue()==k ) {
//        		return entrySet.getKey();
//        		
//        	}
//        	
//        }
        
        return -1;
        
        
        
    } 

	public static void main(String[] args) {
		int n=7;
		int k=2;
		int[] a = {1, 7, 4, 3, 4, 8, 7};
		System.out.println("output:"+firstElementKTime( a, n, k));		

	}

}
