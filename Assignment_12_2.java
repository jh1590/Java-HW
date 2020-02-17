import java.util.ArrayList;
import java.util.Scanner;

public class Assignment_12_2 {
	public static void main(String[] args) {

		Scanner scanner1 = new Scanner(System.in);
		System.out.println("Enter words");
		String str1 = scanner1.nextLine();
		
		ArrayList<String> values = new ArrayList<String>();
		while (!str1.equalsIgnoreCase("next")) {
			values.add(str1);
			str1 = scanner1.nextLine();
		}

		String str2 = scanner1.nextLine();
		int len = Integer.valueOf(str2);

		String[] words = new String[values.size()];
		for (int i = 0; i < words.length; i++) {
			words[i] = values.get(i);
		}

		int answer = wordsCount(words, len);

		System.out.println(answer);
		scanner1.close();

	}

	public static int wordsCount(String[] words, int len) {

		int counter = 0;

		for (String word : words) {
			if (word.length() == len) {
				counter++;
			}
		}

		return counter;
	}
}