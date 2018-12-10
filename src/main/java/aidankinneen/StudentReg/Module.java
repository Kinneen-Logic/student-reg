package aidankinneen.StudentReg;

import java.util.ArrayList;

public class Module {
	private String moduleID;
	private String moduleName;
	private ArrayList<Student> students;
	
	//constructor take 5 parameters (String, ArrayList objects)
	//Store student objects in arraylists for a module
	public Module(String moduleID, String moduleName, ArrayList<Student> students) {
		this.moduleID = moduleID;
		this.moduleName = moduleName;
		this.students = students;
	}

	//setters and getters
	public String getModuleID() {
		return moduleID;
	}

	public void setModuleID(String moduleID) {
		this.moduleID = moduleID;
	}

	public String getModuleName() {
		return moduleName;
	}

	public void setModuleName(String moduleName) {
		this.moduleName = moduleName;
	}

	public ArrayList<Student> getStudents() {
		return students;
	}

	public void setStudents(ArrayList<Student> students) {
		this.students = students;
	}

	//toString to print module info
	@Override
	public String toString() {
		return "Module [moduleID=" + this.getModuleID() + ", moduleName=" + this.getModuleName() + ", students=" + this.getStudents() + "]";
	}
	
}
