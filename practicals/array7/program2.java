/*2.WAP to take numbers from a user in a 2D array and print the sum of the array. */
import java.util.Scanner;

class TwoDArraySum {

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

        
        System.out.println("The entered array:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(arr[i][j] + "\t");
            }
            System.out.println(); 
        }

        
        int sum = 0;
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                sum += arr[i][j];
            }
        }
        System.out.println("The sum of all elements: " + sum);

        scanner.close();
    }
}
