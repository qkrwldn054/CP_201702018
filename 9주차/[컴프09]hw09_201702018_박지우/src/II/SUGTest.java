package II;

import java.util.*;

public class SUGTest {
	public static void main(String args[]){
		Scanner scan = new Scanner(System.in);
		
		Under u = new Under();
		Graduate g =new Graduate();
		
		u.SN(scan.nextLine()); u.SD(scan.nextLine()); u.SG(scan.nextLine());
		u.SC(scan.nextLine()); u.SA(scan.nextLine());
		
		System.out.println("�̸� " + u.GN());
		System.out.println("�Ҽ��а� " + u.GD());
		System.out.println("�г� " + u.GG());
		System.out.println("�̼����� " + u.GC());
		System.out.println("�Ҽӵ��Ƹ� " + u.GA());
		
		g.SN(scan.nextLine()); g.SD(scan.nextLine()); g.SG(scan.nextLine());
		g.SC(scan.nextLine()); g.SE(scan.nextLine()); g.SR(scan.nextDouble());
		
		System.out.println("�̸� " + g.GN());
		System.out.println("�Ҽ��а� " + g.GD());
		System.out.println("�г� " + g.GG());
		System.out.println("�̼����� " + g.GC());
		System.out.println("�������� " + g.GE());
		System.out.println("���бݺ��� " + g.GR());
	}
}
