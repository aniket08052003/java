import java.util.Scanner;

public class BinaryCount {

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

        int count = 0;

        // Convert each number to binary and check for '1'
        for (int num : arr) {
            String binaryForm = Integer.toBinaryString(num);
            if (binaryForm.contains("1")) {
                count++;
            }
        }

        // Print the result
        System.out.println("Count of numbers with binary representation containing '1': " + count);

        sc.close(); // Close the scanner
    }
}
