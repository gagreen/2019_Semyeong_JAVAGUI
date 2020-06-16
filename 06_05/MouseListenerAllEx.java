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
		
		MyMouseListener listener = new MyMouseListener(); //리스너 객체
		c.addMouseListener(listener); // 마우스리스너 등록
		c.addMouseMotionListener(listener); // 마우스모션리스너 등록
		
		c.add(la);
		setSize(300, 200);
		setVisible(true);
	}
	
	class MyMouseListener extends MouseAdapter{ //implements MouseListener MouseMotionListener과 같음
		//MouseListener 
		@Override
		public void mouseEntered(MouseEvent e) { //마우스가 올라갔다면
			Component c = (Component)e.getSource(); //마우스가 올라간 컴포넌트를 알아냄
			c.setBackground(Color.CYAN);
		}

		@Override
		public void mouseExited(MouseEvent e) { //마우스가 나갔다면
			Component c = (Component)e.getSource();
			c.setBackground(Color.YELLOW);
		}
		
		@Override
		public void mousePressed(MouseEvent e) { //마우스의 버튼이 눌렸으면
			la.setText("MousePressed(" + e.getX() + "," + e.getY() + ")"); //마우스가 눌러진 좌표 출력
		}

		@Override
		public void mouseReleased(MouseEvent e) {
			la.setText("MouseReleased(" + e.getX() + "," + e.getY() + ")"); //마우스가 떼어진 좌표 출력
		}
		
		//MouseMotionListener
		@Override
		public void mouseDragged(MouseEvent e) {
			la.setText("MouseDragged(" + e.getX() + "," + e.getY() + ")");
		}
		
		@Override
		public void mouseMoved(MouseEvent e) { //마우스가 움직이는 동안
			la.setText("MouseMoved(" + e.getX() + "," + e.getY() + ")");
		}
		
	}
	public static void main(String[] args) {
		new MouseListenerAllEx();

	}

}
