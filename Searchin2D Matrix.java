// You are given an m x n integer matrix matrix with the following two properties:

// Each row is sorted in non-decreasing order.
// The first integer of each row is greater than the last integer of the previous row.
// Given an integer target, return true if target is in matrix or false otherwise.

// You must write a solution in O(log(m * n)) time complexity.

 

// Example 1:


// Input: matrix = [[1,3,5,7],[10,11,16,20],[23,30,34,60]], target = 3
// Output: true
// Example 2:


// Input: matrix = [[1,3,5,7],[10,11,16,20],[23,30,34,60]], target = 13
// Output: false
 

Constraints:

m == matrix.length
n == matrix[i].length
1 <= m, n <= 100
-104 <= matrix[i][j], target <= 104

import java.util.Scanner;

public class SearchMatrix {
    public static boolean searchMatrix(int[][] matrix, int target) {
        // Step 1: Get the number of rows and columns in the matrix
        int m = matrix.length;
        if (m == 0) return false; // If there are no rows, the matrix is empty
        int n = matrix[0].length;
        if (n == 0) return false; // If there are no columns, the matrix is empty

        // Step 2: Initialize pointers for binary search
        int left = 0;
        int right = m * n - 1; // Treat the matrix as a 1D array

        // Step 3: Perform binary search
        while (left <= right) {
            int mid = left + (right - left) / 2; // Calculate the middle index
            int midValue = matrix[mid / n][mid % n]; // Convert the 1D index to 2D coordinates

            if (midValue == target) {
                return true; // Found the target value
            } else if (midValue < target) {
                left = mid + 1; // Search in the right half
            } else {
                right = mid - 1; // Search in the left half
            }
        }

        return false; // Target not found in the matrix
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Step 4: Read the number of rows and columns in the matrix
        int m = scanner.nextInt();
        int n = scanner.nextInt();

        // Step 5: Initialize the matrix
        int[][] matrix = new int[m][n];

        // Step 6: Read matrix elements
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                matrix[i][j] = scanner.nextInt();
            }
        }

        // Step 7: Read the number of test cases
        int T = scanner.nextInt();

        // Step 8: Initialize an array to store target values
        int[] targets = new int[T];

        // Step 9: Read and search for each target
        for (int i = 0; i < T; i++) {
            targets[i] = scanner.nextInt();
        }

        // Step 10: Search for each target and print the result
        for (int i = 0; i < T; i++) {
            boolean found = searchMatrix(matrix, targets[i]);
            System.out.println(found ? "Yes" : "No");
        }
    }
}
