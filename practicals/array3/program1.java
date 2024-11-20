/*Write a program to add 15 in all elements of the array and print it. */
import java.util.Scanner;

class p1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int size = scanner.nextInt();
        int arr[] = new int[size];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < size; i++) {
            arr[i] = scanner.nextInt();
        }

        System.out.println("Modified array (after adding 15 to each element):");
        for (int i=0;i < size;i++) {
            System.out.print(arr[i] + 15 + " ");
        }
      
    }
}
