package ae1;

public class QuickInsertionSort extends QuickSort {
	private int k;

	public QuickInsertionSort(int k) {
		this.name = "QuickInsertionSort";
		this.k = k;
	}

	public void setK(int k) {
		this.k = k;
	}

	@Override
	public void sort(int lower, int upper) {
		if (lower < upper) {
			if (upper - lower > k) {
				int pivot = partition(lower, upper);
				sort(lower, pivot - 1);
				sort(pivot + 1, upper);
			} else {
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
		}
	}
}
