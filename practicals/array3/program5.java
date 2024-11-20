/*Q5
Write a program to convert all negative numbers into their squares in a given array. */
import java.util.Scanner;

class ConvertNegativeToSquares {

    static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int size = scanner.nextInt();
        int[] arr = new int[size];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < size; i++) {
            arr[i] = scanner.nextInt();
        }

        System.out.println("Modified array (negative -> square):");
        for (int i = 0; i < size; i++) {
            if (arr[i] < 0) {
                arr[i] = arr[i] * arr[i]; // Square the element if negative
            }
        }

        for (int num : arr) {
            System.out.print(num + " ");
        }
        scanner.close();
    }
}
