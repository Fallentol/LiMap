public class Field {
    /**
     * Data container
     */
    public static int[][] field;

    public static void initField(Integer[][] obsticle) {
        field = new int[Config.WIDTH][Config.HEIGHT];
        for (int i = 0; i < field.length; i++) {

            for (int j = 0; j < field[i].length; j++) {

                field[i][j] = 0;

            }

        }
    }

}
