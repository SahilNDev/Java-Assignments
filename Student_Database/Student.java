public class Student {
	// Creating Name, PRN, DOB variables
	private String name;
	private int prn;
	private String dob;
	private int marks;

	// Setter Methods of Name, PRN, DOB and Marks
	public void setName(String n) {
		this.name = n;
	}
	public void setPrn(int prn) {
		this.prn = prn;
	}
	public void setDob(String dob) {
		this.dob = dob;
	}
	public void setMarks(int marks) {
		this.marks = marks;
	}

	// Getter Methods of Name, PRN, DOB and Marks
	public String getName() {
		return this.name;
	}
	public int getPrn() {
		return this.prn;
	}
	public String getDob() {
		return this.dob;
	}
	public int getMarks() {
		return this.marks;
	}
}