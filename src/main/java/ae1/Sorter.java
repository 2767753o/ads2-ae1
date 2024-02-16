package ae1;

import java.io.IOException;

public abstract class Sorter implements SortingAlgorithm {
	protected String name;
	protected int[] array;

	public Sorter(String name, int[] array) {
		this.name = name;
		this.array = array;
	}

	public void setArray(int[] array) {
		this.array = array;
	}

	public int[] getArray() {
		return array;
	}

	public String getName() {
		return name;
	}

	public void setArrayFromFile(String filename) {
		try {
			array = Common.readIntegersFromFile(filename);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	protected void setName(String name) {
		this.name = name;
	}
}
