import java.util.Scanner;

public class PrintTriangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Hoang Anh - 6076. Please, nter the height of the triangle (n): ");
        int n = scanner.nextInt();

        for (int i = 1; i <= n; i++) {
            for (int j = n - i; j > 0; j--) {
                System.out.print(" ");
            }
            for (int k = 1; k <= (2 * i - 1); k++) {
                System.out.print("*");
            } 
            System.out.println();
        }
        scanner.close();
    }
}