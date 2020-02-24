import java.util.ArrayList;
import java.util.Scanner;

public class Assignment_13_2 {
	public static void main(String[] args) {

		Scanner scanner1 = new Scanner(System.in);
		System.out.println("Enter numbers");
		String str1 = scanner1.nextLine();
		ArrayList<Integer> Values = new ArrayList<Integer>();
		while (!str1.equalsIgnoreCase("end")) {
			int a = Integer.valueOf(str1);
			str1 = scanner1.nextLine();
			Values.add(a);
		}

		int[] numbers = new int[Values.size()];
		for (int i = 0; i < numbers.length; i++) {
			numbers[i] = Values.get(i);
		}

		boolean answer = firstLast6(numbers);

		System.out.println(answer);
		scanner1.close();

	}

	public static boolean firstLast6(int[] nums) {

		int length = nums.length;
		boolean firstLast6 = false;

		if (nums[length - 1] == 6 || nums[0] == 6) {
			firstLast6 = true;
		}

		return firstLast6;
	}
}