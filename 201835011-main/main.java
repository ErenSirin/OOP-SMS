package pack_201835011;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class main {

	public static void main(String[] args) {

		Map<Integer, Object> studentMap = new HashMap<Integer, Object>();
		System.out.println("******PLEASE ENTER 3 STUDENT******");
		System.out.println("******ADDING STUDENT LIST******");
		for (int i = 3; i > 0; i--) {

			Student temp_student = insert_Student(i);
			studentMap.put(i, temp_student);

		}

		Map<Integer, Object> parentMap = new HashMap<Integer, Object>();
		System.out.println("****** PLEASE ENTER 3 Parent ******");
		System.out.println("****** ADDING Parent LIST ******");
		for (int i = 3; i > 0; i--) {

			Parent temp_parent = insert_Parent(i);
			parentMap.put(i, temp_parent);

		}

		ArrayList<Object> person_list = new ArrayList<Object>();
		System.out.println("******PLEASE ENTER 3 Teacher******");
		System.out.println("******ADDING TEACHER LIST******");
		for (int i = 1; i <= 3; i++) {

			Teacher temp_student = insert_Teacher(i);
			person_list.add(temp_student);

		}



		ArrayList<GenericsCourseClass<?>> course_list = new ArrayList<GenericsCourseClass<?>>();
		System.out.println("******PLEASE ENTER 3 COURSE******");
		System.out.println("*******ADDING COURSE LIST*****");

		for (int i = 1; i <= 3; i++) {
			Scanner myObj = new Scanner(System.in);
			System.out.println("Enter COURSE Name for : " + i);

			String StudentName = myObj.nextLine();
			course_list.add(insert_Course(StudentName));

		}



		System.out.println("******polymorphism ******");
		((Student) studentMap.get(1)).goToSchool();
		((Student) studentMap.get(2)).goToSchool();
		((Student) studentMap.get(3)).goToSchool();


		((Teacher) person_list.get(0)).goToSchool();
		((Teacher) person_list.get(1)).goToSchool();
		((Teacher) person_list.get(2)).goToSchool();

		((Student) studentMap.get(1)).sayYourName();
		((Student) studentMap.get(2)).sayYourName();
		((Student) studentMap.get(3)).sayYourName();


		((Parent) parentMap.get(1)).sayYourName();
		((Parent) parentMap.get(2)).sayYourName();
		((Parent) parentMap.get(3)).sayYourName();

		((Teacher) person_list.get(0)).sayYourName();
		((Teacher) person_list.get(1)).sayYourName();
		((Teacher) person_list.get(2)).sayYourName();

		System.out.println("*******LISTING-> Student LIST*****");

		studentMap.forEach((k, v) -> System.out.println((k + " : "  + ((Student) v).getName()) + " " + (((Student) v).student_surname) + " --> " + ((Student) v).grade_code));


		System.out.println("*******LISTING-> Parent LIST*****");

		parentMap.forEach((k, v) -> System.out.println((k + " : " +((Parent) v).getName()+ " " +((Parent) v).parent_surname)+" --> Phone Number : "+ ((Parent) v).ParentPhoneNumber));



		System.out.println("*******LISTING-> TEACHER LIST*****");

		person_list.forEach(person -> System.out.println(((Teacher) person).getName() +" --> " + ((Teacher) person).department_name));

		System.out.println("*******LISTING-> COURSE LIST*****");

		course_list.forEach(course -> System.out.println(course.getCourse_code()));

		System.out.println("******Generics Set Teacher and Student******");

		Set<Person> personSet = new HashSet<Person>();
		personSet.add(((Student) studentMap.get(1)));
		personSet.add(((Teacher) person_list.get(1)));


		System.out.println("*****using lambda on SET collection*******");
		personSet.forEach(person -> System.out.println(person.getName()));

		System.out.println("*****list update value with using lambda on studentMap*******");

		studentMap.entrySet().stream().sorted(Map.Entry.comparingByKey())
				.forEachOrdered(x -> System.out.println(((((Student) x.getValue()).grade_code + " updated"))));

		System.out.println("*******LISTING-> Student LIST after updating*****");

		studentMap.forEach((k, v) -> System.out.println((k + " : "  + ((Student) v).getName()) +" " + (((Student) v).student_surname) + " --> " + ((Student) v).grade_code));
	}

	public static Student insert_Student(int id) {
		Scanner myObj = new Scanner(System.in);
		System.out.println("FOR Student  : " + id);
		System.out.println("Enter Student Name : ");

		String StudentName = myObj.nextLine();
		System.out.println("Enter Student Surname : ");
		String student_surname = myObj.nextLine();
		System.out.println("Enter Student grade_code : ");

		String grade_code = myObj.nextLine();


		Student student = new Student();

		student.setName(StudentName);
		student.student_surname = student_surname;
		student.grade_code = grade_code;
		student.setId(id);


		return student;

	}

	public static Teacher insert_Teacher(int id) {
		Scanner myObj = new Scanner(System.in);
		System.out.println("FOR Teacher  : " + id);
		System.out.println("Enter Teacher Name : ");

		String TeacherName = myObj.nextLine();

		System.out.println("Enter Teacher department_name : ");

		String department_name = myObj.nextLine();

		Teacher teacher = new Teacher();

		teacher.setName(TeacherName);
		teacher.department_name = department_name;
		teacher.setId(id);

		return teacher;

	}


	public static Parent insert_Parent(int id) {
		Scanner myObj = new Scanner(System.in);
		System.out.println("FOR Parent  : " + id);
		System.out.println("Enter Parent Name : ");
		String ParentName = myObj.nextLine();
		System.out.println("Enter Parent Surname : ");
		String parent_surname = myObj.nextLine();
		System.out.println("Enter Parent Phone Number : ");
		String ParentPhoneNumber = myObj.nextLine();

		 Parent parent = new Parent();

		parent.setName(ParentName);
		parent.setId(id);
		parent.ParentPhoneNumber = ParentPhoneNumber;
		parent.parent_surname = parent_surname;

		return parent;

	}


	public static GenericsCourseClass<?> insert_Course(Object o) {
		GenericsCourseClass<?> new_course = null;
		if (o.getClass().getSimpleName().equals("String")) {
			new_course = new GenericsCourseClass<>((String) o);

		} else if (o.getClass().getSimpleName().equals("Integer")) {
			new_course = new GenericsCourseClass<>((Integer) o);

		}

		return new_course;

	}

}

