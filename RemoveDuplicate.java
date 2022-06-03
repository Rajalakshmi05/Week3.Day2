package Week3.Day2;

import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicate {

	public static void main(String[] args) {
		String name1 = "We learn java basics as part of java sessions in java week1";
		char[] allChars = name1.toCharArray();
		System.out.println(allChars);
		Set<Character> Unique = new LinkedHashSet<Character>();
		for (int i = 0; i < allChars.length; i++) {
			if (Unique.add(allChars[i])) {
				System.out.println(allChars[i]);
			}
		}

	}

}
