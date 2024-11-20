/*Write a program to print the characters in an array which comes before the user
given character.*/

import java.util.*;

class ArrayDemo{
	
	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter array size : ");
		int size = sc.nextInt();
		
		char arr[] = new char[size];
		System.out.println("Enter array elements : ");
		sc.nextLine();

		for(int i = 0; i<size; i++){
			
			arr[i] = sc.nextLine().charAt(0);
		}
		System.out.println("Enter character key : ");
		char ch = sc.nextLine().charAt(0);
		
		System.out.println("Array : ");
		for(int i = 0; i<size; i++){
			
			 if(ch!=arr[i]){
			 	System.out.println(arr[i]);
			 }
			 else{
			 	break;
			 }
		}
	}
}
