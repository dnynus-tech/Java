/*8.WAP to take numbers from a user in a 2D array and print the sum of the secondary
diagonal of an array. */
import java.util.Scanner;

class TwoDArraySecondaryDiagonalSum {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the size of the square matrix: ");
        int size = scanner.nextInt();

        int[][] arr = new int[size][size];

        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                System.out.print("Row " + (i + 1) + ", Column " + (j + 1) + ": ");
                arr[i][j] = scanner.nextInt();
            }
        }

        System.out.println("The entered array:");
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                System.out.print(arr[i][j] + "\t");
            }
            System.out.println(); 
        }

        int sum = 0;
        for (int i = 0; i < size; i++) {
            sum += arr[i][size - 1 - i]; 
        }

        System.out.println("Sum of the secondary diagonal elements: " + sum);

        scanner.close();
    }
}
