package collection;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class computeIFAnbsent {

	private static final Map<String,List<String>> citiesInCountry = new TreeMap<>();
	public static void main(String[] args) {
		addPair("India", "Delhi");
		addPair("India", "noida");
		addPair("India", "mumbai");
		addPair("USA", "Texas");
		addPair("USA", "NC");
		addPair("India", "jhansi");
		
		
		System.out.println(citiesInCountry);
	}
	public static void addPair(String country,String cities) {
		if(citiesInCountry.containsKey(country)) {
			citiesInCountry.get(country).add(cities);
		}else {
			citiesInCountry.put(country, new ArrayList<>(List.of(cities)));
		}
	}
}
