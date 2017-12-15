import java.util.Scanner;

public class HW4 {
	public static void main(String args[]) {
		Scanner input = new Scanner(System.in);
		System.out.print("원기둥 밑면의 반지름을 입력하시오 : ");
		double r = input.nextDouble();
		System.out.print("원기둥의 높이를 입력하시오 : ");
		double h = input.nextDouble();
		double V = r * r * Math.PI * h;
		System.out.printf("원기둥의 부피는 %.2f 입니다.", V);
	}
}