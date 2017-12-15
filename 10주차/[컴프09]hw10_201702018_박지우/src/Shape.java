
public class Shape {
	protected int width;
	protected int height;

	public Shape(int width, int height) {
		this.width = width;
		this.height = height;
	}

	public int area() {
		return 0;
	}
}

class Triangle extends Shape {
	public Triangle(int width, int height) {
		super(width, height);
	}

	public int area() {
		System.out.print("�ﰢ���� ���� : ");
		return width * height / 2;
	}
}

class Rectangle extends Shape {
	public Rectangle(int width, int height) {
		super(width, height);
	}

	public int area() {
		System.out.print("�簢���� ���� : ");
		return width * height;
	}
}

class Circle extends Shape {
	public Circle(int width, int height) {
		super(width, height);
	}

	public int area() {
		System.out.print("���� �뷫�� ���� : ");
		return (int) ((width * height)/4 * Math.PI);//���� ���η� ���� ���̸� ???
	}
}