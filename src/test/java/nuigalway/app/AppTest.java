package nuigalway.app;

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
	
	@Before
	public void setupData() {
		ArrayList<Module> modules = new ArrayList<Module>();
		Module m1 = new Module("moduleA", 34);
		Module m2 = new Module("moduleB", 35);
		modules.add(m1);
		modules.add(m2);
		
		s1 = new Student("Brian", 21, new DateTime(1998, 5, 13, 0, 0, 0), 1, "BCT", modules);
	}
	
    @Test
    public void shouldAnswerWithTrue()
    {
        assertTrue( true );
    }
    
    @Test
    public void getStudentName() {
    	String expectedName = "Brian";
    	String returnedName = s1.getName();
    	assertTrue(expectedName == returnedName);
    }
    
    @Test
    public void getStudentsModules() {
    	String expectedUsername = "Brian21";
    	String returnedUsername = s1.getUsername();
    	assertTrue(expectedUsername == returnedUsername);
    }
    

}
