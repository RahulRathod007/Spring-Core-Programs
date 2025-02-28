package org.techhub;

public class College {
	private Student student;

	public Student getStudent() {
		return student;
	}

	public void setStudent(Student student) {
		this.student = student;
	}
	public void show()
	{
		System.out.println("Id\tName\tBranch");
		System.out.println("==========================");
		System.out.println(student.getId()+"\t"+student.getName()+"\t"+ student.getBranch());
	}
}
