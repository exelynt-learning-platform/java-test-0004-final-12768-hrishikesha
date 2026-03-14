public class NumberPattern {
    public static void main(String[] args) {
        final int ROWS = 5;
        int num = 1;

        for (int row = 1; row <= ROWS; row++) {
            for (int col = 1; col <= row; col++) {
                System.out.print(num);
                if (col < row) {
                    System.out.print(" ");
                }
                num++;
            }
            System.out.println();
        }
    }
}
