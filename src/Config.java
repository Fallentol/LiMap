public class Config {

    public static final int startX = 1;
    public static final int startY = 1;
    public static final int finishX = 15;
    public static final int finishY = 15;

    public static final int HEIGHT = 20;
    public static final int WIDTH = 20;
    public static final int LAG = 2000;
    public static final int obstacleSign = 99;
    public static final int startSign = 1;
    public static final int finishSign = 77;


    private static int[][] OBSTACLE;

    public static int[][] getObstacle() {
        OBSTACLE = new int[WIDTH][HEIGHT];
        setObstacle(5,3);
        setObstacle(5,4);
        setObstacle(5,5);
        setObstacle(5,6);
        setObstacle(5,7);
        return OBSTACLE;
    }

    public static void setObstacle(int x, int y) {
        OBSTACLE[x][y] = obstacleSign;
    }


}
