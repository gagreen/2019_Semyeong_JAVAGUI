import java.util.*;
public class MaxNumberApp {
	public static int max(Vector<Integer> arr) {
		int num=0;
		
		for(int i=0; i<arr.size(); i++) {
			if(num < arr.get(i)) {
				num = arr.get(i);
			}
		}
		
		return num;
	}
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		int input, output;
		Vector<Integer> arr = new Vector<Integer>(); //IntegerŸ���� Vector ����
		
		System.out.print("�Է�(-1�� �Է��ϸ� �Է�����) : ");
		while(true) {
			
			input = s.nextInt();
			if(input == -1) { // -1�̸� �Է�����
				break;
			}
			arr.add(input);
		}
		output = max(arr);
		System.out.println("���� ū ���� " + output);
		s.close();
	}

}
