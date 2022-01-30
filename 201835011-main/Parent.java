package pack_201835011;

public class Parent extends Person {
    public String ParentPhoneNumber;
    public Object parent_surname;

    @Override
    public void goToSchool() {
        System.out.println("goToSchool:" + this.getName() + " is going to school");

    }
    public void sayYourName() {
        System.out.println( this.getName() + " is saying name");
    }

}
