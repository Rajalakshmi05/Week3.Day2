package Week3.Day2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class FindMissingNumber {

	public static void main(String[] args) {
		Integer[] arr1 = { 4, 6, 7, 2, 3, 1, 9, 10, 8, 8, 6, 2 };
		Set<Integer> uq = new TreeSet<Integer>();
		uq.addAll(Arrays.asList(arr1));
		List<Integer> list1 = new ArrayList<Integer>(uq);
		for (int i = 0; i < list1.size(); i++) {
			if (list1.get(i) != i + 1) {
				System.out.println("The Missing Nunber is:");
				System.out.println(i + 1);
				break;

			}

		}
	}
}
