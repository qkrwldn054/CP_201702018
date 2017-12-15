import java.util.Scanner;

public class BoxTest {
	public static void main(String args[]) {

		Box box = new Box();
		box.print();
	}
}

class Box {

	Scanner scan = new Scanner(System.in);
	public int w = scan.nextInt();
	public int l = scan.nextInt();
	public int h = scan.nextInt();

	public int getVolume() {
		int v = w * l * h;
		return v;
	}

	public void print() {
		System.out.println(getVolume());
	}

}
