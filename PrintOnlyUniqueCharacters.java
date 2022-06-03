package Week3.Day2;

import java.util.LinkedHashSet;
import java.util.Set;

public class PrintOnlyUniqueCharacters {

	public static String name = "MADAM";
	public static Set<Character> uniqueSet = new LinkedHashSet<Character>();

	public char[] stringToCharArr(String input) {
		char[] charArray = input.toCharArray();
		return charArray;}

	public Set<Character> Unique(char[] charArray) {

		for (int i = 0; i < charArray.length; i++) {
			if (!(uniqueSet.contains(charArray[i]))) {
				uniqueSet.add(charArray[i]);
			} else
				uniqueSet.remove(charArray[i]);
		}
		return uniqueSet;
	}

	public static void main(String[] args) {

		PrintOnlyUniqueCharacters puc = new PrintOnlyUniqueCharacters();

		uniqueSet = puc.Unique(puc.stringToCharArr(name));
		System.out.println(uniqueSet);


	}  

}
