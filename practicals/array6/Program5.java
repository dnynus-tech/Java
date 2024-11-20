/*Take two different arrays where size of array may differ, you have to
create an array by combining both the arrays (you have to merge the arrays)*/

import java.util.*;

class MergeArray{

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter size for 1st array: ");
        int size1 = sc.nextInt();

        int arr1[] = new int[size1];
        System.out.println("Enter size for 1st array: ");

        int size2 = sc.nextInt();
        int arr2[] = new int[size2];

        int size = size1+size2;
        int arr3[] = new int[size];

        System.out.println("Enter elements for 1st array : ");
        for(int i = 0; i<size1; i++){
            arr1[i] = sc.nextInt();
        }

        System.out.println("Enter elements for 2nd array : ");
        for(int i = 0; i<size2; i++){
            arr2[i] = sc.nextInt();
        }

        for(int i = 0; i<size; i++){
            arr3[i] = 
        }

    }
}    