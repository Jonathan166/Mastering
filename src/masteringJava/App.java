package masteringJava;

public class App {
	public static void main(String[] args) {
		Machine mach1 = new Machine();
		mach1.start();
		Person person1 = new Person("Jon");
		person1.greet();
		
		Info info1 = new Machine();
		info1.showInfo();
		
		Info info2 = person1;
		info2.showInfo();
		
		outputinfo(mach1); 
	}
	
	private static void outputinfo(Info info){
		info.showInfo();
	}
}
