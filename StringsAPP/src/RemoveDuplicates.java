import java.util.Arrays;
import java.util.Scanner;

public class RemoveDuplicates {

	public static void main(String[] args) {
//		StringBuffer sb = new StringBuffer("dBananadanananccccbb");
//		StringBuffer s =new StringBuffer();
//		StringBuffer d =new StringBuffer();
//		char[] c = sb.toString().toLowerCase().toCharArray();
//				 Arrays.sort(c);
////		System.out.println(c);
//	 s.append( String.valueOf(c));
//	 System.out.println(s);
//	 //sol 1:
//	 int[] arr = new int[26];
//	 for(int i=0;i<s.length();i++) {
//		 arr[s.charAt(i)-97]++;
//		 
//	 }
//	 System.out.println(String.valueOf(arr));
//	 System.out.println("Without duplicates:"+s);
//	 for(int i=0;i<arr.length;i++) {
//		 if(arr[i]>0) {
//			 System.out.print((char)(i+97));
//		 }
//	 }
	 //sol 2:
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a string with repititive chars:");
		String s = scanner.nextLine();
		s=s.trim().toLowerCase();
		//String s = "iiiibaniterwetwyisvabcashdgashdashdashdasgjdhuq3yrgxvnxxJXkAJSJHDHASVCianaiiiisgdhasgduaerhjzcnkasjdoaidoaiii";
		String d =" ";
	 for(int i=0;i<s.length()-1;i++) {
		 //System.out.println(d);
		 for(int j=0;j<d.length();j++) {
			 if(!d.contains(s.charAt(i)+"")) {
				 d=d+s.charAt(i);
			 }
		 }
	 }
	 System.out.println("Actual string:"+s);
	 System.out.println("String after removing duplicate characters:"+d.trim());
	 
		
	}

}
