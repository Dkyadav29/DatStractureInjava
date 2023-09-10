 import java.util.Scanner;

public class Main {
    public static void main (String[] args) throws java.lang.Exception {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt(); // Number of test cases

        while (t-- > 0) {
            int n = scanner.nextInt(); // Size of the array
            int[] a = new int[n]; // Array to store the numbers
            int count = 0; // Count of numbers with exactly 4 divisors
            long sum = 0; // Sum of divisors

            for (int i = 0; i < n; i++) {
                a[i] = scanner.nextInt();
                if (hasExactlyFourDivisors(a[i])) {
                    count++;
                    sum += getSumOfDivisors(a[i]);
                }
            }

            System.out.println(sum);
        }
    }

    // Function to check if a number has exactly 4 divisors
    private static boolean hasExactlyFourDivisors(int num) {
        int count = 0;
        for (int i = 1; i * i <= num; i++) {
            if (num % i == 0) {
                count++;
                if (i * i != num) {
                    count++;
                }
            }
        }
        return count == 4;
    }

    // Function to calculate the sum of divisors of a number
    private static long getSumOfDivisors(int num) {
        long sum = 0;
        for (int i = 1; i * i <= num; i++) {
            if (num % i == 0) {
                sum += i;
                if (i * i != num) {
                    sum += num / i;
                }
            }
        }
        return sum;
    }
}
