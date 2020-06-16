
public class Access {

	public static void main(String[] args) {
		Sample aClass = new Sample();
		aClass.a = 10;
		aClass.setB(10); // 접근지정자 private때문에 바로 대입하면 Error가 뜬다.
		aClass.c = 10;
		System.out.println("a: " + aClass.a + " b: " + aClass.getB() + " c: " + aClass.c);
	}

}

class Sample{
	public int a;
	private int b;
	int c;
	public int getB() {
		return b;
	}
	public void setB(int b) {
		this.b = b;
	}
}
