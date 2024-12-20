import java.util.Scanner;

public class PrimeComposite {
    
    // Method to check if a number is prime
    static boolean isPrime(int num) {
        if (num <= 1) return false; // 0 and 1 are not prime
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) return false; // Found a divisor
        }
        return true; // No divisors found
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Input array of 5 numbers
        int[] numbers = new int[5];
        System.out.println("Enter 5 numbers:");
        for (int i = 0; i < 5; i++) {
            numbers[i] = sc.nextInt();
        }

        int primeCount = 0;
        int compositeCount = 0;
        int lastPrime = 0;
        int lastComposite = 0;

        // Determine the counts of primes and composites
        for (int num : numbers) {
            if (isPrime(num)) {
                primeCount++;
                lastPrime = num; // Store the last prime found
            } else {
                compositeCount++;
                lastComposite = num; // Store the last composite found
            }
        }

        // Identify the single number
        if (primeCount == 4 && compositeCount == 1) {
            System.out.println("The composite number is: " + lastComposite);
        } else if (compositeCount == 4 && primeCount == 1) {
            System.out.println("The prime number is: " + lastPrime);
        } else {
            System.out.println("Invalid input: The array must have exactly 4 primes and 1 composite, or vice versa.");
        }

        sc.close(); // Close the scanner
    }
}
