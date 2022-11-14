import java.util.Scanner;

//WAP to implement Pangram Checking with least inbuilt methods being used.
public class Panagram {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a string to check if it is panagram:");
		String s = scanner.nextLine();
		s = s.trim().toLowerCase();
		s = s.replace(" ", "");
		s = s.replace(",", "");
		
		boolean panagram = true;
		int[] chararray = new int [26];
		for(int i=0;i<s.length();i++) {
			chararray[s.charAt(i)-97]++;
		}
		for(int i=0;i<chararray.length;i++) {
			if(chararray[i]==0) {
				panagram=false;
				break;
			}
		}
		if(panagram) {
			System.out.println(s+" is a panagram");
		}else System.out.println(s+" is  not a panagram");

	}

}
