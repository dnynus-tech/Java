/*WAP to find the second largest element in an array.*/

import java.util.*;

class Arraydemo{
	
	public static void main(String[] args){
		
		Scanner sc  = new Scanner(System.in);
		System.out.println("Enter array size : ");
		int size = sc.nextInt();
		int arr[] = new int[size];
		System.out.println("Enter array elements : ");
		for(int i = 0; i<size; i++){
			arr[i] = sc.nextInt();
		}
		int max1 = arr[0];
		for(int i = 0; i<size; i++){
			
			if(arr[i]>max1){
				max1 = arr[i];
			}
		}
		int max2 = arr[0];
		for(int i = 0; i<size; i++){
		
			if(arr[i]>=max2 && arr[i]<max1){
				max2 = arr[i];
			}
		}
		System.out.println("The second largest element in the array is :"+max2);
		
	}
}
