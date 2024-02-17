package ae1;

public class QuickSort extends Sorter {

	public QuickSort() {
		super("QuickSort", new int[] {});
	}

	public void swap(int i, int j) {
		int tmp = array[i];
		array[i] = array[j];
		array[j] = tmp;
	}

	protected int partition(int lower, int upper) {
		int pivot = array[upper];
		int i = lower - 1;

		for (int j = lower; j < upper; j++) {
			if (array[j] < pivot) {
				i++;
				swap(i, j);
			}
		}
		swap(i + 1, upper); // Set pivot in correct place.

		return i + 1;
	}

	@Override
	public void sort(int lower, int upper) {
		if (lower < upper) {
			int pivot = partition(lower, upper);
			sort(lower, pivot - 1);
			sort(pivot + 1, upper);
		}
	}

	@Override
	public void sort() {
		sort(0, array.length - 1);
	}
}
