/*Q3
Write a program to find the number of occurrences of a specific number in an array. Print
the count of occurrences. */
import java.util.Scanner;

class p3 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the size of the array: ");
        int size = scanner.nextInt();
        int[] arr = new int[size];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < size; i++) {
            arr[i] = scanner.nextInt();
        }

        System.out.print("Enter the number to search for: ");
        int target = scanner.nextInt();

        int count = 0;
        for (int num : arr) {
            if (num == target) {
                count++;
            }
        }

        System.out.println("Number of occurrences of " + target + ": " + count);

       
    }
}
