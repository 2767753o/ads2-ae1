import org.junit.Test;

import ae1.ArrayUtils;

import static org.junit.Assert.assertArrayEquals;

public class ArrayUtilsTests {
	@Test
    public void testEmptyArray() {
        int[] array = {};
        int[] expected = {};
        ArrayUtils.qsort(array, 0, array.length - 1);
        assertArrayEquals(expected, array);
    }

    @Test
    public void testSortedArray() {
        int[] array = {1, 2, 3, 4, 5};
        int[] expected = {1, 2, 3, 4, 5};
        ArrayUtils.qsort(array, 0, array.length - 1);
        assertArrayEquals(expected, array);
    }

    @Test
    public void testReverseSortedArray() {
        int[] array = {5, 4, 3, 2, 1};
        int[] expected = {1, 2, 3, 4, 5};
        ArrayUtils.qsort(array, 0, array.length - 1);
        assertArrayEquals(expected, array);
    }

    @Test
    public void testRandomArray() {
        int[] array = {3, 7, 1, 8, 5};
        int[] expected = {1, 3, 5, 7, 8};
        ArrayUtils.qsort(array, 0, array.length - 1);
        assertArrayEquals(expected, array);
    }

    @Test
    public void testArrayWithDuplicates() {
        int[] array = {5, 2, 5, 1, 2};
        int[] expected = {1, 2, 2, 5, 5};
        ArrayUtils.qsort(array, 0, array.length - 1);
        assertArrayEquals(expected, array);
    }
}
