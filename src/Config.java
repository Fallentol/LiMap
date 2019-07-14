import java.util.Random;

public class Config {

    public static final int startX = new Random().nextInt(3);
    public static final int startY = new Random().nextInt(3);
    public static final int finishX = 28;
    public static final int finishY = 28;

    public static final int HEIGHT = 30;
    public static final int WIDTH = 30;
    public static final int LAG = 2000;
    public static final int obstacleSign = 99;
    public static final int startSign = 1;
    public static final int finishSign = 88;
    public static final int randomObstacle = 120;
    public static final int randomObstacleLength = 5;
    public static final int randomObstacleNumber = 15;

    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_BLACK = "\u001B[30m";
    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_GREEN = "\u001B[32m";
    public static final String ANSI_YELLOW = "\u001B[33m";
    public static final String ANSI_BLUE = "\u001B[34m";
    public static final String ANSI_PURPLE = "\u001B[35m";
    public static final String ANSI_CYAN = "\u001B[36m";
    public static final String ANSI_WHITE = "\u001B[37m";
}
