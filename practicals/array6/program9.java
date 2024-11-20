/*Write a program to count the palindrome elements in your array. */
class CountPalindromes {

    public static void main(String[] args) {
        String[] arr = {"madam", "noon", "hello", "level", "121", "racecar"};

        int count = countPalindromes(arr);
        System.out.println("Number of palindrome elements: " + count);
    }

    
    public static boolean isPalindrome(String str) {
        int len = str.length();
        for (int i = 0; i < len / 2; i++) {
            if (str.charAt(i) != str.charAt(len - 1 - i)) {
                return false;
            }
        }
        return true;
    }

    
    public static int countPalindromes(String[] arr) {
        int count = 0;
        for (String str : arr) {
            if (isPalindrome(str)) {
                count++;
            }
        }
        return count;
    }
}
