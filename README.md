# PalindromeCheckerApp
The objective of the PalindromeChecker App is to design and implement a console-based Java application that validates whether a given string is a palindrome under different conditions, while strengthening core programming fundamentals and data structure concepts.

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
