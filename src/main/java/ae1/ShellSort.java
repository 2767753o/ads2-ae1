package ae1;

public class ShellSort extends Sorter {

	public ShellSort() {
		super("ShellSort", new int[] {});
	}

	public void sort(int nan0, int nan1) {
		int n = array.length;
		for (int gap = n / 2; gap > 0; gap /= 2) {
			for (int i = gap; i < n; i++) {
				int temp = array[i];
				int j = i;
				while (j >= gap && array[j - gap] > temp) {
					array[j] = array[j - gap];
					j -= gap;
				}
				array[j] = temp;
			}
		}
	}

	public void sort() {
		sort(0, 0);
	}
}
