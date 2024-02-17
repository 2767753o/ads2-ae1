package ae1;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Main {
	public static void main(String[] args) {
		String resources = "/home/john/Documents/ADS2/ads2-ae1/src/main/resources/";
		String[] filenames = {
				"bad.txt",
				"dutch.txt",
				"int1000.txt",
				"int20k.txt",
				"int500k.txt",
				"intBig.txt",
		};
		List<SortingAlgorithm> sortTypes = new ArrayList<>();
		int n = 10;
		int k = 3;
		int[] array = {};

		sortTypes.add(new QuickSort());
		sortTypes.add(new DutchFlagSort());
		sortTypes.add(new QuickInsertionSort(k));

		for (String filename : filenames) {
			try {
				String fullPath = resources + filename;
				array = Common.readIntegersFromFile(fullPath);
			} catch (IOException e) {
				e.printStackTrace();
				System.err.println("unable to open file: " + filename);
				System.exit(1);
			}

			System.out.println("--------------------------------------------------\n");
			System.out.printf("File: %s - Items: %d\n", filename, array.length);
			for (SortingAlgorithm s : sortTypes) {
				long timeTotal = 0;
				System.out.printf("  %s\n", s.getName());
				for (int i = 0; i < n; i++) {
					s.setArray(array.clone());

					long time1 = System.currentTimeMillis();
					s.sort();
					long time2 = System.currentTimeMillis();
					long timeDifference = time2 - time1;
					timeTotal += timeDifference;

					System.out.printf("\t%d: %d milliseconds\n", i, timeDifference);
				}
				long timeAverage = timeTotal / n;
				System.out.printf("\tAverage time: %d milliseconds\n\n", timeAverage);
			}
		}
	}
}
