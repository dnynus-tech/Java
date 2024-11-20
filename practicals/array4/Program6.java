/*WAP to count the vowels and consonants in the given array(Take input from the user)*/

import java.util.*;

class Demo{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of the array: ");
        int size = sc.nextInt();
	sc.nextLine();

        char[] arr = new char[size];

        System.out.println("Enter the elements of the array:");
        for (int i = 0; i<arr.length; i++) {
            arr[i] = sc.nextLine().charAt(0);
        }

        int vowels = 0;
        int consonants = 0;

        for(int i = 0; i<size; i++) {
        	if(arr[i] == 'a' || arr[i] == 'e' || arr[i] == 'i' || arr[i] == 'o' || arr[i] == 'u') {
                    vowels++;
                }
		else{
                    consonants++;
                }
        }

        System.out.println("Number of vowels: " +vowels);
        System.out.println("Number of consonants: " +consonants);
    }
}

