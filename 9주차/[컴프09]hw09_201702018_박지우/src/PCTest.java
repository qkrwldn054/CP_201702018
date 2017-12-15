import java.util.*;

public class PCTest {
	public static void main(String args[]){
		Scanner scan = new Scanner(System.in);
		
		Customer c = new Customer();
		
		c.SN(scan.nextLine()); c.SA(scan.nextLine()); c.SP(scan.nextLine()); 
		c.SC(scan.nextInt()); c.SM(scan.nextInt());
		
		System.out.println("이름 : " + c.GN());
		System.out.println("주소 : " + c.GA());
		System.out.println("전화번호 : " + c.GP());
		System.out.println("고객번호 : " + c.GC());
		System.out.println("마일리지 : " + c.GM());
		
	}
}
