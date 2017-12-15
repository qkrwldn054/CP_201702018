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
		breed = "웰시코기";
	}
	
	void print(){
		System.out.println("개의 이름은 " + name);
		System.out.println("개의 종류는 " + breed);
		System.out.println("개의 나이는 " + age);
	}
}


