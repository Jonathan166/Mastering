package masteringJava;

public class Tree extends Plant {
	@Override
	public void grow() {
		System.out.println("Tree Growing");
	}
	
	public void shedleaves(){
		System.out.println("Leaves Shedding");
	}
}