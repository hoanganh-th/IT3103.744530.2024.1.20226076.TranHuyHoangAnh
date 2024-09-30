import java.util.Scanner;

public class MatrixAddition 
{
    public static void main(String[] args) 
    {
        Scanner inputScanner = new Scanner(System.in);

        System.out.print("Hoang Anh - 6076! Please, enter the number of rows in the matrices: ");
        int numRows = inputScanner.nextInt();
        System.out.print("Hoang Anh - 6076! Please, enter the number of columns in the matrices: ");
        int numColumns = inputScanner.nextInt();

        int[][] matrix1 = new int[numRows][numColumns];
        int[][] matrix2 = new int[numRows][numColumns];
        int[][] resultMatrix = new int[numRows][numColumns];

        System.out.println("Hoang Anh - 6076! Please, enter the elements of the first matrix:");
        for (int i = 0; i < numRows; i++) {
            for (int j = 0; j < numColumns; j++) {
                System.out.printf("matrix1[%d][%d] = ", i, j);
                matrix1[i][j] = inputScanner.nextInt();
            }
        }

        System.out.println("Hoang Anh - 6076! Please, enter the elements of the second matrix:");
        for (int i = 0; i < numRows; i++) {
            for (int j = 0; j < numColumns; j++) {
                System.out.printf("matrix2[%d][%d] = ", i, j);
                matrix2[i][j] = inputScanner.nextInt();
            }
        }

        for (int i = 0; i < numRows; i++) {
            for (int j = 0; j < numColumns; j++) {
                resultMatrix[i][j] = matrix1[i][j] + matrix2[i][j];
            }
        }

        System.out.println("Sum of the two matrices is:");
        for (int i = 0; i < numRows; i++) {
            for (int j = 0; j < numColumns; j++) {
                System.out.print(resultMatrix[i][j] + " ");
            }
            System.out.println();
        }

        inputScanner.close();
    }
}
