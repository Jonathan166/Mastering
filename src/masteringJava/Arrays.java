package masteringJava;

public class Arrays {
	public static void main(String[] args) {
		int[] values;
		values = new int[3];
//		System.out.println(values[0]);
//		values[0] = 10;
//		System.out.println(values[0]);
//		values[1] = 20;
//		System.out.println(values[1]);

		for (int i = 0; i < values.length; i++) {
			System.out.println(i);
		}
		
		int[] numbers = {5,7,78};
		
		for(int i= 0; i<numbers.length; i++){
			System.out.println(numbers[i]);
		}
	}
}
