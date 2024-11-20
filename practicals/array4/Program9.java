/*WAP to replace the elements with #, which are not in the range of ‘a to z’.*/

import java.util.*;

class ReplaceElements{
	
	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter array size : ");
		int size = sc.nextInt();
		sc.nextLine();
		char arr[] = new char[size];
	
		System.out.println("Enter array elements : ");
		for(int i = 0; i<size; i++){
			
			arr[i] = sc.nextLine().charAt(0);
		}
		for(int i = 0; i<size; i++){
			
			if(!(arr[i]>='a' && arr[i]<='z')){
				
				arr[i] = '#';
			}
		}
		System.out.println("Replaced Elements : ");
		for(int i = 0; i<size; i++){
			
			System.out.println(arr[i]);
		}
	}
}
