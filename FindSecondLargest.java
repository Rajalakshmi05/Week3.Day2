package Week3.Day2;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class FindSecondLargest {

		public static int SecLarge(Integer[] sl, int total) {
		List<Integer> list = Arrays.asList(sl);
		Collections.sort(list);
		int element = list.get(total - 2);
		return element;
	}

	public static void main(String args[]) {
		Integer sl[] = { 3, 2, 11, 4, 6, 7 };

		System.out.println("Second Largest number is " + SecLarge(sl, 6));

	}

}
