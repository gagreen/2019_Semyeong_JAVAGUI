import java.util.*;

public class Max {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int [] arr = new int[5];
		int max = 0;
		System.out.println("��� �迭 ��� �Է�");
		for(int i=0; i<arr.length; i++) {
			arr[i] = s.nextInt();
			if(max < arr[i]) {
				max = arr[i];
			}
		}
		System.out.println("���� ū ���� " + max + "�Դϴ�.");
		
		s.close();
	}

}
