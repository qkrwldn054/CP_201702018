import java.util.Scanner;
public class Q2 {
	public static void main(String args[]){
		Scanner input = new Scanner(System.in);
		System.out.print("현재 면적은 몇 평인가? : ");
		double A = input.nextDouble();
		double B = A*3.3058;
		System.out.println("현재 면적은 몇 평방미터인가? : " + B);//단위 : 제곱미터
		
	}

}
