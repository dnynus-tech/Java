/*Q10. WAP to print the factorial of each element in an array. */
import java.util.Scanner;

class FactorialArray {

    static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int size = scanner.nextInt();

        if (size < 0) {
            System.out.println("Invalid array size. Please enter a non-negative integer.");
            return;
        }

        int[] arr = new int[size];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < size; i++) {
            arr[i] = scanner.nextInt();

            if (arr[i] < 0) {
                System.out.println("Factorial is not defined for negative numbers. Element at index " + i + " will be skipped.");
            }
        }

        System.out.println("Factorials of the array elements:");
        for (int num : arr) {
            if (num < 0) {
                continue; 
            }
            System.out.println(num + "! = " + calculateFactorial(num));
        }
        scanner.close();
    }

    static long calculateFactorial(int num) { 
        long factorial = 1;
        for (int i = 1; i <= num; i++) {
            factorial *= i;
        }
        return factorial;
    }
}
