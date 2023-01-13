package basicprograms;

public class ReverseStringEg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str= "Meghraj", newstr="";
        char ch;
        for (int i=0; i<str.length(); i++)
        {
          ch= str.charAt(i); 
          newstr= ch+newstr; 
        }
        System.out.println("Reversed word: "+ newstr);
        
        //tochararray
        String input = "Meghraj";
        
        char[] arr1 = input.toCharArray();
  
        for (int i = arr1.length - 1; i >= 0; i--)
            System.out.println(arr1[i]);
        
        //rev
        String inp = "Meghraj";
        
        StringBuilder input1 = new StringBuilder();
        input1.append(inp);
        input1.reverse();
        System.out.println(input1);
    }
	

}
