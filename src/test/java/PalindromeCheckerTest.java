import org.example.PalindromeChecker;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class PalindromeCheckerTest {
    @Test
    public void testIsPalindromeTrue() {
        assertTrue(PalindromeChecker.isPalindrome("level"));
        assertTrue(PalindromeChecker.isPalindrome("civic"));
        assertTrue(PalindromeChecker.isPalindrome("RaDar"));
        assertTrue(PalindromeChecker.isPalindrome("Able was I ere I saw Elba"));
    }

    @Test
    public void testIsPalindromeFalse() {
        assertFalse(PalindromeChecker.isPalindrome("hello"));
        assertFalse(PalindromeChecker.isPalindrome("This is not a palindrome"));
    }
}
