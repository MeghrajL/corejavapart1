package oops;
class std11 {
	int rno=10;
	void displayRno() {
		System.out.println(rno);
	}
}

class EnggStud1 extends std11{
	String branch = "IT";
	void displayBranch() {
		System.out.println(branch);
	}
}

class BscStud extends std11{
	String branch = "Bsc";
	void displayBsc() {
		System.out.println(branch);
	}
}
public class HierarchialInheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EnggStud1 es = new EnggStud1();
		es.displayRno();
		es.displayBranch();
		BscStud b = new BscStud();
		b.displayRno();
		b.displayBsc();

	}

}
