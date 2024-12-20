import java.util.Scanner;

public class SubarrayLCM {

    // Method to compute GCD
    static int gcd(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    // Method to compute LCM
    static int lcm(int a, int b) {
        return (a / gcd(a, b)) * b;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input array size
        System.out.print("Enter the size of the array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];

        // Input array elements
        System.out.println("Enter " + n + " integers:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // Print the LCM of each contiguous subarray
        System.out.println("LCM of each contiguous subarray:");

        // Calculate LCM for each contiguous subarray
        for (int i = 0; i < n; i++) {
            int currentLCM = arr[i]; // Start with the current element

            // Print LCM for subarray starting at index i
            System.out.print(currentLCM + " "); // LCM of subarray [arr[i]] is arr[i]

            // Calculate LCM for subarrays starting at index i
            for (int j = i + 1; j < n; j++) {
                currentLCM = lcm(currentLCM, arr[j]);
                System.out.print(currentLCM + " "); // Store LCM for subarray [arr[i], arr[j]]
            }
        }

        sc.close(); // Close the scanner
    }
}
