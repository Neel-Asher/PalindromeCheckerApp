# PalindromeCheckerApp
The objective of the PalindromeChecker App is to design and implement a console-based Java application that validates whether a given string is a palindrome under different conditions, while strengthening core programming fundamentals and data structure concepts.

## UC1: Application Entry & Welcome Message

- Project: Palindrome Checker Management System
- Use Case: UC1 – Application Entry & Welcome Message
- Purpose: Establishes the startup flow of the application
- Main Class: UCOnePalindrome
- Entry Point: main(String[] args)
- Functionality: Prints a welcome message to the console
- Version Displayed: 1.0
- Status: System initialization only (no palindrome logic)
- Output: Console-based messages
- Author: Neel Asher

## UC2: Print a Hardcoded Palindrome Result

- Project: Palindrome Checker Management System
- Use Case: UC2 – Hardcoded Palindrome Validation
- Purpose: Demonstrates basic palindrome checking logic
- Main Class: UseCase2PalindromeCheckerApp
- Entry Point: main(String[] args)
- Input: Hardcoded string value
- Logic Used: Character comparison from both ends
- Output: Displays palindrome validation result
- Data Structures: None (basic string operations only)
- Author: Neel Asher

## UC3: Palindrome Check Using String Reverse

- Project: Palindrome Checker Management System
- Use Case: UC3 – Reverse String Based Palindrome Check
- Purpose: Validates palindromes using string reversal
- Main Class: UseCase3PalindromeCheckerApp
- Entry Point: main(String[] args)
- Input: Hardcoded string value
- Logic Used: Reverse string and compare with original
- Output: Displays palindrome validation result
- Approach: Transformation-based validation
- Author: Neel Asher

## UC4: Character Array-Based Palindrome Check

- Project: Palindrome Checker Management System
- Use Case: UC4 – Character Array Based Validation
- Purpose: Efficiently validates palindromes using two pointers
- Main Class: UseCase4PalindromeCheckerApp
- Entry Point: main(String[] args)
- Input: Hardcoded string value
- Logic Used: Two-pointer character comparison
- Data Structure: Character array
- Memory Usage: Optimized (no extra string creation)
- Author: Neel Asher

## UC5: Stack Based Palindrome Checker

- This program checks whether a given string is a palindrome.
- It uses the Stack data structure from java.util.
- The stack follows the LIFO (Last In, First Out) principle.
- Each character of the input string is pushed onto the stack.
- Characters are then popped from the stack in reverse order.
- The popped characters are compared with the original string.
- If all characters match, the string is a palindrome.
- If any character does not match, the string is not a palindrome.
- This program demonstrates using a stack to reverse and validate strings.

## UC6: Queue + Stack based Palindrome Check

+ This program checks whether a given string is a palindrome.
+ It uses two data structures: Queue and Stack.
+ The Queue follows the FIFO (First In First Out) principle.
+ The Stack follows the LIFO (Last In First Out) principle.
+ Each character of the input string is inserted into both structures.
+ Characters are removed from the front of the queue and the top of the stack.
+ The removed characters are compared for equality.
+ If all characters match, the string is identified as a palindrome.
+ This program demonstrates how FIFO and LIFO structures can be combined for symmetric validation.

## UC7: Deque Based Optimized Palindrome Checker

+ This program checks whether a given string is a palindrome.
+ It uses the Deque (Double Ended Queue) data structure.
+ A deque allows insertion and removal from both the front and rear.
+ Each character of the input string is added to the deque.
+ Characters are compared by removing elements from both ends.
+ The methods removeFirst() and removeLast() are used for comparison.
+ If the characters from both ends match, the process continues.
+ If any pair of characters does not match, the string is not a palindrome.
+ This approach demonstrates efficient bidirectional traversal using a deque.

## UC8: Linked List Based Palindrome Checker

+ This program checks whether a given string is a palindrome.
+ It uses the LinkedList data structure from the Java Collections Framework.
+ A LinkedList allows efficient insertion and deletion from both ends.
+ Each character of the input string is added to the linked list.
+ Characters are compared by removing elements from the front and rear.
+ The methods removeFirst() and removeLast() are used for comparison.
+ If the characters from both ends match, the process continues.
+ If any pair of characters does not match, the string is not a palindrome.
+ This demonstrates how LinkedList supports double-ended operations for symmetric validation.

## UC9: Recursive Palindrome Checker

+ This program checks whether a given string is a palindrome.
+ It uses the concept of recursion to perform the validation.
+ Characters from the start and end positions are compared.
+ If the characters match, the function calls itself for the next inner pair.
+ The start index moves forward, and the end index moves backward.
+ If any pair of characters does not match, the string is not a palindrome.
+ The recursion stops when the start index becomes greater than or equal to the end index.
+ This condition confirms that all character pairs have been successfully checked.
+ This program demonstrates divide-and-conquer logic using recursive function calls.

## UC10: Normalized Palindrome Validation

+ This program checks whether a given string is a palindrome after preprocessing.
+ The input string may contain spaces, punctuation, or mixed case letters.
+ The program first normalizes the string before performing the check.
+ Normalization removes all non-alphanumeric characters.
+ The string is then converted to lowercase for consistent comparison.
+ Characters are compared from the beginning and end of the normalized string.
+ If any pair of characters does not match, the string is not a palindrome.
+ If all symmetric characters match, the string is confirmed as a palindrome.
+ This demonstrates how data preprocessing improves logical validation of strings.

## UC11: Object-Oriented Palindrome Service

+ This program checks whether a given string is a palindrome using object-oriented design.
+ The palindrome checking logic is placed inside a separate PalindromeService class.
+ The main class creates an object of the service class to perform the validation.
+ This approach demonstrates the concept of encapsulation.
+ Characters of the string are compared from the start and end positions.
+ The comparison continues while the start index is less than the end index.
+ If any pair of characters does not match, the method returns false.
+ If all characters match, the method returns true, confirming a palindrome.
+ This design improves code reusability, readability, and separation of concerns.

## UC12: Strategy Pattern for Palindrome Algorithms

+ This program demonstrates palindrome validation using the Strategy Design Pattern.
+ A common interface called PalindromeStrategy defines the contract for all algorithms.
+ Different palindrome algorithms can implement this interface.
+ In this example, a Stack-based strategy is implemented.
+ The stack uses LIFO (Last In First Out) behavior to reverse the characters.
+ Each character of the string is pushed onto the stack.
+ Characters are then compared with the original string by popping from the stack.
+ The main class selects and executes the strategy at runtime.
+ This design demonstrates algorithm interchangeability and extensible software design.

## UC13: Performance Comparison of Palindrome Algorithms

+ This program measures the execution performance of a palindrome validation algorithm.
+ It reuses the Strategy Pattern implementation from the previous use case.
+ A palindrome strategy is selected and executed at runtime.
+ The program records the start time before executing the algorithm.
+ After the palindrome check completes, the end time is recorded.
+ The total execution duration is calculated using System.nanoTime().
+ The result of the palindrome validation is displayed to the user.
+ The program then prints the execution time in nanoseconds.
+ This demonstrates the concept of basic benchmarking and performance measurement in Java.
