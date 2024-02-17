package ae1;

public class InsertionSort extends Sorter {

	public InsertionSort() {
		super("InsertionSort", new int[] {});
	}

	@Override
	public void sort(int lower, int upper) {
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

	@Override
	public void sort() {
		sort(0, array.length - 1);
	}
}
