package Meeting_15_12_23.Exercises;

public class MultiplicationTable {

    public static void main(String[] args) {

        int[][] numbers = new int[9][9];

        for (int i = 0; i < numbers.length; i++) {

            for (int j = 0; j < numbers[i].length; j++) {

                numbers[i][j] = (i + 1) * (j + 1);
            }
        }

        for (int row = 0; row < numbers.length; row++) {

            for (int col = 0; col < numbers[row].length; col++) {

                System.out.print(numbers[row][col] + "\t");
            }
            System.out.print("\n");
        }
    }
}
