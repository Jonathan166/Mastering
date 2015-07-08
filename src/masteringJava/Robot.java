package masteringJava;

public class Robot extends Machine{
	
	@Override
	public void start() {
		System.out.println("Robot started");
	}

	public void speak(String s) {
		System.out.println(s);
	}

	public void jump(int height) {
		System.out.println("Jumping: " + height);
	}

	public void move(String direction, double distance) {
		System.out.println("Moving " + distance + "Distance: " + distance);
	}
}
