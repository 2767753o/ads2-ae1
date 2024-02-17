import org.junit.Test;

import ae1.QuickInsertionSort;

import static org.junit.Assert.assertArrayEquals;

public class QuickSortWithInsertionTest {
	public static int k = 3;

	@Test
	public void testEmptyArray() {
		int[] array = {};
		int[] expected = {};
		QuickInsertionSort qis = new QuickInsertionSort(k);
		qis.setArray(array);
		qis.sort(0, array.length - 1);
		assertArrayEquals(expected, array);
	}

	@Test
	public void testSortedArray() {
		int[] array = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		int[] expected = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		QuickInsertionSort qis = new QuickInsertionSort(k);
		qis.setArray(array);
		qis.sort(0, array.length - 1);
		assertArrayEquals(expected, array);
	}

	@Test
	public void testReverseSortedArray() {
		int[] array = { 10, 9, 8, 7, 6, 5, 4, 3, 2, 1 };
		int[] expected = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		QuickInsertionSort qis = new QuickInsertionSort(k);
		qis.setArray(array);
		qis.sort(0, array.length - 1);
		assertArrayEquals(expected, array);
	}

	@Test
	public void testRandomArray() {
		int[] array = { 3, 7, 1, 8, 5, 9, 2, 6, 4, 10 };
		int[] expected = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		QuickInsertionSort qis = new QuickInsertionSort(k);
		qis.setArray(array);
		qis.sort(0, array.length - 1);
		assertArrayEquals(expected, array);
	}

	@Test
	public void testArrayWithDuplicates() {
		int[] array = { 5, 2, 5, 1, 2, 3, 3, 4, 4, 1 };
		int[] expected = { 1, 1, 2, 2, 3, 3, 4, 4, 5, 5 };
		QuickInsertionSort qis = new QuickInsertionSort(k);
		qis.setArray(array);
		qis.sort(0, array.length - 1);
		assertArrayEquals(expected, array);
	}

	@Test
	public void testArraySlice() {
		int[] array = { 10, 5, 2, 5, 1, 2, 1 };
		int[] expected = { 10, 1, 2, 2, 5, 5, 1 };
		QuickInsertionSort qis = new QuickInsertionSort(k);
		qis.setArray(array);
		qis.sort(1, array.length - 2);
		assertArrayEquals(expected, array);
	}
}
