package Assignment_7;

public class Student {
	String name;
	String roll_no;
	String phone;
	String address;
	
	public Student(String name, String roll_no, String phone, String address) {
		super();
		this.name = name;
		this.roll_no = roll_no;
		this.phone = phone;
		this.address = address;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getRoll_no() {
		return roll_no;
	}

	public void setRoll_no(String roll_no) {
		this.roll_no = roll_no;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String show_List() {
		return "Student Name: " + name + "\nRoll_No:" + roll_no + "\nPhone Number: " + phone + "\nAddress: " + address; 
	}
	
	
	
	

}
