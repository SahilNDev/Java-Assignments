import java.util.Scanner;

public class InputOutput {
	String name, dob;
	int prn, marks;
	Object[] array = new Object[3];

	// Function to iput Name, PRN, DOb of a Student from user
	public Object[] inputStudent() {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter name of the student: ");
		name = sc.next();

		System.out.println("Enter PRN of the student: ");
		prn = sc.nextInt();

		System.out.println("Enter Date of Birth of the student in dd-mm-yyyy format: ");
		dob = sc.next();

		System.out.println("Enter the marks obtained by the student: ");
		marks = sc.nextInt();
		
		array[0] = name;
		array[1] = prn;
		array[2] = dob;
		array[3] = marks;

		return array;
	}

	// Printing a Student's Name, PRN, DOB to the console
	public void printStudent(Student s) {
		System.out.println("Name: " + s.getName() + " PRN: " + s.getPrn() + " DOB: " + s.getDob() + "Marks: " + s.getMarks());
	}
}