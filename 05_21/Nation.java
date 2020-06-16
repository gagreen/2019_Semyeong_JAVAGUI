
public class Nation {
	String name, continent;
	int people;
	
	void tax() {
		System.out.println("세금을 걷었다.");
	}
	void welfare() {
		System.out.println(people + "명의 국민들을 도와주었다.");
	}
	
	void control() {
		System.out.println("국민들을 깐트롤");
	}
	
	public static void main(String[] args) {
		Nation lebanon = new Nation();
		lebanon.name = "레바논";
		lebanon.continent = "아시아";
		lebanon.people = 6082000;
		lebanon.tax();
		lebanon.welfare();
		lebanon.control();
	}

}
