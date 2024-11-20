/*Write a program to, where you have to take integer input from user and if
the integer is in the range of ASCII value of A to Z, while saving you have to
type cast the int to char. Print the array. */
public class IntToChar {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter an integer (ASCII value of A to Z): ");
        int userInput = scanner.nextInt();

        // ASCII value of 'A' and number of characters from 'A' to 'Z'
        final int asciiA = 65;
        final int numChars = 26;

        if (asciiA <= userInput && userInput <= (asciiA + numChars - 1)) {
            char charRepresentation = (char) userInput;
            System.out.println("Character representation: " + charRepresentation);
        } else {
            System.out.println("The integer is not in the ASCII range of A to Z.");
        }

        scanner.close();
    }
}
