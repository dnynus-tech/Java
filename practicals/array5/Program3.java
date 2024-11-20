/*WAP to check if an array is a palindrome or not.*/

import java.util.*;

class PalindromeArray{
	
	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter array size : ");
		int size = sc.nextInt();
		int arr[] = new int[size];
		System.out.println("Enter array elements :");
		for(int i = 0; i<size; i++){
			
			arr[i] = sc.nextInt();
		}
		int flag = 0;
		for(int i = 0; i<size/2; i++){
			
			if(arr[i] == arr[size-1-i]){
				
				flag = 1;
			}
			else{
				flag = 0;
			}
		}
		if(flag == 1){
			
			System.out.println("Array is palindrome");
		}
		else{
			System.out.println("Array is not palindrome");
		}

	}
}
