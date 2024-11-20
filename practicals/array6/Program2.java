/*Write a program to find out the sum of all prime numbers in an array and
also print the count of prime numbers in an array.*/

import java.util.*;

class PrimeSum {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter array size : ");
        int size = sc.nextInt();
        int arr[] = new int[size];
        System.out.println("Enter array elements : ");
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }

        int sum = 0;
        int primeCount = 0;
        boolean isPrime = false;

        for (int i = 0; i < size; i++) {

            int num = arr[i];
            int count = 0;

            if (num <= 1) {
                isPrime = false;
            } else {
                for (int j = 1; j <= num; j++) {
                    if (num % j == 0) {
                        count++;
                    }
                }
            }

            if (count == 2) {
                isPrime = true;
            } else {
                isPrime = false;
            }

            if (isPrime) {
                primeCount++;
                sum += num;
            }
        }
        System.out.println(
                "Sum of prime numbers is " + sum + " and count of prime numbers in the given array is " + primeCount);
        sc.close();
    }
}