package ae1;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Common {

	public static int[] convertListToIntArray(List<Integer> list) {
		int[] array = new int[list.size()];
		for (int i = 0; i < list.size(); i++) {
			array[i] = list.get(i);
		}
		return array;
	}

	public static int[] readIntegersFromFile(String filename) throws IOException {
		List<Integer> integers = new ArrayList<>();

		try (BufferedReader reader = new BufferedReader(new FileReader(filename))) {
			String line;
			while ((line = reader.readLine()) != null) {
				integers.add(Integer.parseInt(line.trim()));
			}
		}

		return convertListToIntArray(integers);
	}

	public static int[] findILargestInArray(int[] xs, int i) {
		int[] ys = new int[i];
		MergeSort ms = new MergeSort();

		if (i >= xs.length) {
			return new int[] {};
		}

		ms.setArray(xs.clone());
		ms.sort();
		int[] sorted = ms.getArray();

		for (int j = 0; j < i; j++) {
			ys[j] = sorted[xs.length - j - 1];
		}

		return ys;
	}
}
