package masteringJava;

public class GettersDemo {
	public static void main(String[] args) {
		Person person1 = new Person();
		person1.age = 23;
		person1.name = "Joe";

		person1.speak();

		int years = person1.calculateYears2R();
		System.out.println("Years till R: " + years);
		
		System.out.println("Name : "+ person1.getName());
	}
}
