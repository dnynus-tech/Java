/*WAP to print the occurrence of a user given character.*/

import java.util.*;

class CountOccurence{
	
	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter array size");
		int size = sc.nextInt();

		char arr[] = new char[size];
		System.out.println("Enter array elements : ");
		sc.nextLine();

		for(int i = 0; i<size; i++){
			
			arr[i] = sc.nextLine().charAt(0);
		}
		System.out.println("Enter character to check : ");
		char ch = sc.nextLine().charAt(0);
		int count = 0;
		for(int i = 0; i<size-1; i++){
			
			if(ch == arr[i]){
				
				count++;
			}
		}
		System.out.println(ch+" occured "+count+ " times");

	}
}
