import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class KeyListenerEx extends JFrame{
	private JLabel [] keyMessage;
	
	public KeyListenerEx() {
		setTitle("KeyListener 예제");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		c.addKeyListener(new MyKeyListener());
		
		keyMessage = new JLabel[3]; //레이블 배열 생성 및 레이블 컴포넌트 생성
		keyMessage[0] = new JLabel("getKeyCode(): ");
		keyMessage[1] = new JLabel("getKeyKeyChar(): ");
		keyMessage[2] = new JLabel("getKeyText(): ");
		
		for(int i=0; i<keyMessage.length; i++) {
			c.add(keyMessage[i]);
			keyMessage[i].setOpaque(true); // 투명도
			keyMessage[i].setBackground(Color.YELLOW);
		}
		
		setSize(300, 150);
		setVisible(true);
		
		c.setFocusable(true); //포커스 할 수 있도록
		c.requestFocus(); // 강제로 포커스 지정
	}
	
	class MyKeyListener extends KeyAdapter{
		public void keyPressed(KeyEvent e) {
			int keyCode = e.getKeyCode(); // 키 코드 알아내기
			char keyChar = e.getKeyChar(); // 키 문자 값
			keyMessage[0].setText(Integer.toString(keyCode)); // 키 코드
			keyMessage[1].setText(Character.toString(keyChar)); // 유니코드 문자
			keyMessage[2].setText(KeyEvent.getKeyText(keyCode)); // 문자열
			
			System.out.println("KeyPressed");
		}

		@Override
		public void keyReleased(KeyEvent e) {
			System.out.println("KeyReleased");
		}

		@Override
		public void keyTyped(KeyEvent e) {
			System.out.println("KeyTyped");
		}
		
	}
	
	public static void main(String[] args) {
		new KeyListenerEx();
	}

}
