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
		
		short shortValue = 55;
		byte byteValue = 20;
		int intValue = 888;
		long longValue = 2335;
		
		float floatValue = 8834.3f;
		double doubleValue = 312.4;
		
		System.out.println(Byte.MAX_VALUE);
		intValue = (int)longValue;
		System.out.println(intValue);
		
		System.out.println(doubleValue);
		
		intValue = (int)floatValue;
		
		System.out.println(intValue);
		
		//It loops around back to a min of -128
		// because 128 is too big for a byte
		byteValue = (byte)128;
		System.out.println(byteValue);
		
	}

	private static void outputinfo(Info info) {
		info.showInfo();
	}
}
