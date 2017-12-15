package II;

import java.util.*;

public class SUGTest {
	public static void main(String args[]){
		Scanner scan = new Scanner(System.in);
		
		Under u = new Under();
		Graduate g =new Graduate();
		
		u.SN(scan.nextLine()); u.SD(scan.nextLine()); u.SG(scan.nextLine());
		u.SC(scan.nextLine()); u.SA(scan.nextLine());
		
		System.out.println("이름 " + u.GN());
		System.out.println("소속학과 " + u.GD());
		System.out.println("학년 " + u.GG());
		System.out.println("이수학점 " + u.GC());
		System.out.println("소속동아리 " + u.GA());
		
		g.SN(scan.nextLine()); g.SD(scan.nextLine()); g.SG(scan.nextLine());
		g.SC(scan.nextLine()); g.SE(scan.nextLine()); g.SR(scan.nextDouble());
		
		System.out.println("이름 " + g.GN());
		System.out.println("소속학과 " + g.GD());
		System.out.println("학년 " + g.GG());
		System.out.println("이수학점 " + g.GC());
		System.out.println("조교유형 " + g.GE());
		System.out.println("장학금비율 " + g.GR());
	}
}
