/*4.WAP to take numbers from a user in a 2D array and print the sum of odd rows in the
array. */
import java.util.Scanner;

class TwoDArrayOddRowSum {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get array dimensions from user
        System.out.print("Enter the number of rows: ");
        int rows = scanner.nextInt();
        System.out.print("Enter the number of columns: ");
        int cols = scanner.nextInt();

        
        int[][] arr = new int[rows][cols];

        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print("Row " + (i + 1) + ", Column " + (j + 1) + ": ");
                arr[i][j] = scanner.nextInt();
            }
        }

        System.out.println("The entered array:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(arr[i][j] + "\t");
            }
            System.out.println(); 
        }

       
        int totalSum = 0;
        for (int i = 0; i < rows; i++) {
            if (i % 2 != 0) { 
                int rowSum = 0;
                for (int j = 0; j < cols; j++) {
                    rowSum += arr[i][j];
                }
                totalSum += rowSum;
                System.out.println("Sum of odd row " + (i + 1) + ": " + rowSum);
            }
        }

        if (totalSum == 0) {
            System.out.println("There are no odd rows in the array.");
        } else {
            System.out.println("Total sum of elements in odd rows: " + totalSum);
        }

        scanner.close();
    }
}

