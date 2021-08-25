package Week3.Day1.org.student;

import Week3.Day1.org.department.Assigment2_Week3_Department;


public class Assigment2_Week3_Student extends Assigment2_Week3_Department{


	
	public void studentName()
	{
		System.out.println("Student name = Sambavi");
	}
	
	public void studentDept()
	{
		System.out.println("Student Dept = Mech");
	}
	
	public void studentId()
	{
		System.out.println("Student Id = 123");
	}



public static void main(String[] args) 
{
	
	Assigment2_Week3_Student S1 = new Assigment2_Week3_Student();
S1.collegeCode();
S1.collegeName();
S1.collegeRank();
S1.deptName();
S1.studentDept();
S1.studentId();
S1.studentName();
	
}
}

	


