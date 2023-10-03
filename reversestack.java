// Write a program to reverse a stack using recursion. You are not allowed to use loop constructs like while, for.. etc., and you can only use the following functions on Stack S:
// isEmpty(S)
// push(S)
// pop(S)

// Input Format

// First Line contains 
// 1
// ≤
// n
// ≤
// 10
// 3
//  elements for a stack. Next Line contains the n elements of stack.
// Output Format

// Line containing elements of stack printed in reverse order.
// Example 1

// Input

// 5
// 1 2 3 4 5
// Output

// 5 4 3 2 1
// Example
// Input
// 5
// 1 2 3 4 5
// Output
// 5 4 3 2 1

/* package codechef; // don't place package name! */
import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
public class Main
{
    public static void main (String[] args) throws java.lang.Exception
    { Stack<Integer> stack = new Stack<>();

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

         
        for (int i = 0; i < n; i++) {
            int element = sc.nextInt();
            stack.push(element);
        }

        // Reverse the stack using recursion
        reverseStack(stack);

        // Print the reversed stack
       
        while (!stack.isEmpty()) {
            System.out.print(stack.pop()+" ");
        }
    }

    private static void reverseStack(Stack<Integer> stack) {
        if (stack.isEmpty()) {
            return;
        }

        int topElement = stack.pop();
        reverseStack(stack);
        stack.push(topElement);
    }
}
