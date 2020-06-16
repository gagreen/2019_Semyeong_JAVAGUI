import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.*;

public class Minesweeper extends JFrame{
	/***/
	private static final long serialVersionUID = 1L;
	Random rad = new Random();
	JPanel infoScreen = new JPanel();
	JPanel gameScreen = new JPanel();
	
	private static boolean ending = false;
	private static final int ROWS = 18; // 행(세로)
	private static final int COLS = 18; // 열(가로)
	private static final int MINE = 40; // 총 지뢰의 개수
	private int mineLeft = MINE; // 남은 지뢰 개수(지뢰 - 깃발)
	
	ImageIcon mineIcon = new ImageIcon("images/mine.png");
	ImageIcon init = new ImageIcon("images/init.png");
	ImageIcon flag = new ImageIcon("images/flag.png");
	ImageIcon flagx = new ImageIcon("images/flagx.png");
	ImageIcon icon0 = new ImageIcon("images/mine0.png");
	ImageIcon icon1 = new ImageIcon("images/mine1.png");
	ImageIcon icon2 = new ImageIcon("images/mine2.png");
	ImageIcon icon3 = new ImageIcon("images/mine3.png");
	ImageIcon icon4 = new ImageIcon("images/mine4.png");
	ImageIcon icon5 = new ImageIcon("images/mine5.png");
	ImageIcon icon6 = new ImageIcon("images/mine6.png");
	ImageIcon icon7 = new ImageIcon("images/mine7.png");
	ImageIcon icon8 = new ImageIcon("images/mine8.png");
	
	
	int [][] plate = new int[ROWS][COLS]; // 좌표의 정보를 닮을 배열
	JButton [][] btnPlate = new JButton[ROWS][COLS]; // 실제 보여질 버튼
	JLabel numOfMine = new JLabel(mineLeft+" Mines left."); // 남은 지뢰의 개수(총 지뢰 - 깃발 수)
	
