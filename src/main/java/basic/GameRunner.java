package basic;

public class GameRunner {
    private final GameConsole game;

    public GameRunner(GameConsole game) {
        this.game = game;
    }

    public void run() {
        game.up();
        game.down();
        game.left();
        game.right();
        game.printGameName();
    }
}
