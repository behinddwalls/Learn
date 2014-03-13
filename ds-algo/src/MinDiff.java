import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class MinDiff {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = 10;
		int arr[] = new int[N];
		for (int i = 0; i < N; i++) {
			arr[i] = sc.nextInt();
		}
		System.out.println(minDiff(arr));
	}

	static List<Integer> minDiff(int in[]) {
		Arrays.sort(in);
		List<Integer> resList = new ArrayList<Integer>();
		int minDiff = Integer.MAX_VALUE;
		int size = in.length;
		int last = 0, j = 0;
		for (int i = 0; i < size; i++) {
			if (in[last] - in[i] < minDiff)
				j = last + 1;

			for (; j < size; j++) {
				int diff = in[j] - in[i];
				if (diff < minDiff) {
					minDiff = diff;
					resList.clear();
					resList.add(in[i]);
					resList.add(in[j]);

				} else if (diff == minDiff) {
					resList.add(in[i]);
					resList.add(in[j]);

				} else {
					last = j;
					break;
				}
			}
		}

		return resList;
	}

}
