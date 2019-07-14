public class Config {

    public static final int startX = 1;
    public static final int startY = 1;
    public static final int finishX = 17;
    public static final int finishY = 14;

    public static final int HEIGHT = 20;
    public static final int WIDTH = 20;
    public static final int LAG = 2000;
    public static final int obstacleSign = 99;
    public static final int startSign = 1;
    public static final int finishSign = 88;


    private static int[][] OBSTACLE;

    public static int[][] getObstacle() {
        OBSTACLE = new int[WIDTH][HEIGHT];
        setObstacle(5, 0);
        setObstacle(5, 1);
        setObstacle(5, 2);
        setObstacle(5, 3);
        setObstacle(5, 4);
        setObstacle(5, 5);
        setObstacle(5, 6);
        setObstacle(5, 7);
        setObstacle(5, 10);
        setObstacle(5, 11);
        setObstacle(5, 12);
        setObstacle(5, 13);
        setObstacle(5, 14);
        setObstacle(5, 15);
        setObstacle(14, 10);
        setObstacle(14, 11);
        setObstacle(14, 12);
        setObstacle(14, 13);
        setObstacle(14, 14);
        setObstacle(14, 15);
        setObstacle(14, 16);
        setObstacle(14, 17);
        setObstacle(15, 12);
        setObstacle(0, 7);
        setObstacle(1, 7);
        setObstacle(2, 7);
        setObstacle(4, 7);
        setObstacle(5, 7);

        setObstacle(10, 7);
        setObstacle(10, 8);
        setObstacle(10, 9);
        setObstacle(10, 10);
        setObstacle(10, 11);
        setObstacle(10, 12);
        setObstacle(10, 13);
        setObstacle(10, 14);
        setObstacle(10, 15);


        return OBSTACLE;
    }

    public static void setObstacle(int x, int y) {
        OBSTACLE[x][y] = obstacleSign;
    }


}
