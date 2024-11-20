/*Q10.
Write a program to print the product of prime elements in an array. */
import java.util.Scanner;

class ProductOfPrimes {

    static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int size = scanner.nextInt();
        int[] arr = new int[size];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < size; i++) {
            arr[i] = scanner.nextInt();
        }

        long product = 1; // Use long to handle larger potential products
        System.out.println("Prime numbers:");
        for (int num : arr) {
            if (isPrime(num)) {
                product *= num; // Multiply product by prime numbers
                System.out.print(num + " ");
            }
        }

        if (product == 1) {
            System.out.println("\nNo prime numbers found in the array. Product is 1.");
        } else {
            System.out.println("\nProduct of prime numbers: " + product);
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
