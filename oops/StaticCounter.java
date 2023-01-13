package oops;

public class StaticCounter {

	int a = 0;
	static int b=0;
	public StaticCounter(){
		a++;
		b++;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StaticCounter s1 = new StaticCounter();
		StaticCounter s2 = new StaticCounter();
		StaticCounter s3 = new StaticCounter();
		
		System.out.println(s1.a);
		System.out.println(s1.b);
	}

}
