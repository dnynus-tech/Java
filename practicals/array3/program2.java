/*Write a program to find the first occurrences of a specific number in an array. Print the
index of a first occurrence. */
import java.util.Scanner;

class p2 {

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

        int firstOccurrence = -1; 
        for (int i = 0; i < size; i++) {
            if (arr[i] == target) {
                firstOccurrence = i;
                break; 
            }
        }

        if (firstOccurrence != -1) {
            System.out.println("First occurrence of " + target + " at index: " + firstOccurrence);
        } else {
            System.out.println(target + " not found in the array");
        }

       
    }
}
