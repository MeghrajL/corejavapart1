package PackageEg;

public class Employee {

	int eno;
	String ename;
	public Employee() {};
	public Employee(int eno,String ename){
		this.eno =eno;
		this.ename = ename;
	}
	
	public void display() {
		System.out.println(eno + " " + ename); 
	}
	/*public static void main(String[] args) {
		// TODO Auto-generated method stub
			

	}*/
	
	
}
