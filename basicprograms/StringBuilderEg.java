package basicprograms;

public class StringBuilderEg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuffer sb = new StringBuffer("Meghraj ");
		System.out.println(sb.append("Lot")); 
		System.out.println(sb.insert(8, "vilas "));
		System.out.println(sb.reverse()); 
		System.out.println(sb.replace(0,17,"Lot Meghraj Vilas"));
	}

}
