import java.util.Scanner;

class p9 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int size = scanner.nextInt();
        int[] arr = new int[size];
        System.out.println("Enter the elements of the array:");
        int min = Integer.MAX_VALUE; 
        for (int i = 0; i < size; i++) {
            arr[i] = scanner.nextInt();
            min = Math.min(min, arr[i]);
        }
        System.out.println("Minimum element in the array: " + min);
        
    }
}
