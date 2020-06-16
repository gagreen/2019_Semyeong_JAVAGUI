import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class KeyListenerEx extends JFrame{
	private JLabel [] keyMessage;
	
	public KeyListenerEx() {
		setTitle("KeyListener ����");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		c.addKeyListener(new MyKeyListener());
		
		keyMessage = new JLabel[3]; //���̺� �迭 ���� �� ���̺� ������Ʈ ����
		keyMessage[0] = new JLabel("getKeyCode(): ");
		keyMessage[1] = new JLabel("getKeyKeyChar(): ");
		keyMessage[2] = new JLabel("getKeyText(): ");
		
		for(int i=0; i<keyMessage.length; i++) {
			c.add(keyMessage[i]);
			keyMessage[i].setOpaque(true); // ����
			keyMessage[i].setBackground(Color.YELLOW);
		}
		
		setSize(300, 150);
		setVisible(true);
		
		c.setFocusable(true); //��Ŀ�� �� �� �ֵ���
		c.requestFocus(); // ������ ��Ŀ�� ����
	}
	
	class MyKeyListener extends KeyAdapter{
		public void keyPressed(KeyEvent e) {
			int keyCode = e.getKeyCode(); // Ű �ڵ� �˾Ƴ���
			char keyChar = e.getKeyChar(); // Ű ���� ��
			keyMessage[0].setText(Integer.toString(keyCode)); // Ű �ڵ�
			keyMessage[1].setText(Character.toString(keyChar)); // �����ڵ� ����
			keyMessage[2].setText(KeyEvent.getKeyText(keyCode)); // ���ڿ�
			
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
