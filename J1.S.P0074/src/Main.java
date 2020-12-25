
import java.util.Scanner;

/**
 *
 * @author Minh Thanh
 */
public class Main {

    private final Scanner sc = new Scanner(System.in);

    public void menu() {
        System.out.println("===========Calculator program============");
        System.out.println("1. Addition Matrix");
        System.out.println("2. Subtraction Matrix");
        System.out.println("3. Multiplication Matrix");
        System.out.println("4. Quit");
        System.out.print("Your choice: ");
    }

    public int checkInputInt(int min, int max) {
        while (true) {
            try {
                int result = Integer.parseInt(sc.nextLine().trim());
                if (result < min || result > max) {
                    System.out.println("Please input in range " + min + "-" + max);
                    System.out.print("Enter again: ");
                } else {
                    return result;
                }
            } catch (NumberFormatException e) {
                System.out.println("Please input a digit");
                System.out.print("Enter again: ");
            }
        }
    }

    public int[][] inputMatrix(int n, int row, int col) {
        int[][] matrix = new int[row][col];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.print("Enter Matrix" + n + "[" + (i + 1) + "][" + (j + 1) + "]: ");
                matrix[i][j] = checkInputInt(Integer.MIN_VALUE, Integer.MAX_VALUE);
            }
        }
        return matrix;
    }

    public void displayMatrix(int[][] matrix) {
        for (int[] matrix1 : matrix) {
            for (int j = 0; j < matrix[0].length; j++) {
                System.out.print("[" + matrix1[j] + "]");
            }
            System.out.println("");
        }
    }

    public void addMatrix(int[][] matrix1, int[][] matrix2) {
        int[][] result = new int[matrix1.length][matrix2[0].length];

        for (int i = 0; i < matrix1.length; i++) {
            for (int j = 0; j < matrix1[0].length; j++) {
                result[i][j] = matrix1[i][j] + matrix2[i][j];
            }
        }

        System.out.println("------ Result ------");
        displayMatrix(matrix1);
        System.out.println("+");
        displayMatrix(matrix2);
        System.out.println("=");
        displayMatrix(result);
    }

    public void subMatrix(int[][] matrix1, int[][] matrix2) {
        int[][] result = new int[matrix1.length][matrix1[0].length];

        for (int i = 0; i < matrix1.length; i++) {
            for (int j = 0; j < matrix1[0].length; j++) {
                result[i][j] = matrix1[i][j] - matrix2[i][j];
            }
        }

        System.out.println("------ Result ------");
        displayMatrix(matrix1);
        System.out.println("-");
        displayMatrix(matrix2);
        System.out.println("=");
        displayMatrix(result);
    }

    public void mulMatrix(int[][] matrix1, int[][] matrix2) {
        int[][] result = new int[matrix1.length][matrix2[0].length];

        for (int i = 0; i < matrix1.length; i++) {

            for (int j = 0; j < matrix2[0].length; j++) {

                for (int k = 0; k < matrix1[0].length; k++) {

                    result[i][j] = result[i][j] + matrix1[i][k] * matrix2[k][j];
                }
            }
        }

        System.out.println("------ Result ------");
        displayMatrix(matrix1);
        System.out.println("*");
        displayMatrix(matrix2);
        System.out.println("=");
        displayMatrix(result);
    }

    public void matrixHandling(int choice) {

        System.out.print("Enter row matrix 1: ");
        int row1 = checkInputInt(1, Integer.MAX_VALUE);
        System.out.print("Enter column matrix 1: ");
        int col1 = checkInputInt(1, Integer.MAX_VALUE);
        int[][] matrix1 = inputMatrix(1, row1, col1);

        int row2 = 0;
        int col2 = 0;
        while (true) {
            System.out.print("Enter row matrix 2: ");
            row2 = checkInputInt(1, Integer.MAX_VALUE);

            if (choice != 3) {
                if (row2 != row1) {
                    System.out.println("Two matrix must same size!");
                } else {
                    break;
                }
            } else {
                if (row2 != col1) {
                    System.out.println("Matrix2 rows number must equal Matrix1 cols number!");
                } else {
                    break;
                }
            }
        }
        while (true) {
            System.out.print("Enter column matrix 2: ");
            col2 = checkInputInt(1, Integer.MAX_VALUE);

            if (choice != 3) {
                if (col2 != col1) {
                    System.out.println("Two matrix must same size!");
                } else {
                    break;
                }
            } else {
                break;
            }
        }
        int[][] matrix2 = inputMatrix(2, row2, col2);

        switch (choice) {
            case 1:
                addMatrix(matrix1, matrix2);
                break;
            case 2:
                subMatrix(matrix1, matrix2);
                break;
            case 3:
                mulMatrix(matrix1, matrix2);
                break;
        }
    }

    public static void main(String[] args) {
        Main m = new Main();
        while (true) {
            m.menu();
            int choice = m.checkInputInt(1, 4);
            switch (choice) {
                case 1:
                    System.out.println("------Addition------");
                    break;
                case 2:
                    System.out.println("------Subtraction------");
                    break;
                case 3:
                    System.out.println("------Multiplication------");
                    break;
                case 4:
                    System.exit(0);
            }
            m.matrixHandling(choice);
        }
    }
}
