package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class KeyWordTest {

    @Test
    void containsKeyword_emptyString_returnsFalse() {
        // this is the same: assertEquals(false, Keyword.containsKeyword(""));
        assertFalse(Keyword.containsKeyword(""));
    }

    @Test
    void containsKeyword_null_returnsFalse() {
        assertFalse(Keyword.containsKeyword(null));
    }

    @Test
    void containsKeyword_String_returnsFalse() {
        assertFalse(Keyword.containsKeyword("No reserved keywords here my friend"));
        assertFalse(Keyword.containsKeyword("I love to breakdance"));
    }

    @Test
    void containsReservedKeyword_String_returnsTrue() {
        assertTrue(Keyword.containsKeyword("Don't break my heart"));
    }

    @Test
    void containsKeyword_findsFirstWord_returnsTrue() {
        // this is the same: assertEquals(true, Keyword.containsKeyword("abstract methods are funny"));
        assertTrue(Keyword.containsKeyword("abstract methods are funny"));
        assertTrue(Keyword.containsKeyword(" methods are funny abstract"));
    }

    @Test
    void containsKeyword_findsLastWord_returnsTrue() {
        assertTrue(Keyword.containsKeyword("while I wait..."));
        assertTrue(Keyword.containsKeyword("I wait...while"));
    }

    @Test
    void containsKeyword_lowerCaseUpperCase_returnsTrue() {
        assertTrue(Keyword.containsKeyword("While I wait..."));
        assertTrue(Keyword.containsKeyword("I wait...ABStract"));
    }
}
