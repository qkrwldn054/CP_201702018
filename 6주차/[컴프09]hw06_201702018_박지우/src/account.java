import java.util.*;

public class account {
	Scanner scan = new Scanner(System.in);
	public String ID, PW, ID2, PW2;
	
	public void infor(){
		System.out.println("������ ID �� PW ��?");
		ID = scan.next();
		PW = scan.next();
	}
	
	public void chek(){
		System.out.println("�Է��� ID �� PW ��?");
		ID2 = scan.next();
		PW2 = scan.next();
		
		if (ID.equals(ID2) && PW2.equals(PW2))
			System.out.println("������ ��ġ�մϴ�.");
		else 
			System.out.println("������ ��ġ���� �ʽ��ϴ�.");
	}
}
