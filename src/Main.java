public class Main {

    public static void main(String[] args) {
        int[][] f = Field.getField(Obstacle.getObstacle(), Config.startX, Config.startY, Config.finishX, Config.finishY);
        System.out.println("INIT");
        Display.displayField(f);

        System.out.println("WITH WAVE");
        f = Field.createFieldWave();
        Display.displayField(f);

        System.out.println("WITH PATH");
        f = Field.createPath();
        Display.displayField(f);

        System.out.println("FINAL VIEW");

        Display.finalDisplayField(f);
    }
}
