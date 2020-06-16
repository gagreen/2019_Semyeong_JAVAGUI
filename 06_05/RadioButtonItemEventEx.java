import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class RadioButtonItemEventEx extends JFrame{
	private JRadioButton [] radio = new JRadioButton[3];
	private String [] text = {"사과", "배", "체리"};
	private ImageIcon [] image = {
			new ImageIcon("images/apple.jpg"),
			new ImageIcon("images/pear.jpg"),
			new ImageIcon("images/cherry.jpg")};
	private JLabel imageLabel = new JLabel();
	
	public RadioButtonItemEventEx() {
		setTitle("라디오버튼");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(new BorderLayout());
		
		JPanel radioPanel = new JPanel(); // 라디오 버튼을 부착할 패널
		radioPanel.setBackground(Color.GRAY);
		
		ButtonGroup g = new ButtonGroup(); //버튼 그룹 생성
		for(int i=0; i<radio.length; i++) {
			radio[i] = new JRadioButton(text[i]);
			g.add(radio[i]); //그룹에 넣기
			radioPanel.add(radio[i]); //패널에 넣기
			radio[i].addItemListener(new MyItemListener()); // 이벤트 리스너 등록
		}
		
		radio[0].setSelected(true); // 선택시켜놓기
		c.add(radioPanel, BorderLayout.NORTH);
		c.add(imageLabel, BorderLayout.CENTER);
		imageLabel.setHorizontalAlignment(SwingConstants.CENTER); // 이미지 중앙 등록
		
		setSize(250, 350);
		setVisible(true);
	}
	
	class MyItemListener implements ItemListener{ // 라디오 이벤트
		public void itemStateChanged(ItemEvent e) {
			if(e.getStateChange() == ItemEvent.DESELECTED) //선택 해제
				return;
			if(radio[0].isSelected()) // 사과
				imageLabel.setIcon(image[0]);
			else if(radio[1].isSelected()) // 배
				imageLabel.setIcon(image[1]);
			else // 체리
				imageLabel.setIcon(image[2]);
		}
	}
	
	public static void main(String[] args) {
		new RadioButtonItemEventEx();
	}

}
