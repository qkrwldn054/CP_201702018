import java.util.*;

public class PCTest {
	public static void main(String args[]){
		Scanner scan = new Scanner(System.in);
		
		Customer c = new Customer();
		
		c.SN(scan.nextLine()); c.SA(scan.nextLine()); c.SP(scan.nextLine()); 
		c.SC(scan.nextInt()); c.SM(scan.nextInt());
		
		System.out.println("�̸� : " + c.GN());
		System.out.println("�ּ� : " + c.GA());
		System.out.println("��ȭ��ȣ : " + c.GP());
		System.out.println("����ȣ : " + c.GC());
		System.out.println("���ϸ��� : " + c.GM());
		
	}
}
