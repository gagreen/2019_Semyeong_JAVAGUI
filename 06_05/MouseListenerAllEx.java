import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class MouseListenerAllEx extends JFrame{
	private JLabel la = new JLabel("No Mouse Event");
	
	public MouseListenerAllEx() {
		setTitle("MouseListener and Mouse MothionListener Ex");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		
		MyMouseListener listener = new MyMouseListener(); //������ ��ü
		c.addMouseListener(listener); // ���콺������ ���
		c.addMouseMotionListener(listener); // ���콺��Ǹ����� ���
		
		c.add(la);
		setSize(300, 200);
		setVisible(true);
	}
	
	class MyMouseListener extends MouseAdapter{ //implements MouseListener MouseMotionListener�� ����
		//MouseListener 
		@Override
		public void mouseEntered(MouseEvent e) { //���콺�� �ö󰬴ٸ�
			Component c = (Component)e.getSource(); //���콺�� �ö� ������Ʈ�� �˾Ƴ�
			c.setBackground(Color.CYAN);
		}

		@Override
		public void mouseExited(MouseEvent e) { //���콺�� �����ٸ�
			Component c = (Component)e.getSource();
			c.setBackground(Color.YELLOW);
		}
		
		@Override
		public void mousePressed(MouseEvent e) { //���콺�� ��ư�� ��������
			la.setText("MousePressed(" + e.getX() + "," + e.getY() + ")"); //���콺�� ������ ��ǥ ���
		}

		@Override
		public void mouseReleased(MouseEvent e) {
			la.setText("MouseReleased(" + e.getX() + "," + e.getY() + ")"); //���콺�� ������ ��ǥ ���
		}
		
		//MouseMotionListener
		@Override
		public void mouseDragged(MouseEvent e) {
			la.setText("MouseDragged(" + e.getX() + "," + e.getY() + ")");
		}
		
		@Override
		public void mouseMoved(MouseEvent e) { //���콺�� �����̴� ����
			la.setText("MouseMoved(" + e.getX() + "," + e.getY() + ")");
		}
		
	}
	public static void main(String[] args) {
		new MouseListenerAllEx();

	}

}
