/*WAP to print the count of digits in elements of an array.*/

import java.util.*;

class DigitCount{
	
	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter array size :");
		int size = sc.nextInt();
		int arr[] = new int[size];
		System.out.println("Enter array elements :");
		for(int i = 0; i<size; i++){
			
			arr[i] = sc.nextInt();
		}
		for(int i = 0; i<size; i++){
		
			int count = countDigit(arr[i]);
			System.out.print(count);
			if(i<size-1){
				System.out.print(",");
			}
		}
		System.out.println();
	}

	public static int countDigit(int num){
			
		int count = 0;
		while(num!=0){
				
			num = num/10;
			count++;
		}
		return count;
	}

}
