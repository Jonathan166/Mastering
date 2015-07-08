package masteringJava;

public class ClassDemo {
	public static void main(String[] args) {
		Person person1 = new Person();
		person1.age = 40;
		person1.name = "Joe";

		Person person2 = new Person();
		person2.name = "Sarah";
		person2.age = 20;

		System.out.println(person1.name);
		person2.speak();
	}
}
