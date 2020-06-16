import java.util.*;

abstract class Op{
	private int a, b;
	
	public void SetValue(int a, int b) {
		this.a = a;
		this.b = b;
	}
	
	public int getA() {
		return a;
	}
	public int getB() {
		return b;
	}
	
	
	abstract int calculate();
}

class Add extends Op{
	public int calculate() {
		return getA() + getB();
	}
}

class Sub  extends Op{

	public int calculate() {
		return getA() - getB();
	}
}

class Mul  extends Op{

	public int calculate() {
		return getA() * getB();
	}
}

class Div  extends Op{

	public int calculate() {
		return getA() / getB();
	}
}

public class CalcEx {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		Op c;
		int a, b;
		char operator;
		System.out.print("두 정수와 연산자 입력>>");
		a = s.nextInt();
		b = s.nextInt();
		operator = s.next().charAt(0);
		
		switch(operator) {
			case '+': c = new Add(); break; //업캐스팅

			case '-': c = new Sub(); break;

			case '*': c = new Mul(); break;

			case '/': c = new Div(); break;
			
			default : c = null;
		}
		
		if(c == null) {
			System.out.println("오류! 연산자 입력이 잘못됐습니다.");
		}
		else {
			c.SetValue(a, b);
			System.out.println(c.calculate());
		}
		
		s.close();

	}

}
