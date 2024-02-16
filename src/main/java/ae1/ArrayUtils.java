package ae1;

public class ArrayUtils {
	private static void swap(int[] array, int i, int j) {
		int tmp = array[i];
		array[i] = array[j];
		array[j] = tmp;
	}

	private static int partition(int[] array, int lower, int upper) {
		int pivot = array[upper];
		int i = lower - 1;

		for (int j = lower; j < upper; j++) {
			if (array[j] < pivot) {
				i++;
				swap(array, i, j);
			}
		}
		swap(array, i + 1, upper); // Set pivot in correct place.

		return i + 1;
	}

	private static int[] dfPartition(int[] array, int low, int high) {
		int pivot = array[low];
		int smaller = low;
        int equal = low;
        int larger = high;

        while (equal <= larger) {
            if (array[equal] < pivot) {
                swap(array, smaller, equal);
                smaller++;
                equal++;
            } else if (array[equal] == pivot) {
                equal++;
            } else {
                swap(array, equal, larger);
                larger--;
            }
        }
        return new int[]{smaller, larger};
	}

	public static void quickSort(int[] array, int lower, int upper) {
		if (lower < upper) {
			int pivot = partition(array, lower, upper);
			quickSort(array, lower, pivot - 1);
			quickSort(array, pivot + 1, upper);
		}
	}

	public static void insertionSort(int[] array, int lower, int upper) {
		for (int i = lower + 1; i <= upper; i++) {
			int key = array[i];
			int j = i - 1;
			while (j >= lower && array[j] > key) {
				array[j + 1] = array[j];
				j--;
			}
			array[j + 1] = key;
		}
	}

	public static void quickSortWithInsertion(int[] array, int lower, int upper, int k) {
		if (lower < upper) {
			if (upper - lower > k) {
				int pivot = partition(array, lower, upper);
				quickSortWithInsertion(array, lower, pivot - 1, k);
				quickSortWithInsertion(array, pivot + 1, upper, k);
			} else {
				insertionSort(array, lower, upper);
			}
		}
	}

	public static void threeWayQuickSort(int[] array, int low, int high) {
        if (low < high) {
            int[] pivotIndices = dfPartition(array, low, high);
            threeWayQuickSort(array, low, pivotIndices[0] - 1);
            threeWayQuickSort(array, pivotIndices[1] + 1, high);
        }
    }
}
