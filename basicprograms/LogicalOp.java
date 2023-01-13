package basicprograms;

public class LogicalOp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=3311,b=320,c=30,age=20;
		System.out.println("(a<b)&&(b<a) " +((a<b)&&(b<a)));
		System.out.println("(a<b)||(b<a) " +((a<b)||(b<a)));
		System.out.println("!(a>b) " +(!(a>b)));
		//ternary
		System.out.println(a%2==0 ? "even":"odd"); 
		System.out.println(a>b ? "a is greater than b":"b is greater than a");
		System.out.println(a>=b && a>=c ? "a is greater than b & c": b>=a && b>=c ? "b is greater than a & c": "c is greater than a & b");
		System.out.println(age>=18 ? "Eligible to vote":"Not Eligible to vote"); 
	}

}
