/*WAP to convert lowercase characters to Uppercase characters.(Take input from the user)*/

import java.util.*;
class ToUppercase{
	
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

		for(int i = 0; i<arr.length; i++){
			
			if(arr[i]>='a' && arr[i]<='z'){
				
				arr[i] = (char)(arr[i]-'a'+'A');
			}
		}
		System.out.println("Output : ");
		for(int i = 0; i<arr.length; i++){
			
			System.out.println(arr[i]);
		}
	}
}
