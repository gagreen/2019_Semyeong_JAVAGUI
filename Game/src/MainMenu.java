import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

import java.awt.Dimension;
import javax.swing.border.*;;


public class MainMenu {
	
	private JFrame window;
	private ImageIcon backgroundImageIcon;
	private JLabel bkgImageContainer;
	private JButton gridSizeBtn;
	private JButton startGame;
	private JButton battleshipSize, cruiserSize, destroyerSize, submarineSize;
	private JButton battleshipCount, cruiserCount, destroyerCount, submarineCount;
	private JLabel errorMessage;
	private volatile boolean isImageVisible;
	private static final int MAX_SHIP_SIZE = 8;
	private static final int MAX_SHIP_COUNT = 5;
	
	public MainMenu(JFrame theWindow){
		window = theWindow;
		backgroundImageIcon = new ImageIcon("images\\Title.png");
		bkgImageContainer = new JLabel(backgroundImageIcon);
		isImageVisible = true;
	}
	
	public boolean canShipsFitOnBoard(){
		int totalShipSize = (GameLogic.battleshipCount * GameLogic.battleshipSize) + 
				(GameLogic.cruiserCount * GameLogic.cruiserSize) +
				(GameLogic.destroyerCount * GameLogic.destroyerSize) + 
				(GameLogic.submarineCount * GameLogic.submarineSize);
		if (totalShipSize > GameLogic.boardSize*GameLogic.boardSize){
			return false;
		}
		if (GameLogic.battleshipSize > GameLogic.boardSize){
			return false;
		}
		if (GameLogic.cruiserSize > GameLogic.boardSize){
			return false;
		}
		if (GameLogic.destroyerSize > GameLogic.boardSize){
			return false;
		}
		if (GameLogic.submarineSize > GameLogic.boardSize){
			return false;
		}
		return true;
	}
	
