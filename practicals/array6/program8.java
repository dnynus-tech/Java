/*Write a program to reverse the char array and print the alternate
elements of the array before and after reverse. */
class ReversePrintAlternate {

    public static void main(String[] args) {
        char[] charArray = {'h', 'e', 'l', 'l', 'o'};

        System.out.println("Original array:");
        printAlternateElements(charArray); 

        System.out.println("Reversed array (alternate elements):");
        reverseAndPrintAlternate(charArray); 
    }

    
    private static void printAlternateElements(char[] arr) {
        for (int i = 0; i < arr.length; i += 2) {
            System.out.print(arr[i]);
        }
        System.out.println(); 
    }

    
    private static void reverseAndPrintAlternate(char[] arr) {
       
        for (int i = 0; i < arr.length / 2; i++) {
            char temp = arr[i];
            arr[i] = arr[arr.length - 1 - i];
            arr[arr.length - 1 - i] = temp;
        }

        
        for (int i = 1; i < arr.length; i += 2) {
            System.out.print(arr[i]);
        }
        System.out.println(); 
    }
}
