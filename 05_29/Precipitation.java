import java.util.*;

public class Precipitation {
	
	public static void print(Vector<Integer> v) {
		double ave;
		double sum = 0;
		for(int i=0; i<v.size(); i++) {
			System.out.print(v.get(i) + " ");
			sum += v.get(i);
		}
		System.out.println();
		ave = sum/v.size();
		System.out.println("���� ���" + ave);
		
	}
	
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		Vector<Integer> pre = new Vector<Integer>();
		int input;
		
		while(true) {
			System.out.print("������ �Է�(0 �Է½� ����)>");
			input = s.nextInt();
			if(input == 0) {
				break;
			}
			pre.add(input);
			print(pre);
		}
		
		s.close();
	}

}
