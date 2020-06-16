import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Main extends JFrame{
	public Main() {
		setTitle("Two Board Game");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //기본 초기화
		Container c = getContentPane(); 
		c.setLayout(new FlowLayout()); //배치 관리자 지정
		c.setBackground(Color.ORANGE); //배경색 설정
		
		JLabel title = new JLabel("Two Board Game"); //제목
		title.setFont(new Font("Arial",Font.BOLD,50));
		
		JButton firstGame = new JButton(" Sea Battle "); // 배틀 쉽
		JButton secondGame = new JButton(" Minesweeper "); // 지뢰 찾기
		
		firstGame.setFont(new Font("Arial",Font.PLAIN,40));
		secondGame.setFont(new Font("Arial",Font.PLAIN,40));
		firstGame.addActionListener(new ActionListener() { // 이벤트 추가
			public void actionPerformed(ActionEvent e) {
				/* Sea Battle 페이지 띄움 */
				SeaThread st = new SeaThread();
				st.start();
			}
		});
		secondGame.addActionListener(new ActionListener() { // 이벤트 추가
			public void actionPerformed(ActionEvent e) {
				/* 지뢰 찾기 페이지 띄움 */
				new Minesweeper(); // 새 창으로 열기
			}
		});
		c.add(title);
		c.add(firstGame);
		c.add(secondGame); //요소들 넣기
		
		setSize(500, 300);
		setVisible(true);
	}
	
	private void startingSeaBattle() {
		new GameLogic().setUpWindow();
	}
	
	public static void main(String[] args) {
		new Main();

	}

}
