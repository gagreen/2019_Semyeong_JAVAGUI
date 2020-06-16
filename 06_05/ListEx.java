import java.awt.*;
import javax.swing.*;

public class ListEx extends JFrame{
	private String [] fruits = {"apple", "banana", "kiwi", "mango", "pear", "peach",
			"berry", "strawberry", "blackberry"};
	private ImageIcon [] images = { new ImageIcon("images/icon1.png"),
			new ImageIcon("images/icon2.png"),
			new ImageIcon("images/icon3.png"),
			new ImageIcon("images/icon4.png")};
	
	public ListEx() {
		setTitle("리스트 예제");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		
		JList<String> strList = new JList<String>(fruits); //바로 요소 넣기
		c.add(strList);
		
		JList<ImageIcon> imageList = new JList<ImageIcon>(); //빈 리스트 생성 후
		imageList.setListData(images); //안에 요소 넣기
		c.add(imageList);
		
		JList<String> scrollList = new JList<String>(fruits);
		c.add(new JScrollPane(scrollList)); //스크롤 팬 안에 넣어서 스크롤을 가능케함  
		
		setSize(300, 300);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new ListEx();

	}

}
