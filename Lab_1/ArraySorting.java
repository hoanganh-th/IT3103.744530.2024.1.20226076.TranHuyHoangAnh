import java.util.Arrays;
import java.util.Scanner;

public class ArraySorting
{
    public static void main(String[] args) 
    {
        Scanner inputScanner = new Scanner(System.in);

        System.out.print("Hoang Anh - 6076! Please, enter the number of elements in the array: ");
        int elementCount = inputScanner.nextInt();

        int[] elementsArray = new int[elementCount];
        System.out.println("Please enter " + elementCount + " elements:");

        for (int i = 0; i < elementCount; i++) {
            System.out.print("Element " + (i + 1) + ": ");
            elementsArray[i] = inputScanner.nextInt();
        }

        System.out.println("Original Array: " + Arrays.toString(elementsArray));

        Arrays.sort(elementsArray);
        System.out.println("Sorted Array: " + Arrays.toString(elementsArray));

        int totalSum = 0;
        for (int num : elementsArray) {
            totalSum += num;
        }

        double averageValue = (double) totalSum / elementCount;

        System.out.println("Sum of array elements: " + totalSum);
        System.out.println("Average value of array elements: " + averageValue);

        inputScanner.close();
    }
}