	public void setInfoScreen() { // 총 지뢰의 개수와 초기화 버튼
		infoScreen.setLayout(new FlowLayout(FlowLayout.CENTER,25, 0));
		numOfMine.setFont(new Font("Arial", Font.BOLD, 25));
		
		JButton reset = new JButton(init); //초기화 역할
		reset.setPreferredSize(new Dimension(60, 60));
		
		reset.addActionListener(new ActionListener() { // 초기화 이벤트
			public void actionPerformed(ActionEvent arg0) {
				dispose(); // 현재 창 닫기
				new Minesweeper(); // 새로운 창 생성
			}
		});
		
		infoScreen.add(reset);
		infoScreen.add(numOfMine);
	}
	
	
	public void setMinePlate() { //지뢰판 초기화
		for(int i, j, count = 0; count < MINE;) {
			i=rad.nextInt(ROWS);
			j=rad.nextInt(COLS);

			if(plate[i][j] != -1) {
				plate[i][j] = -1;
				count++;
			}
		}// 지뢰 난수 발생
		
		for(int i=0; i<ROWS; i++) { // 주변 지뢰 개수를 넣는 반복문
			for(int j=0; j<COLS; j++) {
				int count=0; //지뢰 개수 저장
				
				if(plate[i][j] != -1) { // 지뢰가 아니라면
					if(i >= 0 && j>=0 && i<=ROWS && j<=COLS) {
						
						if(i-1 >= 0 && j-1 >= 0) { // 좌표가 존재한다면 0,0이 최소이기 때문에
							if(plate[i-1][j-1] == -1) count++; // 왼쪽 위
						}
						if(i-1 >= 0) { // 
							if(plate[i-1][j] == -1) count++; // 위
						}
						if(i-1 >= 0 && j+1 < COLS) { //오른쪽 위
							if(plate[i-1][j+1] == -1) count++;
						}
						if(j-1 >= 0) {
							if(plate[i][j-1] == -1) count++; // 왼쪽
						}
						if(j+1 < COLS) {
							if(plate[i][j+1] == -1) count++; // 오른쪽
						}
						if(i+1 <ROWS && j-1 >= 0) { 
							if(plate[i+1][j-1] == -1) count++; // 왼쪽 아래
						}
						if(i+1 < ROWS) { // 아래
							if(plate[i+1][j] == -1) count++;
						}
						if(i+1 <ROWS && j+1 < COLS) {  //오른쪽 아래
							if(plate[i+1][j+1] == -1) count++;
						}
					}
					plate[i][j] = count;
				}
				count = 0;
			}
		}
		
		gameScreen.setLayout(new GridLayout(ROWS, COLS)); 
		for(int i=0; i<ROWS; i++) { // 버튼 삽입
			for(int j=0; j<COLS; j++) {
				/* 클릭, 깃발 이벤트 추가, 클릭ImageIcon 넣기*/
				btnPlate[i][j] = new JButton();
				btnPlate[i][j].setBackground(Color.GRAY);
				btnPlate[i][j].addMouseListener(new clickListener());
				
				if(plate[i][j] == -1) {
					/* 지뢰 이벤트 추가 */
					btnPlate[i][j].addActionListener(new MineListener());
				}else{
					btnPlate[i][j].addActionListener(new ButtonListener());
				}
				gameScreen.add(btnPlate[i][j]);
			}
		}
	}
	
	
	
	
	private class MineListener implements ActionListener{ //지뢰를 클릭했을 때
		@Override
		public void actionPerformed(ActionEvent e) {
			if(ending == false) {
				JOptionPane.showMessageDialog(null, "지뢰를 클릭했습니다. 마우스가 다쳤습니다.");
			
				for(int i=0; i<ROWS; i++) { // 나머지 지뢰를 찾아서 보여주기
					for(int j=0; j<COLS; j++) {
						if(plate[i][j] == -1) {
							btnPlate[i][j].setBackground(Color.GRAY);
							btnPlate[i][j].setIcon(mineIcon);
							ending = true; //다른 버튼을 눌러도 반응하지 못하도록
						}
						else if(plate[i][j] != -1 && btnPlate[i][j].getBackground() != Color.GRAY) { // 깃발을 꽂은 상태
							btnPlate[i][j].setBorderPainted(false);
							btnPlate[i][j].setBackground(Color.GRAY);
							btnPlate[i][j].setIcon(flagx);
						}
						else {
							btnPlate[i][j].setBorderPainted(false);
							btnPlate[i][j].setBackground(Color.GRAY);
						}
					}
				} // for문
			}
		}
	}
	
	private class ButtonListener implements ActionListener{ // NO 지뢰 이벤트 구현
		@Override
		public void actionPerformed(ActionEvent e) {
			JButton b = (JButton)e.getSource();
			for(int i=0; i<ROWS; i++) {
				for(int j=0; j<COLS; j++) {
					
					if(b.equals(btnPlate[i][j]) && btnPlate[i][j].getBackground() == Color.GRAY) { 
						// COLOR은 깃발 판단
						checkNum(i, j);
						break;
					}
				}
			}
		}
		
	}
	
