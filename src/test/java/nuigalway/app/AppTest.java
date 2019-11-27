package nuigalway.app;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.util.ArrayList;

import org.joda.time.DateTime;
import org.junit.Before;
import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    /**
     * Rigorous Test :-)
     */
	static Student s1;
	static Module m1;
	static Course c1;
	static ArrayList<Module> modules;
	static ArrayList<Student> students;
	
	@Before
	public void setupData() {
		modules = new ArrayList<Module>();
		students = new ArrayList<Student>();
		m1 = new Module("moduleA", 34);
		Module m2 = new Module("moduleB", 35);
		modules.add(m1);
		modules.add(m2);
		
		s1 = new Student("Brian", 21, new DateTime(1998, 5, 13, 0, 0, 0), 1, "BCT", modules);
		Student s2 = new Student("Kate", 20, new DateTime(1999, 4, 2, 0, 0, 0), 2, "BCT", modules);
		students.add(s1);
		students.add(s2);
		c1 = new Course("Comp Science", modules, students, new DateTime(2019, 9, 1, 0,0,0), new DateTime(2020, 5, 31, 0, 0, 0));
		
	}
	
    
    @Test
    public void getStudentName() {
    	String expectedName = "Brian";
    	String returnedName = s1.getName();
    	assertTrue(expectedName == returnedName);
    }
    
    @Test
    public void getStudentsUsernames() {
    	String expectedUsername = "Brian21";
    	String returnedUsername = s1.getUsername();
    	assertTrue(expectedUsername.equals(returnedUsername));
    }
    
    @Test
    public void getAge() {
    	int expAge = 21;
    	int retAge = s1.getAge();
    	assertTrue(expAge == retAge);
    }
    
    @Test
    public void getStudentModules() {
    	ArrayList<Module> expModules = s1.getModules();
    	assertArrayEquals(expModules.toArray(), modules.toArray());
    }
    
    @Test
    public void setAndGetModuleName() {
    	String newModName = "New Name";
    	m1.setName(newModName);
    	String returnedName = m1.getName();
    	assertTrue(newModName == returnedName);
    }
    
    @Test
    public void getStudentsFromCourse() {
    	ArrayList<Student> expStudents = c1.getStudents();
    	assertArrayEquals(expStudents.toArray(), students.toArray());
    }
    
    

}
