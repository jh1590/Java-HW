
import java.util.ArrayList;
import java.util.Scanner;

public class Assignment_13_1 {
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

		int answer = sum13(numbers);

		System.out.println(answer);
		scanner1.close();

	}

	public static int sum13(int[] nums) {

		int sum = 0;

		for (int x : nums) {

			if (x == 13) {
				break;
			}
			sum = sum + x;
		}

		return sum;
	}
}