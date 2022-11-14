import java.util.Scanner;

//WAP to count the number of consonants, vowels, special characters in a String.
public class CountEOSchars {

	public static void main(String[] args) {
		// Special Characters(32–47 / 58–64 / 91–96 / 123–126)
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a string with repititive chars:");
		String s = scanner.nextLine();
		s = s.trim().toLowerCase();
		s = s.replace(" ", "");
		int vowels = 0, consonents = 0, special = 0;
		for (int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);
			if (c >= 'a' && c <= 'z') {
				if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
					vowels++;
				} else
					consonents++;
			} else
				special++;

		}
		System.out.println("Given string:" + s);
		System.out.println("No. of vowels present:" + vowels);
		System.out.println("No. of consonents present:" + consonents);
		System.out.println("No. of special chars present:" + special);
	}

}
