import java.util.Scanner;

public class HW1 {
	public static void main(String args[]) {
		Scanner input = new Scanner(System.in);
		System.out.println("마일을 입력하시오.");
		double 마일;
		마일 = input.nextDouble();
		double 킬로미터 = 1.609 * 마일;
		System.out.print("10마일은 ");
		System.out.print(킬로미터);
		System.out.println(" 킬로미터 입니다.");

	}

}
