import java.util.ArrayList;
import java.util.Scanner;

public class Assignment_12 {
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

		int[] scoresIncreasing = new int[Values.size()];
		for (int i = 0; i < scoresIncreasing.length; i++) {
			scoresIncreasing[i] = Values.get(i);
		}

		boolean answer = scoresIncreasing(scoresIncreasing);

		System.out.println(answer);
		scanner1.close();

	}

	public static boolean scoresIncreasing(int[] scores) {

		int length = scores.length;
		boolean isIncreasing = true;

		for (int i = 0; i < length - 1; i++) {
			if (scores[i] > scores[i + 1]) {
				isIncreasing = false;
				break;
			}
		}

		return isIncreasing;
	}
}