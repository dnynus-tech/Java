/*Q7
Check the size of the array and if array size is odd and greater than or equal to 5, then
print the odd elements, else print the even numbers. */
import java.util.Scanner;

class PrintOddOrEven {

    static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int size = scanner.nextInt();
        int[] arr = new int[size];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < size; i++) {
            arr[i] = scanner.nextInt();
        }

        if (size % 2 != 0 && size >= 5) { 
            System.out.println("Odd elements:");
            for (int i = 0; i < size; i++) {
                if (i % 2 != 0) {
                    System.out.print(arr[i] + " ");
                }
            }
        } else {
            System.out.println("Even elements:");
            for (int num : arr) {
                if (num % 2 == 0) {
                    System.out.print(num + " ");
                }
            }
        }

        scanner.close();
    }
}
