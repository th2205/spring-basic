package basic;

public class GamingAppBasicJava {
    public static void main(String[] args) {
        var marioGame= new MarioGame();
        var gameRunner = new GameRunner(marioGame);

        gameRunner.run();

    }
}
