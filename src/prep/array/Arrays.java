package prep.array;

import java.util.Comparator;
import java.util.Stack;

public class Arrays {

	public static int findMin(int arr[], int low, int high) {
		if (high < low)
			return arr[0];
		if (high == low)
			return arr[low];

		int mid = (high + low) / 2;
		if (mid < high && arr[mid] > arr[mid + 1])
			return arr[mid + 1];
		if (mid > low && arr[mid - 1] > arr[mid])
			return arr[mid];

		if (arr[high] > arr[mid])
			return findMin(arr, low, mid - 1);

		return findMin(arr, mid + 1, high);
	}

	public int getHistogramArea(int hist[], int n) {
		Stack<Integer> stack = new Stack<Integer>();
		int maxArea = Integer.MIN_VALUE;
		int tp = 0;
		int topAraea = 0;
		int i = 0;

		while (i < n) {
			if (stack.isEmpty() || hist[stack.peek()] <= hist[i]) {
				stack.add(i++);
			} else {
				tp = stack.pop();
				topAraea = hist[tp]
						* (stack.isEmpty() ? i : i - stack.peek() - 1);
				if (maxArea < topAraea)
					maxArea = topAraea;
			}
		}
		while (!stack.isEmpty()) {
			tp = stack.pop();
			topAraea = hist[tp] * (stack.isEmpty() ? i : i - stack.peek() - 1);
			if (maxArea < topAraea)
				maxArea = topAraea;
		}
		return maxArea;
	}

	public void selectActiviti(Activiti[] activitis) {
		java.util.Arrays.sort(activitis, new Comparator<Activiti>() {
			@Override
			public int compare(Activiti o1, Activiti o2) {
				if (o1.finish < o2.finish)
					return -1;
				else
					return 1;
			}
		});
		int i = 0;
		System.out.println("Activiti " + i + ": " + activitis[i].start
				+ " -----" + activitis[i++].finish);
		while (i < activitis.length) {
			if (activitis[i - 1].finish < activitis[i].start) {
				System.out.println("Activiti " + i + ": " + activitis[i].start
						+ " -----" + activitis[i++].finish);
			}
		}
	}

	// TODO: DO IT USING binary Search
	public void findPeak(int arr[]) {
		for (int i = 0; i < arr.length; i++) {
			if (i == 0 && arr.length > 1 && arr[i] > arr[i + 1])
				System.out.println(arr[i]);
			else if (i == arr.length - 1 && arr.length > 1
					&& arr[i] > arr[i - 1])
				System.out.println(arr[i]);
			else if (i + 1 < arr.length && arr[i] > arr[i + 1]
					&& arr[i] > arr[i - 1]) {
				System.out.println(arr[i]);
			}
		}
	}
}
