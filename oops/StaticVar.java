package oops;

class Students{
	int rno;
	String name;
	static String coursename;
}

public class StaticVar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Students s1= new Students();
		Students s2= new Students();
		Students s3= new Students();
		
		Students.coursename = "JFS";
		
		s1.rno = 1;
		s1.name = "stud1";
		
		s2.rno = 2;
		s2.name = "stud2";
		
		s3.rno = 3;
		s3.name = "stud3";
		
		System.out.println(s1.rno + " " + s1.name +" "+s1.coursename);
		System.out.println(s2.rno + " " + s2.name +" "+s2.coursename);
		System.out.println(s3.rno + " " + s3.name +" "+s3.coursename);
		
		s2.name = "stud";
		s2.coursename ="python";
		
		System.out.println(s1.rno + " " + s1.name +" "+s1.coursename);
		System.out.println(s2.rno + " " + s2.name +" "+s2.coursename);
		System.out.println(s3.rno + " " + s3.name +" "+s3.coursename);
	}

}
