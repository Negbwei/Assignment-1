public class palindrometest {
    import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

    public class PalindromeCheckerTest {

        @Test
        public void testIsPalindrome() {
            assertTrue(PalindromeChecker.isPalindrome("madam"), "madam should be a palindrome");
            assertTrue(PalindromeChecker.isPalindrome("racecar"), "racecar should be a palindrome");
            assertTrue(PalindromeChecker.isPalindrome("A man a plan a canal Panama"), "Spaces and case should not affect palindrome");
            assertFalse(PalindromeChecker.isPalindrome("hello"), "hello should not be a palindrome");
            assertFalse(PalindromeChecker.isPalindrome("java"), "java should not be a palindrome");
            assertTrue(PalindromeChecker.isPalindrome(""), "Empty string should be considered a palindrome");
            assertFalse(PalindromeChecker.isPalindrome("12345"), "12345 should not be a palindrome");
            assertTrue(PalindromeChecker.isPalindrome("madam "), "madam with a space at the end should still be a palindrome");
            assertTrue(PalindromeChecker.isPalindrome("Noon"), "Noon with different case should be a palindrome");
        }
    }

}
