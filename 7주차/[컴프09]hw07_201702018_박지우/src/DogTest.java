import java.util.Scanner;

public class DogTest {
	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);
		Dog d = new Dog(scan.next(), scan.next(), scan.nextInt());
		d.print();
		Dog D = new Dog(scan.next(), scan.nextInt());
		D.print();
	}
}
class Dog{
	private String name;
	static String breed;
	private int age;
	
	Dog(String name, String breed, int age){
		this.name = name;
		this.breed = breed;
		this.age = age;
	}
	Dog(String name, int age){
		this.name = name;
		this.age = age;
		breed = "�����ڱ�";
	}
	
	void print(){
		System.out.println("���� �̸��� " + name);
		System.out.println("���� ������ " + breed);
		System.out.println("���� ���̴� " + age);
	}
}


