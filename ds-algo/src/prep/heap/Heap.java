package prep.heap;

import java.util.Arrays;

public class Heap {
	private int arr[] = null;
	private int heapSize = 0;
	boolean isMin = true;

	public Heap(int heapSize, boolean isMin) {
		arr = new int[heapSize];
		this.heapSize = heapSize;
		this.isMin = isMin;
	}

	void buildHeap(int in[]) {
		if (heapSize != 0) {
			int i = (heapSize - 1) / 2;
			while (i-- > 0) {
				heapify(i);
			}
		}
	}

	public int[] heapSort(int in[]) {
		arr = Arrays.copyOf(in, heapSize);
		int i, temp;
		buildHeap(arr);
		for (i = heapSize - 1; i > 0; i--) {
			temp = arr[i];
			arr[i] = arr[0];
			arr[0] = temp;
			heapSize = heapSize - 1;
			heapify(0);
		}
		return arr;
	}

	void heapify(int i) {
		int left = left(i);
		int right = right(i);
		int index = i;
		if (isMin) {
			if (left < heapSize && arr[left] < arr[index]) {
				index = left;
			}
			if (right < heapSize && arr[right] < arr[index]) {
				index = right;
			}
		} else {
			if (left < heapSize && arr[left] > arr[index]) {
				index = left;
			}
			if (right < heapSize && arr[right] > arr[index]) {
				index = right;
			}
		}
		if (index != i) {
			swap(i, index);
			heapify(index);
		}
	}

	int left(int i) { 
		return 2 * i ;
	}

	int right(int i) {
		return 2 * i + 1;
	}

	int parent(int i) {
		return (i - 1) / 2;
	}

	void swap(int x, int y) {
		int temp = arr[x];
		arr[x] = arr[y];
		arr[y] = temp;
	}

}
