package aidankinneen.StudentReg;

public class Student {
	private static int studID = 13539243; //class variable used to make student ID's
	private String name;
	private int age;
	private String dateOfB;
	private int studentID;
	
	//Student constructor takes name, age and date of birth to generate new student object
	public Student(String name, int age, String dateOfB) {
		super();
		this.name = name;
		this.age = age;
		this.dateOfB = dateOfB;
		this.studentID = studID++; //increment student ID for each new student
	}

	public int getAge() {
		return age;
	}
	
	//Concatenate name and age of student to get username
	public String getUsername() {
		String user = this.name + this.age;
		System.out.println(user);
		return user;
	}
	
	//setters and getters to provide encapsulation for student class
	public void setAge(int age) {
		this.age = age;
	}
	public String getDateOfB() {
		return dateOfB;
	}
	public void setDateOfB(String dateOfB) {
		this.dateOfB = dateOfB;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public int getStudentID() {
		return studentID;
	}
	public void setStudentID(int studentID) {
		this.studentID = studentID;
	}
	
	@Override
	public String toString() {
		return "Student [name=" + this.getName() + ", age=" + this.getAge() + ", dateOfB=" + this.getDateOfB() + ", studentID=" + this.getStudentID() + "]";
	}
	
	

	
	
	
	
	
}
