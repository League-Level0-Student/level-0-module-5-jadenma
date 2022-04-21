package _02_nested_loops._3_for_loop_gauntlet;

public class ForLoopGauntlet {

	public static void main(String[] args) {
		
		// single for-loops
		// 1
		for (int i = 0; i <= 100; i++) {
			System.out.println(i);
		}
		System.out.println();
		// 2
		for (int i = 100; i >= 0; i--) {
			System.out.println(i);
		}
		System.out.println();
		// 3
		for (int i = 2; i <= 100; i++) {
			if (i % 2 == 0) {
				System.out.println(i);
			}
		}
		System.out.println();
		// 4
		for (int i = 1; i <= 99; i++) {
			if (i % 2 == 1) {
				System.out.println(i);
			}
		}
		System.out.println();
		// 5
		for (int i = 1; i <= 500; i++) {
			if (i % 2 == 1) {
				System.out.println(i + " is odd");
			} else if (i % 2 == 0) {
				System.out.println(i + " is even");
			}
		}
		System.out.println();
		// 6
		for (int i = 0; i <= 777; i++) {
			if (i % 7 == 0) {
				System.out.println(i);
			}
		}
		System.out.println();

		// 7
		for (int i = 2008; i < 2022; i++) {
			System.out.println("In " + i + ", I was " + (i - 2008));
		}
		System.out.println();

		// nested for-loops
		// 1
		for (int i = 0; i <= 2; i++) {
			for (int j = 0; j <= 2; j++) {
				System.out.println(i + " " + j);
			}
		}
		System.out.println();

		// 2
		for (int j = 0; j < 7; j = j + 3) {
			for (int i = 1; i <= 3; i++) {
				System.out.print((i + j) + " ");
			}
			System.out.println();
		}
		System.out.println();

		// 3
		for (int j = 0; j < 100; j = j + 10) {
			for (int i = 1; i <= 10; i++) {
				if (j < 10) {
					System.out.print((i + j) + "  ");
				}
				else {
					System.out.print((i + j) + " ");
				}
			}
			System.out.println();
		}
		System.out.println();

		// 4
		for (int j = 1; j <= 6; j++) {
			for (int i = 1; i <= j; i++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		System.out.println();
		
	}

}
