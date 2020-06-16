
public class SeaThread extends Thread{
	@Override
	public void run() {
		new GameLogic().setUpWindow();
	}
	
}
