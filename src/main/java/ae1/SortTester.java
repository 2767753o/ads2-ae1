package ae1;

public class SortTester {
	long total = 0;
	int n = 10;
	String[] filenames = {
			"/home/john/Documents/ADS2/ads2-ae1/src/main/resources/Bad.txt",
			"/home/john/Documents/ADS2/ads2-ae1/src/main/resources/int1000.txt",
			"/home/john/Documents/ADS2/ads2-ae1/src/main/resources/dutch.txt",
			"/home/john/Documents/ADS2/ads2-ae1/src/main/resources/int20k.txt",
			"/home/john/Documents/ADS2/ads2-ae1/src/main/resources/int500k.txt",
			"/home/john/Documents/ADS2/ads2-ae1/src/main/resources/intBig.txt",
	};
	private Sorter s;

	public SortTester() {
		this.s = new QuickSort();
	}

	public Sorter getSorter() {
		return s;
	}

	public void setSorter(Sorter s) {
		this.s = s;
	}

	public long timeSort(boolean verbose) {
		long startTime = System.nanoTime();
		s.sort(0, s.getArray().length - 1);
		long endTime = System.nanoTime();
		long elapsedTime = endTime - startTime;

		if (verbose) {
			System.out.println("-----------------------------------------------------");
			System.out.println("Array size: " + s.getArray().length);
			System.out.printf("Execution time: %.4f s%n", elapsedTime / 1E9);
			System.out.println("Sorted correctly: " + isSorted());
			System.out.println();
		}

		return elapsedTime;
	}

	public void test() {
		for (String file : filenames) {
			System.out.println("Sorting algorithm: " + s.getName());
			System.out.println(file);
			for (int i = 0; i < n; i++) {
				s.setArrayFromFile(file);
				total += timeSort(false);
			}
			float avg = total / n;
			float avgTimePerItem = avg / s.getArray().length;
			System.out.printf("Average execution time: %.4f s%n\n", avg / 1E9);
			System.out.printf("Average execution time per item: %.4f s%n\n nanoseconds", avgTimePerItem);
		}
	}

	private boolean isSorted() {
		int[] array = s.getArray();
		int n = array.length;
		for (int i = 0; i < n - 1; i++) {
			if (array[i] > array[i + 1]) {
				return false;
			}
		}
		return true;
	}

}
