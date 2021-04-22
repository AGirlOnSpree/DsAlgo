/*
 * Problem :
 * Algorithm to find factorial of a given number n using recursion
 */

package Algorithms;

public class Factorial {
    public static void main(String[] args) {
        Factorial factorial = new Factorial();
        int n = 5;
        int result = factorial.factorial(n);
        System.out.println("Factorial of " + n + " is = " + result);
    }

    public int factorial(int n) {
        //base case (exit case)
        if (n <= 1) {
            return 1;
        }
        //recursive call
        return n * factorial(n - 1);
    }
}
