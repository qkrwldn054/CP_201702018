import java.util.Scanner;

public class HW3 {
	public static void main(String args[]) {
		Scanner input = new Scanner(System.in);
		System.out.print("Ű�� �Է��Ͻÿ� : ");
		int cm = input.nextInt();
		int feet = (int) (cm / (12 * 2.54));
		double inch = (cm / (12 * 2.54) - feet) * 12;
		System.out.println(cm + "cm�� " + feet + "��Ʈ " + inch + "��ġ�Դϴ�.");

	}
}
