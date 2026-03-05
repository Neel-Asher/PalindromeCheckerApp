/**
 * ==========================================================
 * MAIN CLASS - UseCase11PalindromeCheckerApp
 * ==========================================================
 * * Use Case 11: Object-Oriented Palindrome Service
 * * Description:
 * This class demonstrates palindrome validation using
 * object-oriented design.
 * * The palindrome logic is encapsulated inside a
 * PalindromeService class.
 * * This improves:
 * - Reusability
 * - Readability
 * - Separation of concerns
 * * @author Neel Asher
 * @version 11.0
 */
public class UCElevenPalindrome {

    /**
     * Application entry point for UC11.
     * * @param args Command-line arguments
     */
    public static void main(String[] args) {
		String input = "level";

        PalindromeService service = new PalindromeService();

        boolean result = service.checkPalindrome(input);

        if (result) {
            System.out.println(input + " is a palindrome.");
        } else {
            System.out.println(input + " is not a palindrome.");
        }
	}
}

/**
 * Service class that contains palindrome logic.
 */
class PalindromeService { // 2 usages

    /**
     * Checks whether the input string is a palindrome.
     * * @param input Input string
     * @return true if palindrome, false otherwise
     */
    public boolean checkPalindrome(String input) {
		// Initialize pointers
		int start = 0;
		int end = input.length() - 1;

		// Compare characters moving inward
		while (start < end) {
			if (input.charAt(start) != input.charAt(end)) {
                return false;
            }

            start++;
            end--;
		}
		return true;
	}
}