/*WAP to print the sum of odd and even numbers in an array.*/

import java.util.*;

class ArrayDemo{
	
	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter array size :");
		int size = sc.nextInt();
		int arr[] = new int[size];
		System.out.println("Enter array elements :");
		for(int i = 0; i<size; i++){
			arr[i] = sc.nextInt();
		}

		int evenSum = 0;
		int oddSum = 0;

		for(int i = 0; i<size; i++){
			
			if(arr[i]%2 == 0){
				evenSum += arr[i];		
			}
			else{
				oddSum += arr[i];
			}
		}

		System.out.println("Even sum = "+evenSum);
		System.out.println("Odd sum = "+oddSum);
	}
}
