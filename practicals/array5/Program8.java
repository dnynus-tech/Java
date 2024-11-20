/*WAP to find the second minimum element in an array.*/ 

import java.util.*;

class SecMinEle{

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter array size : ");
        int size = sc.nextInt();
        int arr[] = new int[size];
        System.out.println("Enter array elements : ");
        for(int i = 0; i<size; i++){
            arr[i] = sc.nextInt();
        }

        int min1 = arr[0];

        for(int i = 0; i<size; i++){

            if(arr[i]<min1){
                min1 = arr[i];
            }
        }

        int min2 = arr[0];

        for(int i = 0; i<size; i++){

            if(arr[i]>min1 && arr[i]<min2){
                min2 = arr[i];
            }
        }
        System.out.println("Second minimum element in an array is : "+ min2);
    }
}