public class Student {
	// Creating Name, PRN, DOB variables
	private String name;
	private int prn;
	private String dob;

	// Setter Methods of Name, PRN and DOB
	public void setName(String n) {
		this.name = n;
	}
	public void setPrn(int prn) {
		this.prn = prn;
	}
	public void setDob(String dob) {
		this.dob = dob;
	}

	// Getter Methods of Name, PRN and DOB
	public String getName() {
		return this.name;
	}
	public int getPrn() {
		return this.prn;
	}
	public String getDob() {
		return this.dob;
	}
}