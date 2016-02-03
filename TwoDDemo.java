/**
 * Created by theartiste on 2/3/16.
 */
public class TwoDDemo {
    private int[][] values;

    public TwoDDemo(int row, int column) {
        values = new int[row][column];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                values[i][j] = 4;
            }
        }
    }

    public void display() {
        for (int[] array : values) {
            for (int element : array) {
                System.out.print(element + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        TwoDDemo one = new TwoDDemo(2, 2);
        one.display();

    }
}
