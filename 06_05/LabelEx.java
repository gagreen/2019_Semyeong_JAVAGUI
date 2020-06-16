import java.awt.*;
import javax.swing.*;

public class LabelEx extends JFrame{
	public LabelEx() {
		setTitle("레이블 예제");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		
		JLabel textLabel = new JLabel("HELLO WORLD!");
		
		ImageIcon beauty = new ImageIcon("images/beauty.gif");
		JLabel imageLabel = new JLabel(beauty);
		
		ImageIcon javaIcon = new ImageIcon("images/javaIcon.png");
		JLabel label = new JLabel("자바", javaIcon, SwingConstants.CENTER);
		
		c.add(textLabel);
		c.add(imageLabel);
		c.add(label);
		
		setSize(600, 600);
		setVisible(true);
	}
	public static void main(String[] args) {
		new LabelEx();

	}

}
