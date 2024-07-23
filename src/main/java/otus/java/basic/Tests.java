package otus.java.basic;

import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.fail;

public class Tests {
    @Test
    void testGetElementsAfterLastOne() {
        int[] array = {1, 2, 1, 2, 2};
        int[] expectedResult = {2, 2};

        assertArrayEquals(expectedResult, ArrayUtils.getElementsAfterLastOne(array));
    }

    @Test
    void testNoOnesInArray() {
        int[] array = {2, 2, 2, 2};

        try {
            ArrayUtils.getElementsAfterLastOne(array);
            fail("Expected RuntimeException");
        } catch (RuntimeException e) {
        }
    }

    @Test
    void testIsArrayConsistsOnlyOfOnesAndTwosTrue() {
        int[] array = {1, 2};

        assertTrue(ArrayUtils.isArrayConsistsOnlyOfOnesAndTwos(array));
    }

    @Test
    void testIsArrayConsistsOnlyOfOnesAndTwosFalse() {
        int[] array = {1, 1};

        assertFalse(ArrayUtils.isArrayConsistsOnlyOfOnesAndTwos(array));
    }

    @Test
    void testIsArrayConsistsOnlyOfOnesAndTwosFalseWithOtherNumbers() {
        int[] array = {1, 2, 3};

        assertFalse(ArrayUtils.isArrayConsistsOnlyOfOnesAndTwos(array));
    }
}