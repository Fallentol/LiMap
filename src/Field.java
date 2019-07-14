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
        int maxIndex = Config.HEIGHT * Config.WIDTH;
        for (int i = 1; i < maxIndex; i++) {
            addWave(i);
        }
        return field;
    }

    public static int[][] createPath() {
        W initW = new W(0, 0, 0);
        for (int i = 0; i < field.length; i++) {
            for (int j = 0; j < field[i].length; j++) {
                if (field[i][j] == Config.finishSign) {
                    initW = new W(i, j, field[i][j]);
                }
            }
        }

        while (initW != null) {
            initW = findPath(initW);
        }

        return field;
    }

    private static W findPath(W init) {
        int i = init.x;
        int j = init.y;

        int right = i < Config.WIDTH - 1 ? field[i + 1][j] : 99;
        int left = i > 0 ? field[i - 1][j] : 99;
        int up = j < Config.HEIGHT - 1 ? field[i][j + 1] : 99;
        int down = j > 0 ? field[i][j - 1] : 99;
        int val = Math.min(Math.min(right, left), Math.min(up, down));
        if (val == 1) return null;

        if (val == right) {
            init.x++;
            field[i + 1][j] = Config.finishSign;
        } else if (val == left) {
            init.x--;
            field[i - 1][j] = Config.finishSign;
        } else if (val == up) {
            init.y++;
            field[i][j + 1] = Config.finishSign;
        } else {
            init.y--;
            field[i][j - 1] = Config.finishSign;
        }
        return init;
    }

    private static void addWave(int index) {
        int nextIndex = index + 1;
        for (int i = 0; i < field.length; i++) {
            for (int j = 0; j < field[i].length; j++) {
                if (field[i][j] == index) {
                    if (i < Config.WIDTH - 1 && field[i + 1][j] == 0) field[i + 1][j] = nextIndex;
                    if (i > 0 && field[i - 1][j] == 0) field[i - 1][j] = nextIndex;
                    if (j < Config.HEIGHT - 1 && field[i][j + 1] == 0) field[i][j + 1] = nextIndex;
                    if (j > 0 && field[i][j - 1] == 0) field[i][j - 1] = nextIndex;
                }
            }
        }

    }

    public static class W {
        public W(int x, int y, int val) {
            this.x = x;
            this.y = y;
            this.val = val;
        }

        int x;
        int y;
        int val;
    }

}
