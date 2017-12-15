import java.util.*;

public class ShapeTest {
	public static void main(String args[]){
		Scanner scan = new Scanner(System.in);
		
		int a = scan.nextInt();
		int b = scan.nextInt();
		
		Shape[] s = new Shape[3];
		s[0] = new Triangle(a, b);
		s[1] = new Rectangle(a, b);
		s[2] = new Circle(a, b);
		
		for (int i=0; i<s.length; i++){
			System.out.println(s[i].area());
		}
	
	}
}
