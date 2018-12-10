 package aidankinneen.StudentReg;

import java.util.ArrayList;
import org.joda.time.DateTime;

public class CourseProgramme {
	private String courseName;
	private ArrayList<Module> modList;
	private ArrayList<Student> studList;
	private DateTime startD;
	private DateTime endD;
	
	//constructor take 5 parameters (String, ArrayList and DateTime objects)
	public CourseProgramme(String courseName, ArrayList<Module> modList, ArrayList<Student> studList, DateTime startD, DateTime endD) {
		this.courseName = courseName;
		this.modList = modList;
		this.studList = studList;
		this.startD = startD;
		this.endD = endD;
	}

	//setters and getters
	public String getCourseName() {
		return courseName;
	}

	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}

	public ArrayList<Module> getModList() {
		return modList;
	}

	public void setModList(ArrayList<Module> modList) {
		this.modList = modList;
	}

	public ArrayList<Student> getStudList() {
		return studList;
	}

	public void setStudList(ArrayList<Student> studList) {
		this.studList = studList;
	}

	public DateTime getStartD() {
		return startD;
	}

	public void setStartD(DateTime startD) {
		this.startD = startD;
	}

	public DateTime getEndD() {
		return endD;
	}

	public void setEndD(DateTime endD) {
		this.endD = endD;
	}

	//toString to print courseprogramme info
	@Override
	public String toString() {
		return "CourseProgramme [courseName=" + this.getCourseName() + ", modList=" + this.getModList() + ", studList=" + this.getStudList()
				+ ", startD=" + this.getStartD() + ", endD=" + this.getEndD() + "]";
	}
	
	
}
