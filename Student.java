package org.student;

import org.college.College;

public class Student extends College {
	
	public void studentName() {
		System.out.println("name is sravya");
	}
public void studentDept() {
	System.out.println("stddep is CSE");
}
public void studentId() {
	System.out.println("id is 1234");
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Student std=new Student();
College col=new College();
col.collegeName();
std.collegeCode();
std.collegeRank();
col.deptName();
std.studentName();
std.studentDept();
std.studentId();

	}

}
