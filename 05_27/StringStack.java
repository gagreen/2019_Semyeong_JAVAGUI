import java.util.*;

interface Stack {
	int length(); //저장된 개수
	int capacity(); // 저장 가능한 개수
	String pop(); // 출력
	boolean push(String val); // 입력
}

public class StringStack implements Stack {
	private int tos; //Top Of Stack
	private String [] element;
	
	public StringStack(int capacity) {
		element = new String[capacity];
		tos = -1;
	}
	
	@Override
	public int length() {
		return tos + 1;
	}
	
	@Override
	public int capacity() {
		return element.length;
	}
	
	@Override
	public String pop() {
		if(tos == -1) { // 스택 안에 아무것도 없을 때
			return null;
		}
		String output = element[tos];
		tos--;
		return output;
	}
	@Override
	public boolean push(String val) {
		if (tos == element.length - 1) { //남은 저장 공간이 없을 때
			return false;
		}
		tos++;
		element[tos] = val;
		return true;
	}
	
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		boolean check;
		int size; //스택의 사이즈 입력값
		String input; // 각 요소 입력값
		System.out.print("스택의 사이즈 입력>>");
		size = s.nextInt();
		StringStack strStack = new StringStack(size);//객체 생성
		
		while(true) {
			System.out.print("문자열 입력>>");
			input = s.next();
			if(input.equals("그만")) {
				break;
			}//입력 역할
			check = strStack.push(input);
			if(check == false) {
				System.out.println("스택이 꽉 차서 push 불가!");
			}
		}
		System.out.print("스택에 저장된 모든 문자열 팝 : ");
		int len = strStack.length(); //for문 내에서 length가 변하므로 변수를 만들어 고정시켜 둔다.
		for(int i=0; i<len; i++) {
			System.out.print(strStack.pop() + " ");
		}
		
		s.close();
	}

}
