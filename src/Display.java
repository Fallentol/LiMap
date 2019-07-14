public class Display {

    public static void displayField(int[][] f) {
        System.out.println("____________________________________________________________________________________________________");
        for (int i = f.length - 1; i >= 0; i--) {
            for (int j = 0; j < f[0].length; j++) {
                System.out.printf("%4d", f[i][j]);
            }
            System.out.println();
        }
        System.out.println("‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾");
    }

    public static void finalDisplayField(int[][] f) {
        System.out.println("____________________________________________________________________________________________________");
        for (int i = f.length - 1; i >= 0; i--) {
            for (int j = 0; j < f[0].length; j++) {
                if (f[i][j] == 99) {
                    System.out.print("■" + "\t");
                } else if (f[i][j] == 88) {
                    System.out.print("⌾" + "\t");
                } else if (f[i][j] == 1) {
                    System.out.print("⨷" + "\t");
                } else {
                    System.out.print(" " + "\t");
                }
            }
            System.out.println();
        }
        System.out.println("‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾");
    }


}
