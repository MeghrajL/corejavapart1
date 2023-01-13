package oops;

public class StudentEncap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*Student s = new Student();
		s.setRno(10);
		s.setName("Meghraj");
		s.setCity("Karjat");*/
		
		//param constructor
		Student s = new Student(10,"Meghraj","karjat");
		System.out.println(s.getRno() + s.getName() + s.getCity());
	
		//change value
		s.setRno(19);
		System.out.println(s.getRno());
	}

}
