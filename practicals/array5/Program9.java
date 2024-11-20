/*WAP to take a number from the user and store each element in an array by increasing
the element by one.*/

import java.util.*;

class ArrayDemo{

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter array size : ");
        int size = sc.nextInt();
        int arr[] = new int[size];
        System.out.println("Enter array elements : ");
        for(int i = 0; i<size; i++){
            
            arr[i] = sc.nextInt()+1;
        }
        System.out.println("Array elements after adding 1 : ");

        for(int i = 0; i<size; i++){

            System.out.println(arr[i]);
        }
        
    }
}