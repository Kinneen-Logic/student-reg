package aidankinneen.StudentReg;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class StudentRegTest {
	
	@Test
	public void getUsername() {
		Student aidan = new Student("Aidan Kinneen", 22, "07/12/1995");
		String getUsername = aidan.getUsername();
		String username = aidan.getName() + aidan.getAge();
		assertEquals(getUsername, username);
		System.out.println(getUsername);
		System.out.println(username);
	}
	
	
}