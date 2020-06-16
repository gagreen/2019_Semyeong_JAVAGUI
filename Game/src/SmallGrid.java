
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.JPanel;
public class SmallGrid extends JPanel implements MouseListener{
	private static final long serialVersionUID = 1L;
	private Object[][] array;
	private BufferedImage gridImage;
	public static final int X_ORIGIN = 24; // X coordinate of the top left
	public static final int Y_ORIGIN = 25; // y coordinate of the top left
	public static final int TILE_SIZE = 20; // size of the tile spaces
	public static final int BORDER_SIZE = 2; // size of the border between tiles
	public static final int PIECE_SIZE = 20; // size of the pieces that appear
	private volatile boolean isTurn;
	private boolean state;

	/*
	 * Constructor that takes a 2d array object
	 */
	
	public SmallGrid(Object[][] array) {
		this.array = array;
		
		// sets the background to white
		setBackground(Color.WHITE);
		setPreferredSize(new Dimension((X_ORIGIN + 2 + (TILE_SIZE+BORDER_SIZE)*array.length), 
				Y_ORIGIN+ 2 + ((TILE_SIZE+BORDER_SIZE)*array.length)));
		setSize(getPreferredSize());
		
		// loads the grid file
		try {
			gridImage = ImageIO.read(new File("images\\gridSmallLabels.png"));
		} catch (IOException e) {
			System.out.println("Failed to load image");
		}
	}
	@Override
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		Graphics2D g2 = (Graphics2D) g;
		// draws the grid
		g2.drawImage(gridImage, 0, 0, this);

		// loops through all spots in the grid
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				// checks if there is a 1 or a ShipPiece that has not been
				// destroyed
				if (array[i][j].equals((Object) 1) || ((array[i][j]).getClass().getName().equals("ShipPiece")
						&& !((ShipPiece) array[i][j]).isDestroy())) {
					// covers the spot on the grid with a gray box
					g2.setColor(Color.gray);
					g2.fillRect(X_ORIGIN + i + 1 + ((TILE_SIZE + BORDER_SIZE) * i), Y_ORIGIN + j + 1 + ((TILE_SIZE + BORDER_SIZE) * j),
							TILE_SIZE+(BORDER_SIZE/2)-1, TILE_SIZE+(BORDER_SIZE/2)-1);
					// if there is a ship piece at the position that is
					// destroyed
				} else if ((array[i][j]).getClass().getName().equals("ShipPiece")) {
					// draw the image associated with the ship piece
					g2.drawImage(((ShipPiece) array[i][j]).getShipImage(),
							X_ORIGIN + i + ((TILE_SIZE + BORDER_SIZE) * i) + BORDER_SIZE/2,
							Y_ORIGIN + j + ((TILE_SIZE + BORDER_SIZE) * j) + BORDER_SIZE/2, PIECE_SIZE, PIECE_SIZE, this);
				}
			}
		}

	}


public void mouseClicked(MouseEvent e) {
}

@Override
public void mouseEntered(MouseEvent e) {
}

@Override
public void mouseExited(MouseEvent e) {
}

@Override
public void mousePressed(MouseEvent e) {
}

/*
 * Returns isTurn
 */
public boolean isTurn() {
	return isTurn;
}

/*
 * Sets the turn to the parameter
 */
public void setTurn(boolean t) {
	isTurn = t;
}

/*
 * Returns the grid array
 */
public Object[][] getArray() {
	return array;
}

/*
 * Sets the grid array to the parameter
 */
public void setArray(Object[][] arr) {
	array = arr;
}

public boolean getState(){
	return state;
}

public void setState(boolean s){
	state = s;
}
@Override
public void mouseReleased(MouseEvent e) {
	// TODO Auto-generated method stub
	
}

}
