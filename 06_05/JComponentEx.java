import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class JComponentEx extends JFrame{
	public JComponentEx() {
		super("JComponent의 공통 메소드 예제");
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		
		JButton b1 = new JButton("Magenta/Yellow Button");
		JButton b2 = new JButton("     Disable Button     ");
		JButton b3 = new JButton("getX(), getY()");
		
		b1.setBackground(Color.YELLOW); //배경색
		b1.setForeground(Color.MAGENTA); //글자색
		b1.setFont(new Font("Arial", Font.ITALIC, 20));
		b1.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				b2.setEnabled(false);
			}
		});
		
		b2.setEnabled(false); //비활성화
		
		b3.addActionListener(new ActionListener() { //버튼을 누르면 타이틀에 버튼의 좌표 출력
			@Override
			public void actionPerformed(ActionEvent e) {
				JButton b = (JButton)e.getSource();
				JComponentEx frame = (JComponentEx)b.getTopLevelAncestor(); //최상위 조상 반환
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
