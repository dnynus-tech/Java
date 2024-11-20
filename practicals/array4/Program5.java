/*WAP to reverse the array(take input from the user).*/

import java.util.*;

class Arraydemo{

	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter array size : ");
		int size = sc.nextInt();
		int arr[] = new int[size];
		System.out.println("Enter array elements : ");
		for(int i = 0; i<size; i++){
			arr[i] = sc.nextInt();
		}
		//Reverse array logic:
		for(int i = 0; i<size/2; i++){
			int temp = arr[i];
			arr[i] = arr[size-1-i];
			arr[size-1-i] = temp;
		}
		System.out.println("Reversed array : ");
		for(int i = 0; i<size; i++){
			System.out.println(arr[i]);
		}
	}
}
