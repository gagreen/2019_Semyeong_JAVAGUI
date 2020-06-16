
public class Circle implements Shape{
	int radius;
	public Circle(int radius) {
		this.radius = radius;
	}
	
	@Override
	public void draw() {
		System.out.println("�������� " + radius + "�� ���Դϴ�.");
	}

	@Override
	public double getArea() {
		
		return PI * radius * radius;
	}

}