import java.util.Scanner;

public class J22 {
	public static void main(String args[]) {
		Scanner input = new Scanner(System.in);
		System.out.println("사용자의 키는?"); // 단위 cm
		double h = input.nextDouble();
		System.out.println("사용자의 몸무게는?"); // 단위 kg
		double g = input.nextDouble();
		double w = (h - 100) * 0.9;
		if (g >= w * 1.1)
			System.out.println("과체중입니다.");
		else if (g <= w * 0.9)
			System.out.println("저체중입니다.");
		else
			System.out.println("정상체중입니다.");

	}

}
