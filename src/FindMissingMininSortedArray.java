public class FindMissingMininSortedArray {
	public static void main(String[] args) {
		int arr[] = { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 12 };
		findMissing(arr);

	}

	static void findMissing(int arr[]) {
		int low = 0, high = arr.length;
		int mid = 0;
		while (low < high) {
			mid = (high + low) / 2;
			if (low != arr[low]) {
				System.out.println(low);
				break;
			}
			if (arr[mid] > mid) {
				high = mid;
			} else {
				low = mid + 1;
			}

		}
		System.out.println(high);

	}
}
