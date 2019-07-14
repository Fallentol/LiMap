public class Field {
    /**
     * Data container
     */
    private static int[][] field;

    public static void initObstacle(int[][] obstacle) {
        field = new int[Config.WIDTH][Config.HEIGHT];
        for (int i = 0; i < field.length; i++) {
            for (int j = 0; j < field[i].length; j++) {
                int obst = obstacle[i][j];
                if (obst != 0) field[i][j] = obst;
            }
        }
    }

    public static void initStartAndFinish(int startX, int startY, int finishX, int finishY) {
        field[startX][startY] = Config.startSign;
        field[finishX][finishY] = Config.finishSign;
    }

    public static int[][] getField(int[][] obstacle, int startX, int startY, int finishX, int finishY) {
        initObstacle(obstacle);
        initStartAndFinish(startX, startY, finishX, finishY);
        return field;
    }

    public static int[][] createFieldWave() {

        return field;
    }

    private static void addWave(int index) {


    }

}
