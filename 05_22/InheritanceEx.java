class Person{
	private int weight;
	int age;
	protected int height;
	public String name;
	
	public void setWeight(int weight) {
		this.weight = weight;
	}
	public int getWdiht() {
		return weight;
	}
}

class Student extends Person{
	public void set() {
		age = 30;
		name = "홍길동";
		height = 175;
		// weight = 99 // private으므로 오류
		setWeight(75); // setter를 통해 weight 설정
	}
}

public class InheritanceEx {

	public static void main(String[] args) {
		Student s = new Student();
		s.set();

	}

}
