package HashSet;

import java.util.HashSet;
import java.util.Iterator;

public class StudentData { // Creating Class Student Data 

	public static void main(String[] args) { // Main Class
		HashSet<Student> set = new HashSet<Student>();

		// Adding elements to HashSet

		set.add(new Student("Nitish", 111, "Android"));
		set.add(new Student("Vishal", 101, "Java"));
		set.add(new Student("Nitish", 111, "Java")); // Duplicate element
		set.add(new Student("Zeenat", 112, "C++"));
		set.add(new Student("Appurav", 103, "Android"));
		set.add(new Student("Aamir", 104, "HTML"));
		set.add(new Student("Nitish", 111, "Java")); // Duplicate element
		

		Iterator<Student> t = set.iterator(); // Iterating through HashSet

		while (t.hasNext()) { // Create loop to check the next line added in the hash set.
			Student student = (Student) t.next(); 

			System.out.println(student); // Prints the result without duplicacy 
		}
	}

}
