# PalindromeCheckerApp
The objective of the PalindromeChecker App is to design and implement a console-based Java application that validates whether a given string is a palindrome under different conditions, while strengthening core programming fundamentals and data structure concepts.

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
