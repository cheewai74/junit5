package Junit5tests;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class AssertionsTest {

    @Test
    void assertEqualsTest(){
        assertEquals("firstString", "secondString", "The string value is not match");
    }

    @Test
    void assertEqualsListTest(){
        List<String> expectedValues = Arrays.asList("firstString","secondString","thirdString");
        List<String> actualValues = Arrays.asList("firstString","secondString","thirdString");
        assertEquals(expectedValues,actualValues);
        assertNotEquals(expectedValues,actualValues);
    }

    @Test
    void assertArrayEqualTest(){
        int[] expectedValues = {1,5,3};
        int[] actualValues={1,2,3};
        assertArrayEquals(expectedValues,actualValues);
    }

    @Test
    void assertTrueTest(){
        assertFalse(false);
        assertTrue(false,"This boolean condition did not evaluate to true");
    }

    @Test
    void assertThrowsTest(){
        assertThrows(NullPointerException.class,null);
    }

    @Test
    void assertAllTest(){
        assertAll(
                () -> assertEquals("firstString", "secondString", "The string value is not match"),
                () -> assertThrows(NullPointerException.class, null),
                ()-> assertTrue(false,"This boolean condition did not evaluate to true")
        );
    }
}
