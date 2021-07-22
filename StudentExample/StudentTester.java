package com.xworkz.Encapsulation.StudentExample;

public class StudentTester {

	public static void main(String[] args) {

		Student sahana = new Student();

		sahana.setAge(22);
		sahana.setRoolNo(12);
		sahana.setStudentName("sahana");

		sahana.getAge();
		sahana.getRoolNo();
		sahana.getStudentName();
		System.out.println(
				"Age=" + sahana.getAge() + "RoolNumber=" + sahana.getRoolNo() + "Name= " + sahana.getStudentName());

	}

}
