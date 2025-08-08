package PatternsWithLoops;

public class Pattern5 {
    public static void main(String[] args) {
        for (int i = 0; i < 4;i++) {
            for (int j = 0; j < 2 * 4 - 1; j++) {
                if (j < i || j >= 2 * 4 - 1 - i) {
                    System.out.print(" ");
                } else {
                    System.out.print("*");
                }
            }
            System.out.println();
        }


    }
}
