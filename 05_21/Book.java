
public class Book {
	String title, author;
	
	void show() {
		System.out.println(title + " " + author);
	}
	
	public Book() {
		this("","");
		System.out.println("�����ڰ� ȣ��Ǿ����ϴ�.");
	}
	
	public Book(String title) {
		this(title, "���� �̻�");
	}
	public Book(String title, String author) {
		this.title = title;
		this.author = author;
	}

	public static void main(String[] args) {
		Book littlePrince = new Book("�����", "�������丮");
		Book loveStory = new Book("������");
		//Book empty = new Book();
		littlePrince.show();
		loveStory.show();

	}

}
