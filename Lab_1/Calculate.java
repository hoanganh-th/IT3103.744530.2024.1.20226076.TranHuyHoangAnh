import java.util.Scanner;

public class Calculate {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Hoang Anh - 6076! Please enter the first number: ");
        double num1 = input.nextDouble();

        System.out.print("Hoang Anh - 6076! Please enter the second number: ");
        double num2 = input.nextDouble();

        double sum = num1 + num2;
        double difference = num1 - num2;
        double product = num1 * num2;
        double quotient = 0;

        if (num2 != 0) {
            quotient = num1 / num2;
        } else {
            System.out.println("Division by zero is not allowed.");
        }

        System.out.println("Sum: " + sum);
        System.out.println("Difference: " + difference);
        System.out.println("Product: " + product);

        if (num2 != 0) {
            System.out.println("Quotient: " + quotient);
        }
    }
}