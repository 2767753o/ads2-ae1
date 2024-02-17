import org.junit.Test;

import ae1.Common;

import static org.junit.Assert.assertArrayEquals;

public class findILargestInArrayTest {
	@Test
	public void testEmptyArray() {
		int[] array = {};
		int[] expected = {};
		int[] actual = Common.findILargestInArray(array, 5);
		assertArrayEquals(expected, actual);
	}

	@Test
	public void testArray() {
		int[] array = { 1, 5, 8, 2, 4, 2 };
		int[] expected = { 8, 5, 4 };
		int i = 3;
		int[] actual = Common.findILargestInArray(array, i);
		assertArrayEquals(expected, actual);
	}
}
