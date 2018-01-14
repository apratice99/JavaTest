import java.util.Scanner;

public class Q2Test {
	String[] words = { "Zero", "One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine", "Ten",
			"Eleven", "Twelve", "Thirteen", "Fourteen", "Fifteen", "Sixteen", "Seventeen", "Eighteen", "Nineteen", "Twenty",
			"Thirty", "Forty", "Fifty", "Sixty", "Seventy", "Eighty", "Ninety"};

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println();
		int number = in.nextInt();

		Q2Test q2 = new Q2Test();
		System.out.println(q2.getWord(number));
		
		in.close();
	}

	String getWord(int number) {
		String convertedWord = null;
		if (number <= 20)
			convertedWord = words[number];
		else {
			int remainder =  number % 10;
			int quotient = number / 10;

			if(remainder != 0)
				convertedWord = words[quotient + 18] + words[remainder];
			else
				convertedWord = words[quotient + 18];
		}
		return convertedWord;
	}
}