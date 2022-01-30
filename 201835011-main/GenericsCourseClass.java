package pack_201835011;

public class GenericsCourseClass<T> {

	private T course_code;
	private String course_name;

	public GenericsCourseClass(T data) {
		this.course_code = data;
	}
	public void setCourse_code(T course_code) {
		this.course_code = course_code;
	}
	public T getCourse_code() {
		return this.course_code;
	}

	public String getCourse_name() {
		return course_name;
	}

	public void setCourse_name(String course_name) {
		this.course_name = course_name;
	}

	

}