public class SearchSortedMatrix {

	public static void main(String[] args) {
		int arr[][] = { { 1, 2, 3, 4 }, { 5, 6, 7, 8 }, { 9, 10, 11, 12 } };
		search(arr, 3, 4, 9);

	}
	static void search(int arr[][], int M, int N, int key) {
		int i = 0, j = N - 1;
		while (i < M && j >= 0) {
			if (arr[i][j] == key) {
				System.out.println("row " + i + ", col " + j + " ele "
						+ arr[i][j]);
				break;
			} else if (arr[i][j] > key) {
				j--;
			} else
				i++;
		}
	}
}
