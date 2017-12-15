import java.util.Scanner;

public class EmployeeTest {
	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);

		Employee em = new Employee();
		em.getName(scan.nextLine());
		em.getNum(scan.nextLine());
		em.getSalary(scan.nextInt());
		em.infor();
	}
}

class Employee {
	public String name;
	public String num;
	public int salary;

	public String getName(String n) {
		return name = n;
	}

	public String getNum(String n) {
		return num = n;
	}

	public int getSalary(int s) {
		return salary = s;
	}

	public void infor() {
		System.out.println("이름은 : " + name);
		System.out.println("번호는 : " + num);
		System.out.println("연봉은 : " + salary + "만원");
	}
}