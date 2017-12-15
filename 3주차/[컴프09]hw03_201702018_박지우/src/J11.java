import java.util.Scanner;

public class J11 {
	public static void main(String args[]) {
		Scanner input = new Scanner(System.in);
		System.out.println("각각의 수의 크기는?");
		double A = input.nextDouble();
		double B = input.nextDouble();
		double C = input.nextDouble();
		System.out.println("크기순으로 나열하시오.");
		
		if (A > B) {
			if (C > A)
				System.out.println(C + " " + A + " " + B);
			else if (B > C)
				System.out.println(A + " " + B + " " + C);
		}
		if (B > A) {
			if (C > B)
				System.out.println(C + " " + B + " " + A);
			else if (A > C)
				System.out.println(B + " " + A + " " + C);
		}
		if (C > B) {
			if (A > C)
				System.out.println(A + " " + C + " " + B);

		}
		if (B > C) {
			if (C > A)
				System.out.println(B + " " + C + " " + A);
		}

	}

}
