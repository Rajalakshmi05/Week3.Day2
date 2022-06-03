package Week3.Day2;

public class MissingElementInAnArray {

	public static void main(String[] args) {
		int total;
		int[] arr1 = new int[] { 1, 2, 3, 4, 6, 7 };
		total = 7;
		int misnum = total * ((total + 1) / 2);
		int n = 0;
		for (int i : arr1) {
			n += i;
		}
		System.out.println(misnum - n + " is the Missing Number");
		System.out.print("\n");
	}
}
