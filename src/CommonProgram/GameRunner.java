package CommonProgram;

public class GameRunner {
	private MarioGame game;

	public GameRunner(MarioGame game) {
		
		this.game=game;
		}

	public void runGame() {
		game.up();
		game.down();
		game.left();
		game.right();
	}
	
	public static void main(String[] args) {
		MarioGame game=new MarioGame();
		
		GameRunner runner=new GameRunner(game);
		runner.runGame();
		
		
	}

}
