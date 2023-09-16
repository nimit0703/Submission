import java.util.Scanner;

public class Problem3 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        int arr[] = {1,29,35,47,15};
        int max = maxOfArray(arr);
        int min = minOfArray(arr);

        System.out.println("Maximum is : "+max);
        System.out.println("Minimum is : "+min);
    }

    /*
    * this will return max of array
    * if array is empty then throws an error
    * it's of order O(n)
    * */
    private static int maxOfArray(int[] arr) {
        if (arr == null || arr.length == 0) {
            throw new IllegalArgumentException("Array is empty or null.");
        }

        int max = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }

        return max;
    }
    /*
     * this will return max of array
     * if array is empty then throws an error
     * it's of order O(n)
     * */
    private static int minOfArray(int[] arr) {
        if (arr == null || arr.length == 0) {
            throw new IllegalArgumentException("Array is empty or null.");
        }

        int min = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }

        return min;
    }
}
