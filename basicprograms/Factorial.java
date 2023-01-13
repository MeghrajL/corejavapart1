package basicprograms;

public class Factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  int i,fact=1;  
		  int number=5;
		  /*for(i=1;i<=number;i++){    
		      fact=fact*i;    
		  }    */
		  i=1;
		  while(i<=number) {
			  fact = fact * i;
			  i++;
		  }
		  System.out.println("Factorial: "+fact);    
	}

}
