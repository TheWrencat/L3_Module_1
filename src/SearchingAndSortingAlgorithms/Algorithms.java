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
			if(message.get(i).equals(" ... --- ... ")) {
				return true;
			}
		}return false;
	}
	
	public static List<Double> sortScores(List<Double>results) {
		for(int i = 0; i<results.size(); i++) {
			for(int j = i+1; j<results.size(); j++) {
				if(results.get(i) > results.get(j)) {
					Double large = results.get(i);
					Double small = results.get(j);
					results.set(i, small);
					results.set(j, large);
				}
			}
		}
		System.out.println(results);
		return results;
	}
	
	public static List<String> sortDNA(List<String>sequences){
		for(int i = 0; i<sequences.size(); i++) {
			for(int j = i+1; j<sequences.size(); j++) {
				if(sequences.get(i).length() > sequences.get(j).length()) {
					String large = sequences.get(i);
					String small = sequences.get(j);
					sequences.set(i, small);
					sequences.set(j, large);
				}
			}
		}
		System.out.println(sequences);
		return sequences;
	}
	
	public static List<String> sortWords(List<String>words){
		for(int i = 0; i<words.size(); i++) {
			for(int j = i+1; j<words.size(); j++) {
				if(words.get(i).compareTo(words.get(j)) > 0) {
					String small = words.get(i);
					String large = words.get(j);
					words.set(i, large);
					words.set(j, small);
				}
			}
		}
		System.out.println(words);
		return words;
	}
	
	//Add other methods here
}