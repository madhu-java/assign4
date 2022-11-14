import java.util.Scanner;

//check if a given string is plaindrome or not
public class Palin {

	public static void main(String[] args) {
		String s;
//		Scanner scanner = new Scanner(System.in);
//		System.out.println("Enter a string with repititive chars:");
//		 s = scanner.nextLine();
//		s=s.trim().toLowerCase();
		String reverse = "";
		s="2552";
		for(int i= s.length()-1;i>=0;i--) {
			reverse+=s.charAt(i);
		}
     System.out.println("Given string:"+s);
     System.out.println("Reverse of given string:"+reverse);
     if(s.equalsIgnoreCase(reverse)) {
    	 System.out.println(s+" is a palindrome");
     }else{
    	 System.out.println(s+" is  not a palindrome");
     }
	}

}
