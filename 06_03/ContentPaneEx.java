import java.awt.*;
import javax.swing.*;

public class ContentPaneEx extends JFrame{
	public ContentPaneEx() {
		setTitle("ContentPane�� JFrame");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // ���α׷� ������ ������ �����ϵ��� ����
		
		Container contentPane = getContentPane(); // ����Ʈ ���� �˾Ƴ�
		contentPane.setBackground(Color.GRAY); // �� ����
		contentPane.setLayout(new FlowLayout()); // FlowLayout ��ġ������ �ޱ�
		
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
