import java.util.Scanner;

//WAP to find the maximum occurring character in a String.
public class MaxOccurChar {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a string to find the maximum occurring character in a String :");
		String s = scanner.nextLine();
		s = s.trim().toLowerCase();
		s = s.replace(" ", "");
		int max =0;
		char maxOccurChar=' ';
		int[]  arr = new int[26];
		for(int i=0;i<s.length();i++) {
			arr[s.charAt(i)-97]++;
		}
		for(int i=0;i<arr.length;i++) {
			if(arr[i]>max) {
				max=arr[i];
				maxOccurChar=(char)(i+97);
			}
			}
		
		
			System.out.println(maxOccurChar+" is the maximum occurring character in a String");
		
		


	}

}
