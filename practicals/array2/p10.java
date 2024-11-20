import java.util.Scanner;

class p10 {

   public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int size = scanner.nextInt();
        int[] arr = new int[size];
        System.out.println("Enter the elements of the array:");
        int max = Integer.MIN_VALUE; 
        for (int i = 0; i < size; i++) {
            arr[i] = scanner.nextInt();
            max = Math.max(max, arr[i]); 
        }
        System.out.println("Maximum element in the array: " + max);
        scanner.close();
    }
}
