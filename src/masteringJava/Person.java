package masteringJava;

public class Person {
	String name;
	int age;

	void speak() {
		System.out.println("My name is " + name);
	}

	int calculateYears2R() {
		int yearsLeft = 65 - age;

		return yearsLeft;
	}
	
	int getAge(){
		return age;
	}
	
	String getName(){
		return name;
	}
}