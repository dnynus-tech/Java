
/*Write a program to check whether the array contains element multiple of
user given int value, if yes then print it’s index. */
import java.util.Scanner;

class FindMultipleIndex {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the size of the array: ");
        int size = scanner.nextInt();

        int[] arr = new int[size];

        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < size; i++) {
            arr[i] = scanner.nextInt();
        }

        System.out.print("Enter the value to check multiples for: ");
        int divisor = scanner.nextInt();

        boolean found = false;
        for (int i = 0; i < size; i++) {
            if (arr[i] % divisor == 0) {
                found = true;
                System.out.println("Index of a multiple of " + divisor + ": " + i);
                break; // Exit the loop after finding the first multiple
            }
        }

        if (!found) {
            System.out.println("The array does not contain any multiples of " + divisor);
        }

        scanner.close();
    }
}
