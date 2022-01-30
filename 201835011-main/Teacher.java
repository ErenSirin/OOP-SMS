package pack_201835011;
public class Teacher extends Person {
	String department_name;
	@Override
	public void goToSchool() {
		System.out.println("goToSchool:" + this.getName() + " is going to school");
		
	}
	public void sayYourName() {
		System.out.println(this.getName() + " is saying name");
	}
	

}
