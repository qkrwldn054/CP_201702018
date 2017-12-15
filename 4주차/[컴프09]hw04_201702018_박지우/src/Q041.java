import java.util.Random;

public class Q041 {
	public static void main(String args[]) {
		Random rand = new Random(System.currentTimeMillis());
		int a = 0, b = 0, c = 0, d = 0, e = 0, f = 0;
		int count = 0;

		for (int i = 0; i < 6; i++) {
			count = rand.nextInt(45) + 1;
			switch (i) {
			case 0:
				a = count;
				break;

			case 1:
				b = count;
				while (a == b)
					b = rand.nextInt(45) + 1;
				break;

			case 2:
				c = count;
				while (a == c || b == c)
					c = rand.nextInt(45) + 1;
				break;

			case 3:
				d = count;
				while (a == d || b == d || c == d)
					d = rand.nextInt(45) + 1;
				break;

			case 4:
				e = count;
				while (a == e || b == e || c == e || d == e)
					e = rand.nextInt(45) + 1;
				break;

			case 5:
				f = count;
				while (a == f || b == f || c == f || d == f || e == f)
					f = rand.nextInt(45) + 1;
				break;
			}
		}
		System.out.println("당첨된 로또번호는?");
		System.out.print(a + " ");
		System.out.print(b + " ");
		System.out.print(c + " ");
		System.out.print(d + " ");
		System.out.print(e + " ");
		System.out.print(f + " ");
	}
}
