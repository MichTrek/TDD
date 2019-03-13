import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PalindromeTest {
    Palindrome palindrome = new Palindrome();
    @Test
    public void testIfCheckPalindromeReturnsTrue(){
        assertTrue(palindrome.checkPalindromeTrue());
        
    }

    @Test
    public void testIfCheckPalindromeReturnsFalse(){
        assertFalse(palindrome.checkPalindromeFalse());
    }

}