/*WAP to take a input from the user for size and elements of an array, 
  where you have to print the average of array elements(Array should be of Integers)*/

import java.util.*;

class ArrayAvg{
	
	public static void main(String[] args){
	
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter array size : ");
		int size = sc.nextInt();
		int arr[] = new int[size];
		System.out.println("Enter array elements : ");
		for(int i = 0; i<size; i++){
			arr[i] = sc.nextInt();
		}
		int sum = 0;
		for(int i = 0; i<size; i++){
			
			sum = sum+arr[i];
		}
		int avg = sum/size;
		System.out.print("Array element's average is : "+avg);
		System.out.println();
	}
}
