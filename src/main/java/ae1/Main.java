package ae1;

public class Main {
	public static void main(String[] args) {
		Sorter s;
		SortTester st;

		st = new SortTester();

		s = new QuickSort();
		st.setSorter(s);
		st.test();

		s = new QuickInsertionSort(4);
		st.setSorter(s);
		st.test();

		// s = new InsertionSort();
		// st.setSorter(s);
		// st.test();

		// s = new QuickInsertionSort(3);
		// st.setSorter(s);
		// st.test();

		// s = new QuickInsertionSort(2);
		// st.setSorter(s);
		// st.test();

		// s = new QuickInsertionSort(1);
		// st.setSorter(s);
		// st.test();

		s = new MergeSort();
		st.setSorter(s);
		st.test();

	}
}
