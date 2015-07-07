package masteringJava;

public class multiDimensionalArrays {
	public static void main(String[] args) {
		int[] values = { 3, 5, 6 };
		System.out.println(values[0]);

		int[][] grid = { { 2, 4, 6, 8, 10 }, { 20, 40, 60, 1 }, { 10, 20 }, };
		System.out.println(grid[1][1]);

		String[][] mobs = { { "Ice Troll", "Ice Dragon", "Ice Giant" }, { "Fire Troll", "Fire Dragon", "Fire Giant" },
				{ "Water Troll", "Water Dragon", "Water Giant" } };

		for (int row = 0; row < mobs.length; row++) {
			for (int col = 0; col < mobs[row].length; col++) {
				System.out.print(mobs[row][col] + "\t");
			}
			System.out.println();
		}

		String[][] words = new String[2][];

		System.out.println(words[0]);

		words[0] = new String[3];

		words[0][1] = "hi there";

		System.out.println(words[0][1]);
	}
}
