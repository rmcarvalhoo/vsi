package br.com.vsibrasil;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertFalse;

public class VSValidationTest {

    @Test
    void testContainsOnlyLettersRegex_ValidInput() {
        assertTrue(VSValidation.containsOnlyLettersRegex("abc"));
        assertTrue(VSValidation.containsOnlyLettersRegex("XYZ"));
    }

    @Test
    void testContainsOnlyLettersRegex_InvalidInput() {
        assertFalse(VSValidation.containsOnlyLettersRegex("abc123"));
        assertFalse(VSValidation.containsOnlyLettersRegex("a!b@c"));
        assertFalse(VSValidation.containsOnlyLettersRegex(" "));
        assertFalse(VSValidation.containsOnlyLettersRegex(""));
    }

}
