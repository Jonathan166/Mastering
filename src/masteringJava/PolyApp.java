package masteringJava;

public class PolyApp {
	public static void main(String[] args) {
		Tree tree = new Tree();

		Plant plant2 = tree;

		plant2.grow();
		
		tree.shedleaves();
		
		doGrow(tree);
	}
	
	public static void doGrow(Plant plant){
		plant.grow();
	}
}
