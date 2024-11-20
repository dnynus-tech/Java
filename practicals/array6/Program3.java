/*Write a program to check the count of the user given key in your array, if
the count is more than 2 times replace the element with its cube, print the
array.*/

import java.util.*;

class CheckCount {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter array size : ");
        int size = sc.nextInt();
        int arr[] = new int[size];
        System.out.println("Enter array elements : ");
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("Enter key :");
        int key = sc.nextInt();
        int count = 0;
        for (int i = 0; i < size; i++) {
            if (key == arr[i]) {
                count++;
            }
        }
        if (count > 2) {
            for (int i = 0; i < size; i++) {
                if (key == arr[i]) {
                    arr[i] = arr[i] * arr[i] * arr[i];
                }
            }
        }
        System.out.println("Output array : ");
        for (int i = 0; i < size; i++) {
            System.out.print(arr[i] + "  ");
        }
        System.out.println();
        sc.close();
    }
}