package ae1;

public class SelectionSort extends Sorter {

	public SelectionSort() {
		super("SelectionSort", new int[] {});
	}

	@Override
	public void sort(int lower, int upper) {
		int n = array.length;
		for (int i = 0; i < n - 1; i++) {
			int minIndex = i;
			for (int j = i + 1; j < n; j++) {
				if (array[j] < array[minIndex]) {
					minIndex = j;
				}
			}
			if (minIndex != i) {
				int temp = array[i];
				array[i] = array[minIndex];
				array[minIndex] = temp;
			}
		}
	}

	public void sort() {
		sort(0, 0);
	}
}
