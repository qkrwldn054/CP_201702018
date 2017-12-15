import java.util.Scanner;

public class PlaneTest {
	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);
		
		Plane p1 = new Plane();
		System.out.println("�⺻ �װ���");
		p1.SC(scan.next());    p1.SM(scan.next());    p1.SN(scan.nextInt());
	    System.out.println("1�� �����");
	    System.out.println("�װ��� : " + p1.GC() + " , �� : " + p1.GM() + " , �ִ� �°� �� : " + p1.GN());
	    
	    System.out.println("2�� �װ���");
		Plane p2 = new Plane(scan.next(), scan.next());
		System.out.println("�װ��� : " + p2.GC() + " , �� : " + p2.GM() + " , �ִ� �°� �� : " + p1.GN());
		
		System.out.println("3�� �װ���");
		Plane p3 = new Plane(scan.next(), scan.next(), scan.nextInt());
		System.out.println("�װ��� : " + p3.GC() + " , �� : " + p3.GM() + ", �ִ� �°� �� : " + p3.GN());
		
		System.out.println("������� ����?" + Plane.getPlanes());
	}
}

class Plane {
	private String company;
	private String model;
	private int num;
    private static int Planes = 0;
   
	void SC(String company) {this.company = company;}    void SM(String model) {this.model = model;}    void SN(int num) {this.num = num;}
	String GC() {return company;}    String GM() {return model;}    int GN() {return num;}
	
	Plane() {
		Planes++;
	}
	Plane(String com, String mod) {
		company = com;
		model = mod;
		Planes++;
	}
	Plane(String com, String mod, int n) {
		company = com;
		model = mod;
		num = n;
		Planes++;
	}
	static int getPlanes() {
		return Planes;
	}
}
