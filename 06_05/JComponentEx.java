import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class JComponentEx extends JFrame{
	public JComponentEx() {
		super("JComponent�� ���� �޼ҵ� ����");
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		
		JButton b1 = new JButton("Magenta/Yellow Button");
		JButton b2 = new JButton("     Disable Button     ");
		JButton b3 = new JButton("getX(), getY()");
		
		b1.setBackground(Color.YELLOW); //����
		b1.setForeground(Color.MAGENTA); //���ڻ�
		b1.setFont(new Font("Arial", Font.ITALIC, 20));
		b1.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				b2.setEnabled(false);
			}
		});
		
		b2.setEnabled(false); //��Ȱ��ȭ
		
		b3.addActionListener(new ActionListener() { //��ư�� ������ Ÿ��Ʋ�� ��ư�� ��ǥ ���
			@Override
			public void actionPerformed(ActionEvent e) {
				JButton b = (JButton)e.getSource();
				JComponentEx frame = (JComponentEx)b.getTopLevelAncestor(); //�ֻ��� ���� ��ȯ
				frame.setTitle(b.getX() + "," + b.getY());
				b2.setEnabled(true);
			}
		});
		
		c.add(b1); c.add(b2); c.add(b3);
		setSize(260, 200);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new JComponentEx();

	}

}
