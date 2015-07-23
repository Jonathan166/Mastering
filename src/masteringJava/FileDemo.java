package masteringJava;

import java.io.File;
import java.util.Scanner;

public class FileDemo {
	public static void main(String[] args) {
		File demo = new File("C:\\Demo");
		System.out.println(demo.isDirectory());
		
		Scanner input = new Scanner(System.in);
		double choice = input.nextDouble();
	}
}
