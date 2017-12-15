import java.util.Scanner;

public class PlaneTest {
	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);
		
		Plane p1 = new Plane();
		System.out.println("기본 항공기");
		p1.SC(scan.next());    p1.SM(scan.next());    p1.SN(scan.nextInt());
	    System.out.println("1번 비행기");
	    System.out.println("항공사 : " + p1.GC() + " , 모델 : " + p1.GM() + " , 최대 승객 수 : " + p1.GN());
	    
	    System.out.println("2번 항공기");
		Plane p2 = new Plane(scan.next(), scan.next());
		System.out.println("항공사 : " + p2.GC() + " , 모델 : " + p2.GM() + " , 최대 승객 수 : " + p1.GN());
		
		System.out.println("3번 항공기");
		Plane p3 = new Plane(scan.next(), scan.next(), scan.nextInt());
		System.out.println("항공사 : " + p3.GC() + " , 모델 : " + p3.GM() + ", 최대 승객 수 : " + p3.GN());
		
		System.out.println("비행기의 수는?" + Plane.getPlanes());
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
