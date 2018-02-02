package SearchingAndSortingAlgorithms;

import java.util.List;

public class Algorithms {
	public static int findBrokenEgg(List<String> eggs) {
		for(int i = 0; i<eggs.size(); i++) {
			if(eggs.get(i).equals("cracked")){
				return i;
			}
			
		}return 0;
	}
	
	public static int countPearls(List<Boolean>oysters) {
		int pearlCount = 0;
		for(int i = 0; i < oysters.size(); i++) {
			if(oysters.get(i)) {
				pearlCount += 1;
			}
		}return pearlCount;
	}
	
	public static Double findTallest(List<Double> peeps) {
		Double currentTallest = peeps.get(0);
		for(int i = 0; i < peeps.size(); i++) {
			if(currentTallest< peeps.get(i)) {
				currentTallest = peeps.get(i);
			}
		}return currentTallest;
	}
	
	public static String findLongestWord(List<String> words) {
		String currentWord = words.get(0);
		int currentLongest = words.get(0).length();
		for(int i = 0; i < words.size(); i++) {
			if(currentLongest< words.get (i).length()) {
				currentWord = words.get(i);
				currentLongest = words.get (i).length();
			}
		}
				return currentWord;
	}
	
	public static Boolean containsSOS(List<String>message) {
		
		for(int i = 0; i < message.size(); i++) {
			if(message.get(i).equals("...---...")) {
				return true;
			}
		}return false;
	}
	
	//Add other methods here
}