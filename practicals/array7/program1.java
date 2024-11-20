/*1.WAP to take numbers from a user in a 2D array and print the array. */
class ThirdLargest {

    public static int findThirdLargest(int[] arr) {
        if (arr.length < 3) {
            throw new IllegalArgumentException("Array must contain at least 3 elements.");
        }

        Arrays.sort(arr);
        return arr[arr.length - 3];
    }

    public static void main(String[] args) {
        int[] arr = {12, 45, 67, 8, 34};
        int thirdLargest = findThirdLargest(arr);
        System.out.println("Third largest element: " + thirdLargest);
    }
}
