import java.util.Scanner;

public class DuplicateChars {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a string with repititive chars:");
		String s = scanner.nextLine();
		s=s.trim().toLowerCase();
		s=s.replace(" ", "");
		int [] duplicateArray = new int[26];
		String duplicatetring = "";
		for(int i=0;i<s.length();i++) {
			duplicateArray[(s.charAt(i))-97]++;
		}
		System.out.println("Given array:"+s);
		System.out.println("Duplicates characters in the array:");
		for(int i=0;i<duplicateArray.length;i++) {
			if(duplicateArray[i]>1) {
				duplicatetring+=((char)(i+97));
				
		}
		}
			System.out.println(duplicatetring);
			System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
		for(int i=0;i<duplicateArray.length;i++) {
			if(duplicateArray[i]>1) {
				System.out.println((char)(i+97)+" presented in the given array "+duplicateArray[i]+" times");
				
			}
		}
	}

}
