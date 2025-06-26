package br.com.vsibrasil;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.util.*;

public class MainTest {

    @Test
    void testGeneratePermutations_SimpleCase() {
        List<String> expected = Arrays.asList("ab", "ba");
        List<String> actual = Main.generatePermutations("ab");
        assertEquals(new HashSet<>(expected), new HashSet<>(actual));
    }

    @Test
    void testGeneratePermutations_ThreeLetters() {
        List<String> actual = Main.generatePermutations("abc");
        assertEquals(6, actual.size());
        assertTrue(actual.contains("abc"));
        assertTrue(actual.contains("acb"));
        assertTrue(actual.contains("bac"));
        assertTrue(actual.contains("bca"));
        assertTrue(actual.contains("cab"));
        assertTrue(actual.contains("cba"));
    }

    @Test
    void testGeneratePermutations_SingleLetter() {
        List<String> actual = Main.generatePermutations("a");
        assertEquals(Arrays.asList("a"), actual);
    }

    @Test
    void testGeneratePermutations_EmptyString() {
        assertThrows(RuntimeException.class,  () ->  Main.generatePermutations(""));
    }

    @Test
    void testGeneratePermutations_DataWithNumber() {
        assertThrows(RuntimeException.class,  () ->  Main.generatePermutations("A1"));
    }

    @Test
    void testGeneratePermutations_DataWithSpace() {
        assertThrows(RuntimeException.class,  () ->  Main.generatePermutations("A B"));
    }

}
