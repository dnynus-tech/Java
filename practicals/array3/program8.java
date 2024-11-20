/*Q8.
Print the composite numbers in an array. */
import java.util.Scanner;

class PrintCompositeNumbers {

    static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int size = scanner.nextInt();
        int[] arr = new int[size];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < size; i++) {
            arr[i] = scanner.nextInt();
        }

        System.out.println("Composite numbers:");
        for (int num : arr) {
            if (isPrime(num)) {
                continue; // Skip prime numbers (including 1)
            }
            System.out.print(num + " ");
        }
        scanner.close();
    }

    static boolean isPrime(int num) {
        if (num <= 1) {
            return false; // 1 or less are not prime
        }
        for (int i = 2; i * i <= num; i++) { // Check for divisibility up to square root
            if (num % i == 0) {
                return false; // Divisible by a number other than 1 and itself, so not prime
            }
        }
        return true;
    }
}
