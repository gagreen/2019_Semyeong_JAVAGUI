
public class Nation {
	String name, continent;
	int people;
	
	void tax() {
		System.out.println("������ �Ⱦ���.");
	}
	void welfare() {
		System.out.println(people + "���� ���ε��� �����־���.");
	}
	
	void control() {
		System.out.println("���ε��� ��Ʈ��");
	}
	
	public static void main(String[] args) {
		Nation lebanon = new Nation();
		lebanon.name = "���ٳ�";
		lebanon.continent = "�ƽþ�";
		lebanon.people = 6082000;
		lebanon.tax();
		lebanon.welfare();
		lebanon.control();
	}

}
