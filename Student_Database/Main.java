import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws NullPointerException {
		int j = 0, p = 1;
		// ArrayList of students getting stored
		ArrayList <Student> students = new ArrayList<Student>();
		InputOutput io = new InputOutput();
		Scanner scan = new Scanner(System.in);
		while(p == 1) {
			// Menu Driven-Code for doing functions of Students
			System.out.println("Functions to do on the Students Database: ");
			System.out.println("1. Add Students in it");
			System.out.println("2. Display the Students");
			System.out.println("3. Search for a Student");			
			System.out.println("4. Delete a Student");
			System.out.println("5. Edit a value for Student");
			int choice = scan.nextInt();
			switch(choice){
				case 1:
					do {
					// Adding a student to the students ArrayList
					Object[] in = io.inputStudent();
					Student s = new Student();
					s.setName((String)in[0]);
					s.setPrn((int)in[1]);
					s.setDob((String)in[2]);
					s.setMarks((int)in[3]);
					students.add(s);
					System.out.print("Do want to add more students?(1/0): ");
					j = scan.nextInt();
					} while(j==1);
					break;
				case 2:
					// Displaying the Students in the ArrayList to console
					for(Student i: students) {
						io.printStudent(i);
					}
					break;
				case 3:
					// Searching for a Student in the ArrayList using Name
					System.out.println("Enter the name of the student you are searching for: ");
					String name = scan.next();
					int l = 0;
					for(Student i: students) {
						if(i.getName().equals(name)) {
							System.out.println("Student Found");
							io.printStudent(i);
							l = 1;
							break;
						}
					}
					if(l==0) {
						System.out.println("No Student found with that name.");
					}
					break;
				case 4:
					// Deleting a Student in teh Student based on Name
					System.out.println("Enter the name of the student to be deleted: ");
					String del = scan.next();
					for(int i=0;i<students.size();i++) {
						if(students.get(i).getName().equals(del)) {
							students.remove(i);
							System.out.println("Student deleted successfully");
							break;
						}
					}
					break;
				case 5:
					// Editing a Value of Name, PRN or DOB of a Student based on Name
					System.out.println("Enter the name of the student to have changes: ");
					String ch = scan.next();
					for(int i=0;i<students.size();i++) {
						if(students.get(i).getName().equals(ch)) {
							System.out.println("What of the student you want to change 1-Name, 2-PRN, 3-DOB, 4-Marks: ");
							int x = scan.nextInt();
							if(x==1) {
								System.out.println("Enter the new name: ");
								String y = scan.next();
								students.get(i).setName(y);
								System.out.println("Name changed successfully.");
							} else if(x==2) {
								System.out.println("Enter the new PRN: ");
								int y = scan.nextInt();
								students.get(i).setPrn(y);
								System.out.println("PRN changed successfully.");
							} else if(x==3) {
								System.out.println("Enter the new DOB: ");
								String y = scan.next();
								students.get(i).setDob(y);
								System.out.println("DOB changed successfully.");
							} else if(x==4) {
								System.out.println("Enter the new Marks: ");
								int m = scan.nextInt();
								students.get(i).setMarks(m);
								System.out.println("Marks changed successfully.")
							}else {
								System.out.println("Enter correct values.");
							}		
							break;
						}
					}
					break;
				default:
					System.out.println("Enter correct choice.");
			}
			System.out.print("Do you want to do more functions(1/0): ");
			p = scan.nextInt();
		}
	}
}