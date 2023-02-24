package Strings;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

import org.testng.annotations.Test;

public class Duplicates {

	@Test
	public void duplicate_Character() {
		String s = "Hello World Welcome";
		char[] c = s.toCharArray();
		int length = c.length;
		int i=0;
		Map<Character, Integer> map = new HashMap<Character, Integer>();
		
		while(i!=length) {
			if(map.containsKey(c[i])==false) {
				map.put(c[i], 1);
			}else {
				int ov = map.get(c[i]);
				int nv = ov+1;
				map.put(c[i], nv);
			}
			i++;
		}
		
		Set<Map.Entry<Character, Integer>> smap = map.entrySet();
		for (Map.Entry<Character, Integer> data : smap) {
			
			if(data.getValue()>1) {
				System.out.print(data.getKey()+"    "+data.getValue()+"      ");
			}
		}
		System.out.println("These are the duplicate characters");
	}
}
