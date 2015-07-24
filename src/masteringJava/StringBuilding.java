package masteringJava;

public class StringBuilding {
	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder("");
		sb.append("My name is Jon, ").append("I am a software engineer.");
		System.out.println(sb.toString());

		// Formatting
		System.out.println("Here is some text \t that was a tab \n new line");
		System.out.printf("Total : %-10d", 5000);

		for (int i = 0; i < 20; i++) {
			System.out.printf("%2d: some text here\n", i);
		}
		
		System.out.printf("Total value %.2f\n", 5.68999);
		System.out.printf("Total value %5.1f\n", 5.68999);

	}
}
