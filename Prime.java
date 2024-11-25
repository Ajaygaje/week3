import java.util.Scanner;

public class Prime {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number to check if it's prime: ");
        int num = scanner.nextInt();

        if (isPrime(num)) {
            System.out.println(num + " is a prime number.");
        } else {
            System.out.println(num + " is not a prime number.");
        }

        scanner.close();
    }

    public static boolean isPrime(int num) {
        // Numbers less than or equal to 1 are not prime
        if (num <= 1) {
            return false;
        }

        // Check for divisors from 2 to the square root of the number
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false; // Not prime if divisible
            }
        }

        return true; // Prime if no divisors found
    }
}
