import java.util.Scanner;

public class arr {
    static int findMissingNumber(int[] arr, int n) {
        // Calculate the sum of the first n natural numbers
        int totalSum = n * (n + 1) / 2;

        // Calculate the sum of elements present in the array
        int arraySum = 0;
        for (int i = 0; i < arr.length; i++) {
            arraySum += arr[i];
        }

        // The missing number is the difference between the total sum and the array sum
        return totalSum - arraySum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array (n): ");
        int n = sc.nextInt();

        // Create an array of size n-1 (since one number is missing)
        int[] arr = new int[n - 1];

        // Input the array elements
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n - 1; i++) {
            arr[i] = sc.nextInt();
        }

        // Find and print the missing number
        int missingNumber = findMissingNumber(arr, n);
        System.out.println("The missing number is: " + missingNumber);
    }
}
