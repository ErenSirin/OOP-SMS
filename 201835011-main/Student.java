package pack_201835011;

public class Student extends Person {
	public String student_surname;
	String grade_code;
	@Override
	public void goToSchool() {
		System.out.println("goToSchool:" + this.getName() + " is going to school");
		
	}
	public void sayYourName() {
		System.out.println( this.getName() + " is saying name");
	}

}
