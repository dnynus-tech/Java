/*WAP to check the first duplicate element in an array and return its index.*/

import java.util.*;

class DuplicateEle{
	
	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter array size :");
		int size = sc.nextInt();
		int arr[] = new int[size];
		System.out.println("Enter array elements :");
		for(int i = 0; i<size; i++){
			
			arr[i] = sc.nextInt();
		}
		
		int duplicateIndex = -1;
		for(int i = 0; i<size; i++){
			for(int j = i+1; j<size; j++){
				
				if(arr[i] == arr[j]){
					
					duplicateIndex = j;
					break;					
				}
			}
			if(duplicateIndex != -1){
				
				break;
			}

		}
		if(duplicateIndex != -1){
			System.out.println("First duplicate element in an array is at index "+duplicateIndex);
		}
		else{
			System.out.println("No duplicate elements in an array");
		}	
	}
}
