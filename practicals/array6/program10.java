/*Q10. Write a program to find the third largest element in an array. */

class ThirdLargest {

    public static int findThirdLargest(int[] arr) {
        if (arr.length < 3) {
            throw new IllegalArgumentException("Array must contain at least 3 elements.");
        }

        int firstLargest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;
        int thirdLargest = Integer.MIN_VALUE;

        for (int num : arr) {
            if (num > firstLargest) {
                thirdLargest = secondLargest;
                secondLargest = firstLargest;
                firstLargest = num;
            } else if (num > secondLargest && num != firstLargest) {
                thirdLargest = secondLargest;
                secondLargest = num;
            } else if (num > thirdLargest && num != firstLargest && num != secondLargest) {
                thirdLargest = num;
            }
        }

        return thirdLargest;
    }

    public static void main(String[] args) {
        int[] arr = {12, 45, 67, 8, 34};
        int thirdLargest = findThirdLargest(arr);
        System.out.println("Third largest element: " + thirdLargest);
    }
}
