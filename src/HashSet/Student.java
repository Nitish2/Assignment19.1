package HashSet;

public class Student { /** Student class with three fields- name, rollNo and department
                       **/

	String name;  // String variable Name

	int rollNo; // Integer Variable rollNo

	String department; // String variable department

	public Student(String name, int rollNo, String department) { // Main Method 
		this.name = name; // this keyword is use to refer the current object of name 

		this.rollNo = rollNo; // this keyword is use to refer the current object of rollNo

		this.department = department; // this keyword is use to refer the current object of deparment
	}

	public String toString() { // toString Method
		return name + " " + rollNo + " " + department;  // Return Type 
	}
}
