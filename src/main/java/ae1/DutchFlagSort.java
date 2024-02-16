package ae1;

public class DutchFlagSort extends QuickSort {

	@Override
	public void sort(int low, int high) {
		if (low < high) {
			int[] pivotIndices = partitions(low, high);
			sort(low, pivotIndices[0] - 1);
			sort(pivotIndices[1] + 1, high);
		}
	}

	public int[] partitions(int low, int high) {
		int pivot = array[low];
		int smaller = low;
		int equal = low;
		int larger = high;

		while (equal <= larger) {
			if (array[equal] < pivot) {
				swap(smaller, equal);
				smaller++;
				equal++;
			} else if (array[equal] == pivot) {
				equal++;
			} else {
				swap(equal, larger);
				larger--;
			}
		}
		return new int[] { smaller, larger };
	}
}
