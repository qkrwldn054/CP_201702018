import java.util.Scanner;

public class HW2 {
	public static void main(String args[]) {
		Scanner input = new Scanner(System.in);
		System.out.println("ÇöÀç È­¾¾¿Âµµ´Â?");
		double F = input.nextDouble();
		double C = (F - 32) * 5 / 9;
		System.out.println("ÇöÀç ¼·¾¾¿Âµµ´Â " + C);
	}

}
