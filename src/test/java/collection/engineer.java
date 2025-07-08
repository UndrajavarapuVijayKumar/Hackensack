	package collection;
	
	import java.util.HashMap;
import java.util.Map;
	
	public class engineer {
		public static void main(String[] args) {
			String input = "engineer";
			char[] inputArr = input.toCharArray();
						
			Map<Character,Integer> map = new HashMap<>();
			for(char c:inputArr) {
				map.put(c, map.getOrDefault(c,0)+1);
			}
		
			for(Map.Entry<Character,Integer>entry :map.entrySet()){
				System.out.println(entry.getKey()+"->"+entry.getValue());
			}
		
		}
	
	}
