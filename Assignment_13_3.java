
import java.util.ArrayList;
import java.util.Scanner;

public class Assignment_13_3 {
	public static void main(String[] args) {

		Scanner scanner1 = new Scanner(System.in);
		System.out.println("Enter answers");
		String str1 = scanner1.nextLine();
		ArrayList<String> values = new ArrayList<String>();
		while (!str1.equalsIgnoreCase("end")) {
			values.add(str1);
			str1 = scanner1.nextLine();
		}

		String[] answers = new String[values.size()];
		for (int i = 0; i < answers.length; i++) {
			answers[i] = values.get(i);
		}
		System.out.println(values);
		int answer = correction(answers);

		System.out.println(answer);
		scanner1.close();

	}

	public static int correction(String[] nums) {

		String[] key = { "a", "a", "b", "b" };
		int length = key.length;
		int score = 0;

		for (int i = 0; i < length; i++) {

			String x = nums[i];
			String y = key[i];

			if (x.equalsIgnoreCase(y)) {
				score = score + 4;
			}

			else if (x.equalsIgnoreCase("?")) {
			}

			else {
				score = score - 1;
			}
		}

		return score;
	}
}