
public class ThreeSixNine {

	public static void main(String[] args) {
		int count =0;
		String [] str = {" �ڼ� ¦", " �ڼ� ¦¦"};
		String temp;
		for(int i=1; i<100; i++) {
			count=0; //369�� ���� Ƚ��
			temp = i+""; // i�� ���ڿ��� ��ȯ

			for(int j=0; j<temp.length(); j++) {
				if(temp.charAt(j) == '3' || temp.charAt(j)=='6' || temp.charAt(j)=='9') {
					count++;
				}
			}
			if(count != 0) {
				System.out.println(i + str[count-1]);
			}
			
		}
		
		// teacher's version
		int res, num, numberOf369=0;
		for(int i=1; i<100; i++) {
			num = i; // �ݺ����� �����ϱ� ���ؼ� ���ο� ������ ����
			for(res= num%10; num>0; res = num%10) { // �� �ڸ���ŭ �ݺ�
				if(res == 3 || res == 6 || res == 9) {
					numberOf369++;
				}
				num /= 10;
			}
			if(numberOf369 > 0) { // 369�� �ϳ� �̻��� ��
				System.out.println(i + str[numberOf369-1]);
			}
			numberOf369 = 0; //�ʱ�ȭ
		}
		

	}

}
