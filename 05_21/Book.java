
public class Book {
	String title, author;
	
	void show() {
		System.out.println(title + " " + author);
	}
	
	public Book() {
		this("","");
		System.out.println("생성자가 호출되었습니다.");
	}
	
	public Book(String title) {
		this(title, "작자 미상");
	}
	public Book(String title, String author) {
		this.title = title;
		this.author = author;
	}

	public static void main(String[] args) {
		Book littlePrince = new Book("어린왕자", "생텍쥐페리");
		Book loveStory = new Book("춘향전");
		//Book empty = new Book();
		littlePrince.show();
		loveStory.show();

	}

}
