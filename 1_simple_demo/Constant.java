class Constant {
	// public static final float CM_PER_INCH = 2.54f;

	public static void main(String args[]) {
		final float CM_PER_INCH = 2.54f; // 'f' is used for converting number into floating point number otherwise it is of type double.
		
		System.out.println("Constant is : "+ CM_PER_INCH);
		Demo demo = new Demo();
		demo.printConstant1();
		demo.printConstant2();
		demo.printConstant3();
		demo.printConstant4();
		
		demo.compareStrings();
	};
}

class Demo {
	public static final float CM_PER_INCH = 2.54f;
	public static float static_CM_PER_INCH = 2.54f;
	//static_CM_PER_INCH = 1.0f; you cannot reassign a value to static member but you can inc / desc its value.
	void printConstant1 () {
		System.out.println("Final constant is : "+ CM_PER_INCH);
		System.out.println("Static constant is : "+ static_CM_PER_INCH++ +"\n");
	}
	
	void printConstant2 () {
		System.out.println("Final constant is : "+ CM_PER_INCH);
		System.out.println("Static constant is : "+ static_CM_PER_INCH++);	
	}
	
	void printConstant3 () {
		System.out.println("Final constant is : "+ CM_PER_INCH);
		System.out.println("Static constant is : "+ static_CM_PER_INCH++);	
	}
	
	void printConstant4 () {
		System.out.println("Final constant is : "+ CM_PER_INCH);
		System.out.println("Static constant is : "+ static_CM_PER_INCH++);	
	}
	
	void compareStrings() {
		String str1 = "HELLO";
		String str2 = "HELLO";
		String str3 = new String("HELLO");
		
		System.out.println("*********************CompareStrings***********************");
		System.out.println("String 1: " + str1);
		System.out.println("String 2: " + str2);
		System.out.println("String 3: " + str3);

		if(str1 == str2) System.out.println("str1 & str2 are equal, tested using == operator.");
		else System.out.println("str1 & str2 are not equal, tested using == operator.");
		
		if(str1 == str3) System.out.println("str1 & str3 are equal, tested using == operator.");
		else System.out.println("str1 & str3 are not equal, tested using == operator.");
		
		if(str1.equals(str3)) System.out.println("str1 & str3 are equal, tested using equals operator.");
		else System.out.println("str1 & str3 are not equal, tested using equals operator.");
		System.out.println("**********************************************************");
	}
}

























