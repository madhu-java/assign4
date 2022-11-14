import java.util.Scanner;

//WAP to find if String contains all unique characters.
public class AllUniqOrNot {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a string to check if it contains all unique characters :");
		String s = scanner.nextLine();
		s = s.trim().toLowerCase();
		s = s.replace(" ", "");
		boolean allUnique = true;
		int[]  arr = new int[26];
		for(int i=0;i<s.length();i++) {
			arr[s.charAt(i)-97]++;
		}
		for(int i=0;i<arr.length;i++) {
			if(arr[i]>1) {
				allUnique=false;
			}
		}
		if(allUnique) {
			System.out.println(s+" contains all unique characters");
		}else System.out.println(s+"  doen't contains all unique characters");
		

	}

}