	public void loadTitleScreen() {
		bkgImageContainer.setSize(window.getContentPane().getWidth(),
				window.getContentPane().getHeight()/2);
		bkgImageContainer.setLocation(0, 0); 
		bkgImageContainer.setVisible(true);
		
		errorMessage = new JLabel("Error: grid is too small to fit the selected ships");
		errorMessage.setForeground(Color.RED);
		errorMessage.setFont(new Font("Impact", Font.PLAIN, 24));
		errorMessage.setSize(440, 40);
		errorMessage.setLocation(window.getWidth()/2 - errorMessage.getWidth()/2,
				window.getHeight()-errorMessage.getHeight() - 30);
		errorMessage.setVisible(false);
		
		startGame = new JButton("Start Game");
		startGame.setSize(200, 100);
		startGame.setLocation(150, bkgImageContainer.getHeight() + 50);
		startGame.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent arg0) {
				window.getContentPane().remove(startGame);
				window.getContentPane().remove(bkgImageContainer);
				window.getContentPane().remove(gridSizeBtn);
				window.getContentPane().remove(battleshipSize);
				window.getContentPane().remove(cruiserSize);
				window.getContentPane().remove(destroyerSize);
				window.getContentPane().remove(submarineSize);
				window.getContentPane().remove(battleshipCount);
				window.getContentPane().remove(cruiserCount);
				window.getContentPane().remove(destroyerCount);
				window.getContentPane().remove(submarineCount);
				window.getContentPane().revalidate();
				window.getContentPane().repaint();
				window.getContentPane().setBackground(Color.WHITE);
				isImageVisible = false;
			}	
		});
		
		gridSizeBtn = new JButton("(6x6 ~ 18x18)칸: " + GameLogic.boardSize);
		gridSizeBtn.setSize(200, 100); 
		gridSizeBtn.setLocation(150, bkgImageContainer.getHeight() + startGame.getHeight() + 50);
		gridSizeBtn.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent arg0) {
				if (GameLogic.boardSize < 18){
					GameLogic.boardSize += 2;
				}else{
					GameLogic.boardSize = 6;
				}
				gridSizeBtn.setText("(6x6 ~ 18x18)칸: " + GameLogic.boardSize);
				boolean shipsFit = canShipsFitOnBoard();
				startGame.setEnabled(shipsFit);
				errorMessage.setVisible(!shipsFit);
			}	
		});
		
		battleshipSize = new JButton("전함 " + GameLogic.battleshipSize+ "칸");//4
		
		
		battleshipSize.setHorizontalAlignment(JLabel.CENTER);
		battleshipSize.setOpaque(true);
		battleshipSize.setBackground(Color.WHITE);
		battleshipSize.setBorder(new LineBorder(Color.black,1,true));
		battleshipSize.setEnabled(false);

		
		battleshipSize.setSize(200, 50); 
		battleshipSize.setLocation(window.getContentPane().getWidth() - battleshipSize.getWidth() - 300, 
				bkgImageContainer.getHeight() + 50);
		battleshipSize.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent arg0) {
				

				boolean shipsFit = canShipsFitOnBoard();
				startGame.setEnabled(shipsFit);
				errorMessage.setVisible(!shipsFit);
			}	
			
		});
		
		
		battleshipCount = new JButton("전함 개수: " + GameLogic.battleshipCount);
		battleshipCount.setSize(200, 50); 
		battleshipCount.setLocation(window.getContentPane().getWidth() - battleshipCount.getWidth() - 100, 
				bkgImageContainer.getHeight() + 50);
		battleshipCount.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent arg0) {
				if (GameLogic.battleshipCount  < MAX_SHIP_COUNT){
					GameLogic.battleshipCount += 1;
				}else{
					GameLogic.battleshipCount = 1;
				}
				battleshipCount.setText("전함 개수: " + GameLogic.battleshipCount);
				boolean shipsFit = canShipsFitOnBoard();
				startGame.setEnabled(shipsFit);
				errorMessage.setVisible(!shipsFit);
			}	
		});
		
		
		cruiserSize = new JButton("전함 " + GameLogic.cruiserSize+"칸");//3
		
		cruiserSize.setHorizontalAlignment(JLabel.CENTER);
		cruiserSize.setOpaque(true);
		cruiserSize.setBackground(Color.WHITE);
		cruiserSize.setBorder(new LineBorder(Color.black,1,true));
		cruiserSize.setEnabled(false);
		
		cruiserSize.setSize(200, 50); 
		cruiserSize.setLocation(window.getContentPane().getWidth() - cruiserSize.getWidth() - 300, 
				bkgImageContainer.getHeight() + battleshipSize.getHeight() + 50);
		cruiserSize.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent arg0) {
				
				boolean shipsFit = canShipsFitOnBoard();
				startGame.setEnabled(shipsFit);
				errorMessage.setVisible(!shipsFit);
			}	
		});
		
		
		cruiserCount = new JButton("전함 개수: " + GameLogic.cruiserCount);
		cruiserCount.setSize(200, 50); 
		cruiserCount.setLocation(window.getContentPane().getWidth() - cruiserCount.getWidth() - 100, 
				bkgImageContainer.getHeight() + battleshipCount.getHeight() + 50);
		cruiserCount.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent arg0) {
				if (GameLogic.cruiserCount  < MAX_SHIP_COUNT){
					GameLogic.cruiserCount += 1;
				}else{
					GameLogic.cruiserCount = 1;
				}
				cruiserCount.setText("전함 개수: " + GameLogic.cruiserCount);
				boolean shipsFit = canShipsFitOnBoard();
				startGame.setEnabled(shipsFit);
				errorMessage.setVisible(!shipsFit);
			}	
		});
		
		
		destroyerSize = new JButton("전함 " + GameLogic.destroyerSize+"칸");//2
		
		destroyerSize.setHorizontalAlignment(JLabel.CENTER);
		destroyerSize.setOpaque(true);
		destroyerSize.setBackground(Color.WHITE);
		destroyerSize.setBorder(new LineBorder(Color.black,1,true));
		destroyerSize.setEnabled(false);
		
		destroyerSize.setSize(200, 50); 
		destroyerSize.setLocation(window.getContentPane().getWidth() - battleshipSize.getWidth() - 300, 
				bkgImageContainer.getHeight() + battleshipSize.getHeight() + cruiserSize.getHeight() + 50);
		destroyerSize.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent arg0) {
				
				boolean shipsFit = canShipsFitOnBoard();
				startGame.setEnabled(shipsFit);
				errorMessage.setVisible(!shipsFit);
			}	
		});
		
		
		destroyerCount = new JButton("전함 개수: " + GameLogic.destroyerCount);
		destroyerCount.setSize(200, 50); 
		destroyerCount.setLocation(window.getContentPane().getWidth() - destroyerCount.getWidth() - 100, 
				bkgImageContainer.getHeight() +
				battleshipCount.getHeight() + 
				cruiserCount.getHeight() + 50);
		destroyerCount.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent arg0) {
				if (GameLogic.destroyerCount  < MAX_SHIP_COUNT){
					GameLogic.destroyerCount += 1;
				}else{
					GameLogic.destroyerCount = 1;
				}
				destroyerCount.setText("전함 개수: " + GameLogic.destroyerCount);
				boolean shipsFit = canShipsFitOnBoard();
				startGame.setEnabled(shipsFit);
				errorMessage.setVisible(!shipsFit);
			}	
		});
		
		
		submarineSize = new JButton("전함 " + GameLogic.submarineSize+"칸");//1
		
		submarineSize.setHorizontalAlignment(JLabel.CENTER);
		submarineSize.setOpaque(true);
		submarineSize.setBackground(Color.WHITE);
		submarineSize.setBorder(new LineBorder(Color.black,1,true));
		submarineSize.setEnabled(false);
		
		submarineSize.setSize(200, 50); 
		submarineSize.setLocation(window.getContentPane().getWidth() - submarineSize.getWidth() - 300, 
				bkgImageContainer.getHeight() + 
				battleshipSize.getHeight() + 
				cruiserSize.getHeight() + 
				destroyerSize.getHeight() + 50);
		submarineSize.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent arg0) {
				
				boolean shipsFit = canShipsFitOnBoard();
				startGame.setEnabled(shipsFit);
				errorMessage.setVisible(!shipsFit);
			}	
		});
		
		submarineCount = new JButton("전함 개수: " + GameLogic.submarineCount);
		submarineCount.setSize(200, 50); 
		submarineCount.setLocation(window.getContentPane().getWidth() - submarineCount.getWidth() - 100, 
				bkgImageContainer.getHeight() +
				battleshipCount.getHeight() + 
				cruiserCount.getHeight() + 
				destroyerCount.getHeight() + 50);
		submarineCount.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent arg0) {
				if (GameLogic.submarineCount  < MAX_SHIP_COUNT){
					GameLogic.submarineCount += 1;
				}else{
					GameLogic.submarineCount = 1;
				}
				submarineCount.setText("전함 개수: " + GameLogic.submarineCount);
				boolean shipsFit = canShipsFitOnBoard();
				startGame.setEnabled(shipsFit);
				errorMessage.setVisible(!shipsFit);
			}	
		});
		
		startGame.setVisible(true);
		gridSizeBtn.setVisible(true);
		battleshipSize.setVisible(true);
		cruiserSize.setVisible(true);
		destroyerSize.setVisible(true);
		submarineSize.setVisible(true);
		battleshipCount.setVisible(true);
		cruiserCount.setVisible(true);
		destroyerCount.setVisible(true);
		submarineCount.setVisible(true);
		
		window.getContentPane().add(errorMessage);
		window.getContentPane().add(startGame);
		window.getContentPane().add(bkgImageContainer);
		window.getContentPane().add(gridSizeBtn);
		window.getContentPane().add(battleshipSize);
		window.getContentPane().add(cruiserSize);
		window.getContentPane().add(destroyerSize);
		window.getContentPane().add(submarineSize);
		window.getContentPane().add(battleshipCount);
		window.getContentPane().add(cruiserCount);
		window.getContentPane().add(destroyerCount);
		window.getContentPane().add(submarineCount);
		
		window.getContentPane().setBackground(Color.BLACK);
		window.setVisible(true);
		window.getContentPane().revalidate();
		window.getContentPane().repaint();
	}

	public boolean isImageVisible(){
		return isImageVisible;
	}
	
}
