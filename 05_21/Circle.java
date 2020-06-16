
public class Circle {
	int radius;
	String name; // 필드
	
	public Circle() {} //생성자 기본틀
	
	public double getArea() { //메서드
		return 3.14*radius*radius;
	}
	
	public static void main(String[] args) {
		Circle pizza;
		pizza = new Circle(); // 객체 생성
		pizza.radius = 10;
		pizza.name = "JAVA Pizza";
		double area = pizza.getArea();
		System.out.println(pizza.name + "의 면적은 " + area);
		
		Circle donut = new Circle();
		donut.radius = 2;
		donut.name= "Crab Pizza";
		area = donut.getArea();
		System.out.println(donut.name + "의 면적은 " + area);

	}

}
