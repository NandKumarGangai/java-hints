class Student {
	int id;
	String name;
	private float marks; // 
	// Constructor
	Student() {

	}
	// Parameterised Constructor 
	Student(int fId, String fName) {
		id = fId;
		name = fName;
	}

	Student(int fId, String fName, float marks) {
		id = fId;
		name = fName;
		this.marks = marks;
	}

	void insertRecord(int fId, String fName) {
		id = fId;
		name = fName;
	}

	void displayInformation() {
		System.out.println(id + " " + name + " " + marks);
	}
}

class StudentDemo {
	public static void main(String args[]) {

		/** Declaring A Class Object */
		Student student = new Student();
		System.out.printf("Id is: %d\nand Name is: %s\n", student.id, student.name);

		/** Initialization through reference */
		// Creating objects
		Student s1 = new Student();
		Student s2 = new Student();
		// Initializing objects
		s1.id = 101;
		s1.name = "Sonoo";

		// Will throw error: marks has private access in Student
		// s1.marks = 75.75f; 
		s2.id = 102;
		s2.name = "Amit";
		// Printing data
		System.out.println(s1.id + " " + s1.name);
		System.out.println(s2.id + " " + s2.name);

		/** Initialization through method */
		Student s3 = new Student();
		Student s4 = new Student();
		s3.insertRecord(111, "Karan");
		s4.insertRecord(222, "Aryan");
		s3.displayInformation();
		s4.displayInformation();

		/** Initialization through a constructor */
		Student s5 = new Student(121, "RAJ");
		Student s6 = new Student(131, "PAWAN", 75.75f);
		s5.displayInformation();
		s6.displayInformation();	
	}
}