package Arrays;

import java.util.HashMap;
import java.util.Map;

public class inteviewQ1 {
	public static void main(String[] args) {
		int [] arr = {2,3,1,4,2,6,8,3,9,0};
		
		HashMap<Integer,Integer> map = new HashMap<>();
		
		for(int i :arr) {
			map.put(i, map.getOrDefault(i, 0)+1);
		}
		
		for(Map.Entry<Integer, Integer> entry : map.entrySet()){
			if(entry.getValue()==2) {
				System.out.println(entry.getKey()+" : "+entry.getValue());
			}
			
		}
		
		
	}
}
