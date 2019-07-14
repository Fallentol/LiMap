import java.util.Random;

public class Obstacle {

    private static int[][] OBSTACLE;

    public static int[][] getObstacle() {
        OBSTACLE = new int[Config.WIDTH][Config.HEIGHT];

        //getStaticObstacle();
        getRandomObstacle();
        getRandomStringObstacle();


        return OBSTACLE;
    }

    public static void getStaticObstacle() {
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


        setObstacle(11, 9);
        setObstacle(14, 9);
        setObstacle(13, 9);
        setObstacle(12, 9);
        setObstacle(15, 9);
        setObstacle(14, 10);
        setObstacle(14, 11);
        setObstacle(14, 12);
        setObstacle(14, 13);
        setObstacle(14, 14);
        setObstacle(14, 15);
        setObstacle(14, 16);
        setObstacle(14, 17);
        setObstacle(14, 18);
        setObstacle(14, 19);


        setObstacle(15, 12);

        setObstacle(0, 7);
        setObstacle(1, 7);
        setObstacle(2, 7);
        setObstacle(5, 7);
        setObstacle(5, 8);

        setObstacle(10, 1);
        setObstacle(10, 2);
        setObstacle(10, 3);
        setObstacle(10, 4);
        setObstacle(10, 5);
        setObstacle(10, 6);
        setObstacle(10, 7);
        setObstacle(10, 8);
        setObstacle(10, 9);
        setObstacle(10, 10);
        setObstacle(10, 11);
        setObstacle(10, 12);
        setObstacle(10, 13);
        setObstacle(10, 14);
        setObstacle(11, 14);
        setObstacle(12, 14);


        setObstacle(16, 21);
        setObstacle(16, 22);
        setObstacle(16, 24);
        setObstacle(16, 23);
        setObstacle(16, 25);
        setObstacle(15, 25);
        setObstacle(14, 25);
        setObstacle(13, 25);
        setObstacle(12, 25);
        setObstacle(11, 25);
        setObstacle(10, 25);
        setObstacle(9, 25);
        setObstacle(8, 25);
        setObstacle(7, 25);
        setObstacle(6, 25);
        setObstacle(5, 25);
        setObstacle(4, 25);
        setObstacle(1, 25);

        setObstacle(21, 20);
        setObstacle(21, 21);
        setObstacle(21, 22);
        setObstacle(21, 23);
        setObstacle(21, 24);
        setObstacle(21, 25);
        setObstacle(21, 26);
        setObstacle(21, 27);
        setObstacle(21, 6);
        setObstacle(21, 7);
        setObstacle(21, 8);
        setObstacle(21, 9);
        setObstacle(21, 10);
        setObstacle(21, 11);
        setObstacle(21, 12);
        setObstacle(21, 13);
        setObstacle(21, 14);
        setObstacle(21, 15);
        setObstacle(21, 16);
        setObstacle(21, 17);
    }


    public static void getRandomObstacle() {
        for (int i = 0; i < Config.randomObstacle; i++)
            setObstacle(new Random().nextInt(Config.WIDTH), new Random().nextInt(Config.HEIGHT));
    }

    public static void getRandomStringObstacle() {
        for (int m = 0; m < Config.randomObstacleNumber; m++) {
            int randomX = new Random().nextInt(Config.WIDTH);
            int randomY = new Random().nextInt(Config.WIDTH);
            int direction = new Random().nextInt(3);
            setObstacle(randomX, randomY);

            for (int i = 0; i < Config.randomObstacleLength; i++) {
                if (direction == 0) { // up
                    if (randomY + 1 < Config.HEIGHT) setObstacle(randomX, ++randomY);
                } else if (direction == 1) {
                    if (randomY - 1 > 0) setObstacle(randomX, --randomY);
                } else if (direction == 2) {
                    if (randomX + 1 < Config.WIDTH) setObstacle(++randomX, randomY);
                } else {
                    if (randomX - 1 > 0) setObstacle(--randomX, randomY);
                }
            }
        }

    }

    public static void setObstacle(int x, int y) {
        OBSTACLE[y][x] = Config.obstacleSign;
    }
}
