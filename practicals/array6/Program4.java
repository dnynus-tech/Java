/*You have to take two different 1d arrays of the same size and print the
common elements from the arrays.*/

import java.util.*;

class OneDArray {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter array size : ");
        int size = sc.nextInt();
        int arr1[] = new int[size];
        int arr2[] = new int[size];

        System.out.println("Enter elements for 1st array : ");
        for (int i = 0; i < size; i++) {
            arr1[i] = sc.nextInt();
        }
        System.out.println("Enter elements for 2nd array : ");
        for (int i = 0; i < size; i++) {
            arr2[i] = sc.nextInt();
        }

        System.out.println("Common elements in the given array are : ");
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                if (arr1[i] == arr2[j]) {
                    System.out.print(arr1[i] + ", ");
                }
            }
        }
        System.out.println();
        sc.close();
    }
}