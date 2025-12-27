package Demo;

import java.util.LinkedHashMap;
import java.util.Map;

public class Test11 {

	public static void main(String[] args) {
		//Print second non repeating value
		
		String str = "swiss";
		
		Map<Character, Integer> map = new LinkedHashMap<Character, Integer>();
		
		for(int i =0; i< str.length();i++) {
			char c  = str.charAt(i);
			
			if(map.containsKey(c)) {
				map.put(c, map.get(c)+1);
			}else {
				map.put(c, 1);
			}
		}
		
		System.out.println(map);
		
		for(Map.Entry<Character, Integer> entry : map.entrySet()) {
			if(entry.getValue() == 1) {
				System.out.println("First not repleating character: "+entry.getKey());
			break;
			}
		}
		

	}

}
