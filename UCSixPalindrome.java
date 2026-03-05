/**
 * ============================================================
 * MAIN CLASS – UseCase6PalindromeCheckerApp
 * ============================================================
 *
 * Use Case 6: Queue + Stack Fairness Check
 *
 * Description:
 * This class demonstrates palindrome validation using
 * two different data structures:
 *
 * - Queue (FIFO - First In First Out)
 * - Stack (LIFO - Last In First Out)
 *
 * Characters are inserted into both structures and then
 * compared by removing from the front of the queue and
 * the top of the stack.
 *
 * If all characters match, the input string is confirmed
 * as a palindrome.
 *
 * This use case helps understand how FIFO and LIFO
 * behaviors can be combined for symmetric comparison.
 *
 * @author Neel Asher
 * @version 6.0
 */

import java.util.Stack;
import java.util.Queue;
import java.util.LinkedList;
public class UCSixPalindrome {

    /**
     * Application entry point for UC6.
     *
     * @param args Command-line arguments
     */
    public static void main(String[] args) {
		// Define the input string to validate
		String input = "level";

		// Create a Queue to store characters in FIFO order
		Queue<Character> queue = new LinkedList<>();

		// Create a Stack to store characters in LIFO order
		Stack<Character> stack = new Stack<>();

		// Insert each character into both queue and stack
		for (char c : input.toCharArray()) { 
			stack.push(c);
			queue.add(c);
		}

		// Flag to track palindrome status
		boolean isPalindrome = true;

		// Compare characters until the queue becomes empty
		while (!queue.isEmpty()) {
			if (!queue.remove().equals(stack.pop())) {
                isPalindrome = false;
                break;
            }
		}
		
		if (isPalindrome) {
            System.out.println(input + " is a palindrome.");
        } else {
            System.out.println(input + " is not a palindrome.");
        }
    }
}