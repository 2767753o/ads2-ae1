package ae1;

public interface SortingAlgorithm {

	void sort();
	
	void sort(int lower, int upper);

	String getName();

	void setArray(int[] array);
}
