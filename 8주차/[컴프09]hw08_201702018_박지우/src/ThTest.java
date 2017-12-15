import java.util.Scanner;

public class ThTest {
	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);

		int[] th = new int[10];
		int[] Th = new int[10];

		for(int i = 0; i<10; i++){
			th[i] = i+1;
			Th[i] = 0 ;
		}
		for (int i = 0; i < 10; i++) {
			System.out.println("좌석을 예약하시겠습니까?(1 또는 0)");
			int b=scan.nextInt();
			if(b==1){
			System.out.println("현재의 예약 상태는 다음과 같습니다.");
			System.out.println("----------------------------------");
			for(int n = 0; n<10; n++){
			System.out.print(th[n] + "  ");
			}
			System.out.println();
			System.out.println("----------------------------------");
			for(int n = 0; n<10; n++){
				System.out.print(Th[n]+ "  ");
			}
			System.out.println();
			System.out.println("몇번째 좌석을 예약하시겠습니까?");
			int a = scan.nextInt();
			for(int n=0; n<10; n++){
			if(a==th[n])
				Th[n]=1;
			}
			System.out.println("예약되었습니다.");
			}
			else if(b==0)
				break;
		}
	}
}
