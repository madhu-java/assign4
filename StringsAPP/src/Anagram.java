import java.util.Scanner;

//WAP to implement Anagram Checking least inbuilt methods being used.
public class Anagram {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a string to check if it is anagram:");
		String s = scanner.nextLine();
		s = s.trim().toLowerCase();
		s = s.replace(" ", "");
		System.out.println("Enter a string to check if it is anagram:");
		String s1 = scanner.nextLine();
		s1 = s1.trim().toLowerCase();
		s1 = s1.replace(" ", "");
		char[] ch1 = addtoCharArray(s);
		char[] ch2 = addtoCharArray(s1);
		sort(ch1);
		sort(ch2);
		boolean anagram = compare(ch1, ch2);
		System.out.println("given string one: " + s);
		System.out.println("given string two: " + s1);
		if (anagram)
			System.out.println("Given  strings are anagram");
		else
			System.out.println("Given  strings are not  anagram");
	}

	public static boolean compare(char[] ch1, char[] ch2) {
		if (ch1.length != ch2.length)
			return false;
		for (int i = 0; i < ch1.length; i++) {
			if (ch1[i] != ch2[i]) {
				return false;
			}
		}
		return true;
	}

	public static char[] addtoCharArray(String s) {
		char[] ch = new char[s.length()];
		for (int i = 0; i < s.length(); i++) {
			ch[i] = s.charAt(i);
		}
		return ch;
	}

	public static void sort(char[] ch) {
		for (int i = 0; i < ch.length; i++) {
			for (int j = i; j < ch.length; j++) {
				if (ch[i] > ch[j]) {
					char temp = ' ';
					temp = ch[i];
					ch[i] = ch[j];
					ch[j] = temp;
				}
			}
		}
	}

}
