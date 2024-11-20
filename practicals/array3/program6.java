/*Q6
Write a program to print all the consonants in an array. */
import java.util.Scanner;

class PrintConsonants {

    static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the size of the character array: ");
        int size = scanner.nextInt();
        char[] charArray = new char[size];
        System.out.println("Enter the characters of the array:");
        for (int i = 0; i < size; i++) {
            charArray[i] = Character.toUpperCase(scanner.next().charAt(0)); // Convert input to uppercase for case-insensitive check
        }

        System.out.println("Consonants:");
        for (char ch : charArray) {
            if (isConsonant(ch)) {
                System.out.print(ch + " ");
            }
        }
        scanner.close();
    }

    static boolean isConsonant(char ch) {
        return (ch >= 'A' && ch <= 'Z' && !"AEIOU".contains(String.valueOf(ch))); // Efficient check using String.contains()
    }
}
