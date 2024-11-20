/*WAP to find the difference between minimum element in an array and maximum
element in an array, take input from the user.*/

import java.util.*;

class ArrayDemo{

	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter array size: ");
		int size = sc.nextInt();
		int arr[] = new int[size];
		System.out.println("Enter array elements : ");
		for(int i = 0; i<size; i++){
			
			arr[i] = sc.nextInt();
		}
		int min = arr[0];
		for(int i = 0; i<size; i++){
			if(arr[i]<min){
				min = arr[i];
			}
		}
		int max = arr[0];
		for(int i = 0; i<size; i++){
			if(arr[i]>max){
				max = arr[i];
			}
		}
		int diff = max - min;
		System.out.print("The difference between minimum and maximum element is : "+diff);
		System.out.println();
	}
}
