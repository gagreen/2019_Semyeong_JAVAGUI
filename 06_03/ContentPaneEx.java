import java.awt.*;
import javax.swing.*;

public class ContentPaneEx extends JFrame{
	public ContentPaneEx() {
		setTitle("ContentPane과 JFrame");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // 프로그램 윈도우 닫으면 종료하도록 설정
		
		Container contentPane = getContentPane(); // 컨텐트 팬을 알아냄
		contentPane.setBackground(Color.GRAY); // 색 설정
		contentPane.setLayout(new FlowLayout()); // FlowLayout 배치관리자 달기
		
		contentPane.add(new JButton("OK"));
		contentPane.add(new JButton("Cancel"));
		contentPane.add(new JButton("Ignore"));
		
		setSize(300, 150);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new ContentPaneEx();

	}

}
