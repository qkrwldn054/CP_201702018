import java.util.Scanner;

public class HW3 {
	public static void main(String args[]) {
		Scanner input = new Scanner(System.in);
		System.out.print("키를 입력하시오 : ");
		int cm = input.nextInt();
		int feet = (int) (cm / (12 * 2.54));
		double inch = (cm / (12 * 2.54) - feet) * 12;
		System.out.println(cm + "cm는 " + feet + "피트 " + inch + "인치입니다.");

	}
}
