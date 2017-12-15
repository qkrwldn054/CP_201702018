import java.util.Scanner;

public class Re {
	public static void main(String args[]) {
		Scanner input = new Scanner(System.in);
		rev r = new rev();
		String str;
		System.out.println("문자열을 입력하시오 : ");
		str = input.next();
		System.out.println(r.reverse(str));
	}
}

class rev {
	public static String reverse(String s) {
		String a = "";
		for (int i = 1; i <= s.length(); i++) {
			a += s.charAt(s.length() - i);
		}
		return a;
	}
}