	private class clickListener extends MouseAdapter { // 우클릭 깃발 구현
		@Override
		public void mousePressed(MouseEvent e) {
			
			if(e.getModifiersEx() == InputEvent.BUTTON3_DOWN_MASK) { //우클릭이라면 
				JButton b = (JButton)e.getSource();
				for(int i=0; i<ROWS; i++) {
					for(int j=0; j<COLS; j++){
						if(b == btnPlate[i][j] && btnPlate[i][j].isBorderPainted()==true && btnPlate[i][j].getBackground() == Color.GRAY ) {
							// 원래 깃발이 안 꽂혀있었다면
							b.setIcon(flag);
							b.setBackground(Color.DARK_GRAY);//깃발
							b.setEnabled(false);
							mineLeft--;
						}else if(b == btnPlate[i][j] && btnPlate[i][j].isBorderPainted()==true && btnPlate[i][j].getBackground() == Color.DARK_GRAY){
							b.setIcon(null);
							b.setBackground(Color.GRAY);
							b.setEnabled(true);
							mineLeft++;
						}
					}
				}
				numOfMine.setText(mineLeft + " Mines left.");
			}
		}
	}
	

	
	public void checkNum(int i, int j) {
		try { // indexOutOfRangeException 방지
			if(plate[i][j] == 0 && btnPlate[i][j].isBorderPainted() == true) {
				//	0						기본상태
				btnPlate[i][j].setIcon(icon0);
				btnPlate[i][j].setBorderPainted(false);
				btnPlate[i][j].setContentAreaFilled(false);
				btnPlate[i][j].setFocusPainted(false);
				
				checkNum(i-1, j-1); //0이라면 주변의 버튼 공개
				checkNum(i-1, j);
				checkNum(i-1, j+1);
				checkNum(i, j-1);
				checkNum(i, j+1);
				checkNum(i+1, j-1);
				checkNum(i+1, j);
				checkNum(i+1, j+1);
			} else {
				if(btnPlate[i][j].isBorderPainted() == true) {
					switch(plate[i][j]) {
					case 1: 
						btnPlate[i][j].setIcon(icon1);
						break;
					case 2: 
						btnPlate[i][j].setIcon(icon2);
						break;
					case 3: 
						btnPlate[i][j].setIcon(icon3);
						break;
					case 4: 
						btnPlate[i][j].setIcon(icon4);
						break;
					case 5: 
						btnPlate[i][j].setIcon(icon5);
						break;
					case 6: 
						btnPlate[i][j].setIcon(icon6);
						break;
					case 7: 
						btnPlate[i][j].setIcon(icon7);
						break;
					case 8: 
						btnPlate[i][j].setIcon(icon8);
						break;
					}
					btnPlate[i][j].setBorderPainted(false);
					btnPlate[i][j].setContentAreaFilled(false);
					btnPlate[i][j].setFocusPainted(false);
				}
				
			}
			victory();
			
		}catch(Exception e) {}
	}
	
	private void victory() { // 승리 판단
		int count = 0;
		for(int i=0; i<ROWS; i++) {
			for(int j=0; j<COLS; j++) {
				if(plate[i][j] != -1 && btnPlate[i][j].isBorderPainted() == false) {
					//지뢰가 아니며					클릭된 것만 카운트
					count++;
				}
			}
		}
		if(count >= ROWS * COLS - MINE) { // 클릭한 것이 총 버튼에서 지뢰를 제외함
			/* 즉, 지뢰를 제외한 버튼을 다 눌렀다면 */
			for(int i=0; i<ROWS; i++) {
				for(int j=0; j<COLS; j++) {
					if(btnPlate[i][j].isBorderPainted() == true) { //클릭 되지 않은 것
						btnPlate[i][j].setBorderPainted(false);
						
						if(plate[i][j] == -1) { // 지뢰라면
							btnPlate[i][j].setIcon(mineIcon);
						}
					}
				}
			}
			if(ending == false) {
				JOptionPane.showMessageDialog(null, "승리!");
				ending = true;
			}
		}
	}
	
	public Minesweeper() {
		setTitle("Minesweeper");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		
		ending = false;
		
		c.setLayout(new BorderLayout(0, 20));
		this.setInfoScreen(); //상단의 바 만들기
		this.setMinePlate(); // 지뢰판 처음 설정
		
		c.add(infoScreen, BorderLayout.NORTH);
		c.add(gameScreen, BorderLayout.CENTER);
		
		setSize(800,900);
		setVisible(true);
	}
	
	
	//메인 메서드
	public static void main(String [] args) {
		new Minesweeper();
	}

}