package masteringJava;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.ArrayList;

public class PassingListAsArguement {
	
	public static void main(String[] args){
		String[] strings = {"monster", "player", "queen", "hero", "hero"};
		List<String> words = new ArrayList<>(Arrays.asList(strings));
		System.out.println(instancesWord(words, "hero"));
		words.add("hero");
		System.out.println(instancesWord(words, "hero"));
		
		List<Character> letters = Arrays.asList('a', 'r', 'o', 'u', 'n', 'd');
		Collections.sort(letters, Collections.reverseOrder());
		System.out.println(letters);

		List<Character> letters2 = Arrays.asList('a', 'r', 'o', 'u', 'n', 'd');
		Collections.reverse(letters2);
		System.out.println(letters2);
		int i = 1;
		System.out.println((char)(--i%26+'A')/26);
		System.out.println(convertToTitle(1));
		
	}
	
	public static String convertToTitle(int n) {
        StringBuilder solution = new StringBuilder();
        while(n > 0){
            solution.insert(0, (char)(--n % 26 + 'A'));
            n /= 26;
        }return solution.toString();
    }
	
	private static int instancesWord(List<String> list,String targetWord){
		int count = 0;
		for(String el: list){
			if(el.equals(targetWord)){
				count++;
			}
		}
		return count;
	}
	
	
	
}
