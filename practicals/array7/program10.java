/*10.WAP to take numbers from a user in a 2D array and print the corner elements in an
array . */
import java.util.Scanner;

class TwoDArrayCornerElements {

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

        
        System.out.println("Corner elements:");
        System.out.println("Top-left: " + arr[0][0]);
        System.out.println("Top-right: " + arr[0][cols - 1]);
        System.out.println("Bottom-left: " + arr[rows - 1][0]);
        System.out.println("Bottom-right: " + arr[rows - 1][cols - 1]);

        scanner.close();
    }
}
