import java.util.Scanner;
class Person {
	private String name;
	private String address;

	public Person(String name, String address) {
		this.name = name;
		this.address = address;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String toString() {
		return "Person[name=" + name + ", address=" + address + "]";
	}

}

class Student extends Person {
	private String program;
	private int year;
	private double fee;

	public Student(String name, String address, String program, int year, double fee) {
		super(name, address);
		this.program = program;
		this.year = year;
		this.fee = fee;
	}
	public String getProgram() {
		return program;
	}

	public void setProgram(String program) {
		this.program = program;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public double getFee() {
		return fee;
	}

	public void setFee(double fee) {
		this.fee = fee;
	}

	public String toString() {
		return "Student[" + super.toString() + ", program=" + program + ", year=" + year + ", fee=" + String.format("%.2f", fee) + "]";
	}
	
}

class Staff extends Person {
	private String school;
	private double pay;

	public Staff(String name, String address, String school, double pay) {
		super(name, address);
		this.school = school;
		this.pay = pay;
	}

	public String getSchool() {
		return school;
	}

	public void setSchool(String school) {
		this.school = school;
	}

	public double getPay() {
		return pay;
	}

	public void setPay(double pay) {
		this.pay = pay;
	}

	public String toString() {
		return "Staff[" + super.toString() + ", school=" + school + ", pay=" + String.format("%.2f", pay) + "]";
	}
}

class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		sc.nextLine();
		String name, address;
		while(t-- >0) {
			String choose = sc.nextLine();
			switch (choose) {
			case "P": 
				name = sc.nextLine();
				address = sc.nextLine();
				Person person = new Person(name, address); 
				System.out.println(person);
				break;
			
			case "St": 
				
				name = sc.nextLine();
				address = sc.nextLine();
				String program = sc.nextLine();
				int year = Integer.parseInt(sc.nextLine());
				double fee= Double.parseDouble(sc.nextLine());
				Person student = new Student(name, address, program, year, fee); 
				System.out.println(student);
				break;
			
			case "Sf": 
				name = sc.nextLine();
				address = sc.nextLine();
				String school = sc.nextLine();
				double pay = Double.parseDouble(sc.nextLine());
				Person staff = new Staff(name, address, school, pay); 
				System.out.println(staff);
				break;
			
			default:
				break;
			}
		}
        sc.close();
	}
}
