/*
 * Assignment 08: Student.java
 *
 * Student name: Sarah Brennan
 * Student number: 2962279
 *
 */
import java.util.*;
class Student implements Comparable<Student>{
	
	/**Already given in assignment*/
	private String studentId;
	private String surname;
	private String firstName;

	Student(String id, String ln, String fn){
		studentId = id; surname = ln; firstName = fn;
	}

	public String studentId(){
		return studentId;
	}
	public String surname(){
		return surname;
	}

	public String firstName(){
		return firstName;
	}

	public boolean equals(Object ob){
		if(!(ob instanceof Student))
			return false;
		Student s = (Student)ob;
		return studentId.equals(s.studentId);
	}

	public int hashCode(){
		return studentId.hashCode();
	}

	public String toString(){
		return studentId+": "+surname+", "+firstName;
	}

	/**Changes made*/
	
	/*compares 2 students details by natural ordering*/
	public int compareTo(Student m){
		if(m.equals(null))
			return -1;
		else
			return this.toString().compareTo(m.toString());
	}

	/*Compares 2 student details by surname*/
	public static Comparator<Student> surnameCompare(){
		//A custom comparator based on the surname of the students
		Comparator<Student> surnameComparator = new Comparator<Student>()
		{
			public int compare(Student s1, Student s2)
			{
				//if the surnames are equal, compare then compare the first names
				if(s1.surname().equals(s2.surname()))
					return s1.firstName().compareTo(s2.firstName());
				//if the surnames aren't equal, compare the surnames only
				else
					return s1.surname().compareTo(s2.surname());
			}
		};
		//return the comparison
		return surnameComparator;
	}
}