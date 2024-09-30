import java.util.Scanner;

public class Equation {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Hoang Anh - 6076! Please, choose equation type:");
        System.out.println("1. Linear equation");
        System.out.println("2. System of linear equations");
        System.out.println("3. Quadratic equation");

        int choice = sc.nextInt();

        switch (choice) {
            case 1:
                solveLinearEquation(sc);
                break;
            case 2:
                solveSystemOfLinearEquations(sc);
                break;
            case 3:
                solveQuadraticEquation(sc);
                break;
            default:
                System.out.println("Invalid choice.");
        }

        sc.close();
    }

    private static void solveLinearEquation(Scanner sc) {
        System.out.print("Enter coefficient a: ");
        double a = sc.nextDouble();
        System.out.print("Enter coefficient b: ");
        double b = sc.nextDouble();

        if (a == 0) {
            System.out.println("Invalid equation, 'a' cannot be zero.");
        } else {
            double x = -b / a;
            System.out.println("Solution: x = " + x);
        }
    }

    private static void solveSystemOfLinearEquations(Scanner sc) {
        System.out.print("Enter a11: ");
        double a11 = sc.nextDouble();
        System.out.print("Enter a12: ");
        double a12 = sc.nextDouble();
        System.out.print("Enter a21: ");
        double a21 = sc.nextDouble();
        System.out.print("Enter a22: ");
        double a22 = sc.nextDouble();
        System.out.print("Enter b1: ");
        double b1 = sc.nextDouble();
        System.out.print("Enter b2: ");
        double b2 = sc.nextDouble();

        double D = a11 * a22 - a21 * a12;
        double D1 = b1 * a22 - b2 * a12;
        double D2 = a11 * b2 - a21 * b1;

        if (D == 0) {
            if (D1 == 0 && D2 == 0) {
                System.out.println("The system has infinitely many solutions.");
            } else {
                System.out.println("The system has no solution.");
            }
        } else {
            double x1 = D1 / D;
            double x2 = D2 / D;
            System.out.println("Solution: x1 = " + x1 + ", x2 = " + x2);
        }
    }

    private static void solveQuadraticEquation(Scanner sc) {
        System.out.print("Enter coefficient a: ");
        double a = sc.nextDouble();
        System.out.print("Enter coefficient b: ");
        double b = sc.nextDouble();
        System.out.print("Enter coefficient c: ");
        double c = sc.nextDouble();

        if (a == 0) {
            System.out.println("Invalid equation, 'a' cannot be zero. Try again.");
        } else {
            double discriminant = b * b - 4 * a * c;

            if (discriminant > 0) {
                double root1 = (-b + Math.sqrt(discriminant)) / (2 * a);
                double root2 = (-b - Math.sqrt(discriminant)) / (2 * a);
                System.out.println("Two distinct real roots: x1 = " + root1 + ", x2 = " + root2);
            } else if (discriminant == 0) {
                double root = -b / (2 * a);
                System.out.println("Double root: x = " + root);
            } else {
                System.out.println("No real roots (complex roots).");
            }
        }
    }
}
