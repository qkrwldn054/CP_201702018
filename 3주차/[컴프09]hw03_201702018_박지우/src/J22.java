import java.util.Scanner;

public class J22 {
	public static void main(String args[]) {
		Scanner input = new Scanner(System.in);
		System.out.println("������� Ű��?"); // ���� cm
		double h = input.nextDouble();
		System.out.println("������� �����Դ�?"); // ���� kg
		double g = input.nextDouble();
		double w = (h - 100) * 0.9;
		if (g >= w * 1.1)
			System.out.println("��ü���Դϴ�.");
		else if (g <= w * 0.9)
			System.out.println("��ü���Դϴ�.");
		else
			System.out.println("����ü���Դϴ�.");

	}

}
