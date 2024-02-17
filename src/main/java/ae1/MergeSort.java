package ae1;

public class MergeSort extends Sorter {

	public MergeSort() {
		super("MergeSort", new int[]{});
	}
	
	public void merge(int left, int mid, int right) {
        int n1 = mid - left + 1;
        int n2 = right - mid;

        int[] L = new int[n1];
        int[] R = new int[n2];

        System.arraycopy(array, left, L, 0, n1);
        System.arraycopy(array, mid + 1, R, 0, n2);

        int i = 0, j = 0, k = left;

        while (i < n1 && j < n2) {
            array[k++] = (L[i] <= R[j]) ? L[i++] : R[j++];
        }

        while (i < n1) {
            array[k++] = L[i++];
        }

        while (j < n2) {
            array[k++] = R[j++];
        }
    }

	public void sort(int left, int right) {
		if (left < right) {
			int mid = left + (right - left) / 2;
			sort(left, mid);
			sort(mid + 1, right);
			merge(left, mid, right);
		}
	}

	@Override
	public void sort() {
		sort(0, array.length - 1);
	}
}
