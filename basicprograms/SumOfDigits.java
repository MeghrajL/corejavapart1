package basicprograms;

public class SumOfDigits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//rev
		int num=345,rem,rev=0;
		while(num>0) {
			rem = num % 10;
			rev = rev * 10 + rem ;
			num /= 10; 
		}
		System.out.println(rev);
		
		//sum
		int num1=345,rem1,sum1=0;
		while(num1>0) {
			rem1 = num1 % 10;
			sum1 += rem1; 
			num1 /= 10; 
		}
		System.out.println(sum1);
		
		//pallindrome
		int num2=343,rem2,rev2=0,num2copy=num2;
		while(num2>0) {
			rem2 = num2 % 10;
			rev2 = rev2 * 10 + rem2 ;
			num2 /= 10; 
		}
		System.out.println(rev2);
		if(num2copy==rev2)
			System.out.println("pallindrome");
		else
			System.out.println("not pallindrome");
	}

}
