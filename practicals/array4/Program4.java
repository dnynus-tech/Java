/*WAP to check whether the user given number occurs more than 2 times or equals 2
times.*/

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
		System.out.println("Enter the number to check : ");
		int num = sc.nextInt();
		int count = 0;

		for(int i = 0; i<size; i++){
		
			if(num == arr[i]){
				
				count++;
			}
		}
		if(count>2){
			System.out.println(num+" occured more than 2 times in the array.");
		}
		else{
			System.out.println(num+" occured 2 times in the array.");
		}
	}
}
