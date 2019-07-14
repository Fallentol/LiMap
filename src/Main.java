public class Main {

    public static void main(String[] args) {
        int[][] f = Field.getField(Config.getObstacle(), Config.startX, Config.startY, Config.finishX, Config.finishY);
        System.out.println("INIT");
        Display.displayField(f);

        System.out.println("WITH WAVE");
        f = Field.createFieldWave();
        Display.displayField(f);


    }
}
