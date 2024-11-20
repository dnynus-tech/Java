/*WAP to find the composite numbers in an array.*/

import java.util.*;

class CompositeNo{

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter array size : ");
        int size = sc.nextInt();
        int arr[] = new int[size];
        System.out.println("Enter array elements :");
        for(int i = 0; i<size; i++){
            arr[i] = sc.nextInt();
        }
        boolean compositeFound = false;
        for(int i = 0; i<size; i++){
            int num = arr[i];
            int count = 0;
            for(int j = 1; j<=num; j++){
                if(num % j == 0){
                    count++;
                }
            }
            if(count > 2){
                compositeFound = true;
                System.out.print(num);
                if(i<size-2){
                    System.out.print(", ");
                }
            }
        }
        System.out.println();
        
        if(!compositeFound){
            System.out.println("No composite number found in an array!");
        }
    }
}