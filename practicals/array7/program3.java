/*3.WAP to take numbers from a user in a 2D array and print the sum of each row in the
array. */

import java.util.Scanner;
class TwoDArrayRowSum {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of rows: ");
        int rows = scanner.nextInt();
        System.out.print("Enter the number of columns: ");
        int cols = scanner.nextInt();

        // Declare and initialize the 2D array
        int[][] arr = new int[rows][cols];

        // Get user input for each element
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print("Row " + (i + 1) + ", Column " + (j + 1) + ": ");
                arr[i][j] = scanner.nextInt();
            }
        }

        // Print the 2D array
        System.out.println("The entered array:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(arr[i][j] + "\t");
            }
            System.out.println(); // New line after each row
        }

        // Calculate and print the sum of each row
        for (int i = 0; i < rows; i++) {
            int rowSum = 0;
            for (int j = 0; j < cols; j++) {
                rowSum += arr[i][j];
            }
            System.out.println("Sum of row " + (i + 1) + ": " + rowSum);
        }

        scanner.close();
    }
}
