import java.util.Scanner;

public class HW4 {
	public static void main(String args[]) {
		Scanner input = new Scanner(System.in);
		System.out.print("����� �ظ��� �������� �Է��Ͻÿ� : ");
		double r = input.nextDouble();
		System.out.print("������� ���̸� �Է��Ͻÿ� : ");
		double h = input.nextDouble();
		double V = r * r * Math.PI * h;
		System.out.printf("������� ���Ǵ� %.2f �Դϴ�.", V);
	}
}