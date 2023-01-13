package oops;

class Emp {
	int eid=10;
	int eno;
	Emp(int eno){
		this.eno=eno;
	}
	void display() {
		System.out.println(eid + " " +eno);
	}
}

class Dept extends Emp{
	String dept = "IT";
	Dept(){
		super(19);
	}
	void display() {
		super.display();
		System.out.println(super.eid);
		System.out.println(dept);
	}
}

public class MethodOverriding {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Dept d = new Dept();
		d.display();
	}

}
