import java.util.Scanner;

public class Q1 {
	public static void main(String args[]) {
		Scanner input = new Scanner(System.in);

		System.out.print("저금통에 들어있는 10원짜리의 개수는? : ");
		int A = input.nextInt();
	    System.out.print("저금통에 들어있는 50원짜리의 개수는? : ");
	    int B = input.nextInt();
	    System.out.print("저금통에 들어있는 100원짜리의 개수는? : ");
	    int C = input.nextInt();
	    System.out.print("저금통에 들어있는 500원짜리의 개수는? : ");
	    int D = input.nextInt();
	    int F = A*10 + B*50 + C*100 + D*500;
	    System.out.println("저금통에 들어있는 총 금액은 얼마인가? : " + F + "원");
	    
	}

}
