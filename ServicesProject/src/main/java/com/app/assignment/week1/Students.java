package main.java.com.app.assignment.week1;

import java.util.HashMap;
import java.util.Map;

public class Students {
	
	public String id;
	public String fname;
	public String lname;
	public String grade;
	public int tuitionCost;
	public static String[][] students = {	{"1","Noah", "Alexander", "A-"},
			{"2","Emma", "Davis", "C"},
			{"3","Olivia", "Garcia", "B+"},
			{"4","Liam", "Wilson", "D"},
			{"5","Jacob", "Williams", "F"},
			{"6","Jane", "Miller", "D"},
			{"7","Isabella", "Rodriguez", "A-"},
			{"8","Ethan", "Davis", "A-"},
			{"9","Jane", "Hall", "A-"},
			{"10","Sophia", "Butler", "A-"} };
	public static Map<String, Integer> studentMap = new HashMap<>();
	
	public Students() {
		super();
		studentMap.put("1", 1500);
		studentMap.put("2", 500);
		studentMap.put("2", 3500);
		studentMap.put("3", 985);
		studentMap.put("4", 3450);
		studentMap.put("5", 7610);
		studentMap.put("6", 6569);
		studentMap.put("6", 110);
		studentMap.put("6", 2500);		
		studentMap.put("7", 2348);
		studentMap.put("8", 5678);
		studentMap.put("9", 653);
		studentMap.put("10", 1123);

	}
	public Students(String string, String string2, String string3, String string4) {
		// TODO Auto-generated constructor stub
	}
	public String[][] getStudents() {
		return students;
	}

	public void setStudents(String[][] students) {
		this.students = students;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getFname() {
		return fname;
	}

	public void setFname(String fname) {
		this.fname = fname;
	}

	public String getLname() {
		return lname;
	}

	public void setLname(String lname) {
		this.lname = lname;
	}

	public String getGrade() {
		return grade;
	}

	public void setGrade(String grade) {
		this.grade = grade;
	}

	public int getTuitionCost() {
		return tuitionCost;
	}

	public void setTuitionCost(int tuitionCost) {
		this.tuitionCost = tuitionCost;
	}

	

}
