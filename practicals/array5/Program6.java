/*WAP to find the first prime number in an array.*/

import java.util.*;

class PrimeNumber{
	
	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter array size : ");
		int size = sc.nextInt();
		int arr[] = new int[size];
		System.out.println("Enter array elements : ");
		for(int i = 0; i<size; i++){
			arr[i] = sc.nextInt();
		}
		
		boolean foundPrime = false;
		for(int i = 0; i<size; i++){
			int count = 0;
			int num = arr[i];

			for(int j = 1; j<=num; j++){

				if(num % j == 0){
					count++;
				}
			}
			if(count == 2){
                System.out.println("First prime number in the array is "+ num);
                foundPrime = true;
                break;
            }
		}
		if(!foundPrime){
			System.out.println("No prime number found in an array!");
		}
	}

}
