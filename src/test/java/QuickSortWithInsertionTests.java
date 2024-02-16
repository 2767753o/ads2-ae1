import org.junit.Test;
import static org.junit.Assert.assertArrayEquals;

import ae1.ArrayUtils;

public class QuickSortWithInsertionTests {
	public static int k = 4;

	@Test
	public void testEmptyArray() {
		int[] array = {};
		int[] expected = {};
		ArrayUtils.quickSortWithInsertion(array, 0, array.length - 1, k);
		assertArrayEquals(expected, array);
	}

	@Test
	public void testSortedArray() {
		int[] array = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		int[] expected = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		ArrayUtils.quickSortWithInsertion(array, 0, array.length - 1, k);
		assertArrayEquals(expected, array);
	}

	@Test
	public void testReverseSortedArray() {
		int[] array = { 10, 9, 8, 7, 6, 5, 4, 3, 2, 1 };
		int[] expected = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		ArrayUtils.quickSortWithInsertion(array, 0, array.length - 1, k);
		assertArrayEquals(expected, array);
	}

	@Test
	public void testRandomArray() {
		int[] array = { 3, 7, 1, 8, 5, 9, 2, 6, 4, 10 };
		int[] expected = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		ArrayUtils.quickSortWithInsertion(array, 0, array.length - 1, k);
		assertArrayEquals(expected, array);
	}

	@Test
	public void testArrayWithDuplicates() {
		int[] array = { 5, 2, 5, 1, 2, 3, 3, 4, 4, 1 };
		int[] expected = { 1, 1, 2, 2, 3, 3, 4, 4, 5, 5 };
		ArrayUtils.quickSortWithInsertion(array, 0, array.length - 1, k);
		assertArrayEquals(expected, array);
	}
}
