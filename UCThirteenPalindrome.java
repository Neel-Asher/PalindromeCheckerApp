/**
 * ==========================================================
 * MAIN CLASS - UseCase13PalindromeCheckerApp
 * ==========================================================
 *
 * Use Case 13: Performance Comparison
 *
 * Description:
 * This class measures and compares the execution
 * performance of palindrome validation algorithms.
 *
 * At this stage, the application:
 * - Uses a palindrome strategy implementation
 * - Captures execution start and end time
 * - Calculates total execution duration
 * - Displays benchmarking results
 *
 * This use case focuses purely on performance
 * measurement and algorithm comparison.
 *
 * The goal is to introduce benchmarking concepts.
 *
 * @author Neel Asher
 * @version 13.0
 */
 
import java.util.Stack;
public class UCThirteenPalindrome {

    /**
     * Application entry point for UC13.
     *
     * @param args Command-line arguments
     */
    public static void main(String[] args) {

        String input = "level";

        PalindromeStrategy strategy = new StackStrategy();

        long startTime = System.nanoTime();

        boolean result = strategy.check(input);

        long endTime = System.nanoTime();

        long duration = endTime - startTime;

        if (result) {
            System.out.println(input + " is a palindrome.");
        } else {
            System.out.println(input + " is not a palindrome.");
        }

        System.out.println("Execution Time (nanoseconds): " + duration);
    }
	
interface PalindromeStrategy {
	boolean check(String input);
}

static class StackStrategy implements PalindromeStrategy {

	public boolean check(String input) {

		java.util.Stack<Character> stack = new java.util.Stack<>();

		for (char c : input.toCharArray()) stack.push(c);

		for (char c : input.toCharArray()) if (c!=stack.pop()) return false;

		return true;
	}
}
}