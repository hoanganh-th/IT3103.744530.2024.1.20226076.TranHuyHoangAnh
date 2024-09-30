import java.util.Scanner;

public class MonthDaysCalculator {
    public static void main(String[] args) {
        Scanner inputScanner = new Scanner(System.in);

        while (true) {
            System.out.print("Hoang Anh - 6076! Please, enter the month (e.g., January, Jan, Jan., or a number from 1 to 12): ");
            String userMonthInput = inputScanner.nextLine().trim();

            System.out.print("Hoang Anh - 6076! Please, enter the year (e.g., 1999): ");
            int inputYear;
            try {
                inputYear = Integer.parseInt(inputScanner.nextLine().trim());
                if (inputYear < 0) {
                    throw new NumberFormatException();
                }
            } catch (NumberFormatException e) {
                System.out.println("Hoang Anh - 6076! Invalid year entered. Please enter a non-negative year.");
                continue;
            }

            int daysInMonth = calculateDaysInMonth(userMonthInput, inputYear);
            if (daysInMonth != -1) {
                System.out.printf("The month %s of year %d has %d days.%n", userMonthInput, inputYear, daysInMonth);
                break;
            } else {
                System.out.println("Hoang Anh - 6076! Invalid month entered. Please enter the month again.");
            }
        }
        inputScanner.close();
    }

    public static int calculateDaysInMonth(String month, int year) {
        month = month.toLowerCase();

        int monthIndex;
        switch (month) {
            case "january":
            case "jan":
            case "jan.":
            case "1":
                monthIndex = 1;
                break;
            case "february":
            case "feb":
            case "feb.":
            case "2":
                monthIndex = 2;
                break;
            case "march":
            case "mar":
            case "mar.":
            case "3":
                monthIndex = 3;
                break;
            case "april":
            case "apr":
            case "apr.":
            case "4":
                monthIndex = 4;
                break;
            case "may":
            case "5":
                monthIndex = 5;
                break;
            case "june":
            case "jun":
            case "6":
                monthIndex = 6;
                break;
            case "july":
            case "jul":
            case "7":
                monthIndex = 7;
                break;
            case "august":
            case "aug":
            case "aug.":
            case "8":
                monthIndex = 8;
                break;
            case "september":
            case "sep":
            case "sept":
            case "sept.":
            case "9":
                monthIndex = 9;
                break;
            case "october":
            case "oct":
            case "oct.":
            case "10":
                monthIndex = 10;
                break;
            case "november":
            case "nov":
            case "nov.":
            case "11":
                monthIndex = 11;
                break;
            case "december":
            case "dec":
            case "dec.":
            case "12":
                monthIndex = 12;
                break;
            default:
                return -1; 
        }

        switch (monthIndex) {
            case 1: case 3: case 5: case 7: case 8: case 10: case 12:
                return 31;
            case 4: case 6: case 9: case 11:
                return 30;
            case 2:
                if (isLeapYear(year)) {
                    return 29;
                } else {
                    return 28;
                }
            default:
                return -1; 
        }
    }

    public static boolean isLeapYear(int year) {
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }
}
