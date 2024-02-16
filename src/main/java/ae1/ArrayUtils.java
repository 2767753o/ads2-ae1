package ae1;

public class ArrayUtils {
	public static void swap(int[] array, int a, int b) {
		int x = array[a];
		array[a] = array[b];
		array[b] = x;
	}

	public static int partition(int[] array, int lower, int upper) {
		int pivot = array[upper];
		int i = lower - 1;

		for (int j = lower; j <= upper - 1; j++) {
			if (array[j] < pivot) {
				i++;
				swap(array, i, j);
			}
		}
		swap(array, i + 1, upper);

		return i + 1;
	}

	public static void qsort(int[] array, int lower, int upper) {
		int pivot;

		if (lower < upper) {
			pivot = partition(array, lower, upper);
			qsort(array, lower, pivot - 1);
			qsort(array, pivot + 1, upper);
		}
	}
}
