
public class J33 {
	public static void main(String args[]) {

		for (int a = 1; a < 6; a++) {
			for (int b = 5; b > a; b--) {
				System.out.print(" ");
			}
			for (int c = 0; c < a; c++) {
				System.out.print("*");
			}

			for (int d = 1; d < a; d++) {
				System.out.print("*");
			}
			System.out.println();
		}
		for (int a = 0; a < 5; a++) {
			for (int b = 0; b <= a; b++) {
				System.out.print(" ");
			}
			for (int c = 4; c > a; c--) {
				System.out.print("*");
			}
			for (int d = 3; d > a ; d--) {
				System.out.print("*");
			}
			System.out.println();
		}

	}
}
