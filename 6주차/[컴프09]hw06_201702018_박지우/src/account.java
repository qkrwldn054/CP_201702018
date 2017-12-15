import java.util.*;

public class account {
	Scanner scan = new Scanner(System.in);
	public String ID, PW, ID2, PW2;
	
	public void infor(){
		System.out.println("설정할 ID 와 PW 는?");
		ID = scan.next();
		PW = scan.next();
	}
	
	public void chek(){
		System.out.println("입력할 ID 와 PW 는?");
		ID2 = scan.next();
		PW2 = scan.next();
		
		if (ID.equals(ID2) && PW2.equals(PW2))
			System.out.println("정보가 일치합니다.");
		else 
			System.out.println("정보가 일치하지 않습니다.");
	}
}
