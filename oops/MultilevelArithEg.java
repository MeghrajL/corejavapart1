package oops;

import java.util.Scanner;

class Addition1 {
	int a;
	int b;
	Scanner s = new Scanner(System.in);
	void add() {
		System.out.println("enter values for a & b");
		a=s.nextInt();
		b=s.nextInt();
		
		System.out.println(a+b);
	}
}

class Subtraction1 extends Addition1{
	void sub() {
		System.out.println(a-b);
	}	
}

class Mul extends Subtraction1{
	void mul() {
		System.out.println(a*b);
	}	
}

class Div extends Mul{
	void div() {
		System.out.println(a/b);
	}	
}

public class MultilevelArithEg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Div d = new Div();
		d.add();
		d.sub();
		d.mul();
		d.div();
	}

}
