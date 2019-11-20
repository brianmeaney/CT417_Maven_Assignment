package nuigalway.app;
import java.util.ArrayList;

public class Student {

	private String name;
	private int age;
	private String dob;
	private int id;
	private String username;
	private String course;
	private ArrayList<String> modules = new ArrayList<>();

	public Student(String name, int age, String dob, int id, String username, String course, ArrayList<String> modules) {
		this.name = name;
		this.age = age;
		this.dob = dob;
		this.id = id;
		this.username = username;
		this.course = course;
		this.setModules(modules);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getDob() {
		return dob;
	}

	public void setDob(String dob) {
		this.dob = dob;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getUsername() {
		return getName() + getAge();
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getCourse() {
		return course;
	}

	public void setCourse(String course) {
		this.course = course;
	}

	public ArrayList<String> getModules() {
		return modules;
	}

	public void setModules(ArrayList<String> modules) {
		this.modules = modules;
	}

	
	
	
}
