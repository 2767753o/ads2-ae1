import org.junit.Test;
import static org.junit.Assert.assertArrayEquals;

import ae1.ArrayUtils;

public class ThreeWayQuickSortTest {

	@Test
	public void testEmptyArray() {
		int[] array = {};
		int[] expected = {};
		ArrayUtils.threeWayQuickSort(array, 0, array.length - 1);
		assertArrayEquals(expected, array);
	}

	@Test
	public void testSortedArray() {
		int[] array = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		int[] expected = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		ArrayUtils.threeWayQuickSort(array, 0, array.length - 1);
		assertArrayEquals(expected, array);
	}

	@Test
	public void testReverseSortedArray() {
		int[] array = { 10, 9, 8, 7, 6, 5, 4, 3, 2, 1 };
		int[] expected = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		ArrayUtils.threeWayQuickSort(array, 0, array.length - 1);
		assertArrayEquals(expected, array);
	}

	@Test
	public void testRandomArray() {
		int[] array = { 3, 7, 1, 8, 5, 9, 2, 6, 4, 10, 15, 12, 18, 11, 20 };
		int[] expected = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 15, 18, 20 };
		ArrayUtils.threeWayQuickSort(array, 0, array.length - 1);
		assertArrayEquals(expected, array);
	}

	@Test
	public void testArrayWithDuplicates() {
		int[] array = { 5, 2, 5, 1, 2, 3, 3, 4, 4, 1, 2, 2, 5, 5, 4 };
		int[] expected = { 1, 1, 2, 2, 2, 2, 3, 3, 4, 4, 4, 5, 5, 5, 5 };
		ArrayUtils.threeWayQuickSort(array, 0, array.length - 1);
		assertArrayEquals(expected, array);
	}
}