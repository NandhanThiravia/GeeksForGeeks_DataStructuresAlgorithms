package prob_01.quadratic_equation_roots;

import java.util.ArrayList;

public class Naive {
	public static void main(String[] args) {
		System.out.println(quadraticRoots(752, 904, 164));
	}

	public static ArrayList<Integer> quadraticRoots(int a, int b, int c) {
		int discriminant = (b * b) - (4 * a * c);
		int squareRootDiscriminant = (int) Math.sqrt(discriminant);

		int root1 = (-1) * (b - squareRootDiscriminant) / (2 * a);
		int root2 = (-1) * (b + squareRootDiscriminant) / (2 * a);

		ArrayList<Integer> roots = new ArrayList<Integer>();
		roots.add(root1);
		roots.add(root2);

		return roots;
	}
}
