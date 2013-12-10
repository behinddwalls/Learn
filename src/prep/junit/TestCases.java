package prep.junit;

import static org.junit.Assert.*;

import org.junit.Test;

import prep.array.Arrays;
import prep.heap.Heap;

public class TestCases {

	int heapSize = 8;
	boolean isMin = false;
	Heap heap = new Heap(heapSize, isMin);
	int sortedAndRotated[] = { 2, 3, 4, 9, 10, 23, -2, 1 };

	@Test
	public void testHeap() {
		int arr[] = { 2, 3, 4, 9, 90, 10, 23, 78 };
		int expected[] = { 2, 3, 4, 9, 10, 23, 78, 90 };
		int res[] = heap.heapSort(arr);
		for (int i = 0; i < heapSize; i++) {
			if (res[i] != expected[i])
				fail("Failed");
		}
	}

	@Test
	public void testFindMininSortedArray() {
		System.out.println(Arrays.findMin(sortedAndRotated, 0,
				sortedAndRotated.length - 1));
	}

}
