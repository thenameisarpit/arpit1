import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of rows: ");
        int numRows = scanner.nextInt();

        System.out.print("Enter the number of columns: ");
        int numCols = scanner.nextInt();

        int[][] twoDArray = new int[numRows][numCols];

        System.out.println("Enter the elements of the 2D array:");

        // Input elements into the 2D array
        for (int i = 0; i < numRows; i++) {
            for (int j = 0; j < numCols; j++) {
                System.out.print("Enter element at row " + (i + 1) + ", column " + (j + 1) + ": ");
                twoDArray[i][j] = scanner.nextInt();
            }
        }

        int sum = 0;

        for (int i = 0; i < numRows; i++) {
            for (int j = 0; j < numCols; j++) {
                sum += twoDArray[i][j];
            }
        }

        System.out.println("Sum of the 2D array: " + sum);
    }
}
