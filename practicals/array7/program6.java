/*6.WAP to take numbers from a user in a 2D array and print the elements which are
divisible by 3 in an array. */
import java.util.Scanner;
class TwoDArrayDivisibleBy3 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

       
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

        
        System.out.println("Elements divisible by 3:");
        boolean found = false;
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (arr[i][j] % 3 == 0) {
                    System.out.print(arr[i][j] + " ");
                    found = true;
                }
            }
        }

        if (!found) {
            System.out.println("No elements divisible by 3 found in the array.");
        }

        scanner.close();
    }
}
