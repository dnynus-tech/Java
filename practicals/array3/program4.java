/*Write a program to convert all even numbers into 0 and odd numbers into 1 in a given
array. */
import java.util.Scanner;

class p4 {

   public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int size = scanner.nextInt();
        int[] arr = new int[size];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < size; i++) {
            arr[i] = scanner.nextInt();
        }

        System.out.println("Modified array (even -> 0, odd -> 1):");
        for (int i = 0; i < size; i++) {
            arr[i] = arr[i] % 2;
        }

        for (int num : arr) {
            System.out.print(num + " ");
        }
        
    }
}
