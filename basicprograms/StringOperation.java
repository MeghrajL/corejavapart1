package basicprograms;

import java.util.Arrays;

public class StringOperation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1 = "Meghraj ";
		String s5 = "meghraj ";
		String s2 = "Lot";
		System.out.println(s1+s2);
		System.out.println(s1.concat(s2));
		System.out.println(s1.length());
		System.out.println(s1.substring(4,7));
		System.out.println(s1.toUpperCase());
		
		String s3 ="",s4=" ";
		System.out.println(s3.isEmpty());
		System.out.println(s3.isBlank());
		
		char[] arr = new char[7];
		s1.getChars(0, 7, arr, 0);
		System.out.println(Arrays.toString(arr));
		
		System.out.println(s1.compareTo(s5));
		System.out.println(s1.equalsIgnoreCase(s5));
		System.out.println(s1.startsWith("Me"));
		System.out.println(s1.endsWith("j"));
		System.out.println(s5.replace("meghraj ", "megh"));
		System.out.println(s5.repeat(5));
		System.out.println(s5.charAt(5));
		System.out.println(s5.stripTrailing());//removes ending whitespaces
		//System.out.println(s5.stripLeading());//removes starting whitespaces
	}

}
