package pack_201835011;

public class Person implements SchoolInformation {
    private String name;
    private Integer id;
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public Integer getId() {
        return id;
    }
    public void setId(Integer id) {
        this.id = id;
    }
    public void goToSchool() {
        System.out.println("goToSchool parent");

    }
    public void sayYourName() {
        System.out.println("Parent: sayYourName");
    }

}
