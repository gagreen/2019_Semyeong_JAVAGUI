import javax.swing.*;
import java.awt.*;

class NorthPanel extends JPanel{
	public NorthPanel() {
		setBackground(Color.LIGHT_GRAY);
		setLayout(new FlowLayout());
		add(new JLabel("�����Է�"));
		add(new JTextField(15));
	}
}

class SouthPanel extends JPanel{
	public SouthPanel() {
		setBackground(Color.YELLOW);
		setLayout(new FlowLayout(FlowLayout.LEFT));
		add(new JLabel("��� ���"));
		add(new JTextField(15));
	}
}
class CenterPanel extends JPanel {
	public CenterPanel() {
		setLayout(new GridLayout(4, 4, 5, 5));
		String [] arr = {"0","1","2","3","4","5","6","7","8","9","CE","���"};
		String [] operator = {"+","-","x","/"};
		
		for(int i=0; i<arr.length; i++) {
			JButton b = new JButton(arr[i]);
			add(b);
		}
		
		for(int i=0; i<operator.length;i++) {
			JButton b = new JButton(operator[i]);
			b.setBackground(Color.CYAN);
			add(b);
			
		}
	}
}

public class CalcFrame extends JFrame{
	public CalcFrame() {
		super("���� ������");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();		
		
		c.setLayout(new BorderLayout());
		c.add(new NorthPanel(), BorderLayout.NORTH);
		c.add(new CenterPanel(), BorderLayout.CENTER);
		c.add(new SouthPanel(), BorderLayout.SOUTH);

		setSize(300, 400);
		setVisible(true);
	}
	public static void main(String[] args) {
		new CalcFrame();

	}

}
