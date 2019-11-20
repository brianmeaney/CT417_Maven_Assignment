package nuigalway.app;
import java.util.ArrayList;
import org.joda.time.DateTime;

public class Student {

	private String name;
	private int age;
	private DateTime dob;
	private int id;
	private String username;
	private String course;
	private ArrayList<Module> modules = new ArrayList<>();

	public Student(String name, int age, DateTime dob, int id, String course, ArrayList<Module> modules) {
		this.name = name;
		this.age = age;
		this.dob = dob;
		this.id = id;
		this.course = course;
		this.modules = modules;
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

	public DateTime getDob() {
		return dob;
	}

	public void setDob(DateTime dob) {
		this.dob = dob;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getUsername() {
		username = getName() + getAge();
		return username;
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

	public ArrayList<Module> getModules() {
		return modules;
	}

	public void setModules(ArrayList<Module> modules) {
		this.modules = modules;
	}

	
	
	
}
