/*7.WAP to take numbers from a user in a 2D array and print the product of the primary
diagonal of an array. */
import java.util.Scanner;
class TwoDArrayPrimaryDiagonalProduct {

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

        int product = 1;
        for (int i = 0; i < size; i++) {
            product *= arr[i][i]; 
        }

        System.out.println("Product of the primary diagonal elements: " + product);

        scanner.close();
    }
}
