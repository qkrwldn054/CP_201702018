import java.util.Scanner;

public class Q1 {
	public static void main(String args[]) {
		Scanner input = new Scanner(System.in);

		System.out.print("�����뿡 ����ִ� 10��¥���� ������? : ");
		int A = input.nextInt();
	    System.out.print("�����뿡 ����ִ� 50��¥���� ������? : ");
	    int B = input.nextInt();
	    System.out.print("�����뿡 ����ִ� 100��¥���� ������? : ");
	    int C = input.nextInt();
	    System.out.print("�����뿡 ����ִ� 500��¥���� ������? : ");
	    int D = input.nextInt();
	    int F = A*10 + B*50 + C*100 + D*500;
	    System.out.println("�����뿡 ����ִ� �� �ݾ��� ���ΰ�? : " + F + "��");
	    
	}

}
