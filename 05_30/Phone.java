
public class Phone {
	private String name;
	private String phone;
	
	public Phone(String name, String phone) {
		this.name = name;
		this.phone = phone;
	}
	
	public String getName() { // 접근 지정자가 private이므로 getter설정
		return name;
	}
	public String getPhone() { // 접근 지정자가 private이므로 getter설정
		return phone;
	}

}
