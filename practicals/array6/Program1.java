/*Write a program to check whether the given array is descending or not.*/

import java.util.*;

class ArrayDemo {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter array size :");
        int size = sc.nextInt();
        int arr[] = new int[size];
        System.out.println("Enter array elements :");
        for (int i = 0; i < size; i++) {

            arr[i] = sc.nextInt();
        }
        int flag = 0;
        for (int i = 0; i < size - 1; i++) {
            if (arr[i] > arr[i + 1]) {
                flag = 1;
            } else {
                flag = 0;
                break;
            }
        }
        if (flag == 1) {
            System.out.println("Given array is in descending order");
        } else {
            System.out.println("Array is not in descending order");
        }
        sc.close();
    }

}