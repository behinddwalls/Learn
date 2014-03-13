package hacker;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Set;

public class MissingNumber {
	public static void main(String[] args) throws NumberFormatException,
			IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n1 = Integer.parseInt(br.readLine());
		String arr1[] = br.readLine().split(" ");
		int n2 = Integer.parseInt(br.readLine());
		String arr2[] = br.readLine().split(" ");
		int in1[] = new int[n1];
		int in2[] = new int[n2];
		for (int i = 0; i < n1; i++) {
			in1[i] = Integer.parseInt(arr1[i]);
		}
		for (int i = 0; i < n2; i++) {
			in2[i] = Integer.parseInt(arr2[i]);
		}
		findMissing(in1, in2);

	}

	static void findMissing(int arr1[], int arr2[]) {
		Arrays.sort(arr1);
		Arrays.sort(arr2);
		int l1 = arr1.length;
		int l2 = arr2.length;
		Set<Integer> res = new LinkedHashSet<Integer>();
		int i, j;
		for (i = 0, j = 0; i < l1 && j < l2;) {
			if (arr1[i] == arr2[j]) {
				i++;
				j++;
			} else {
				res.add(arr2[j]);
				j++;
			}
		}
		if (i == l1 && j != l2) {
			for (int k = j; k < l2; k++)
				res.add(arr2[k]);
		}
		Object[] resArr = res.toArray();
		Arrays.sort(resArr);
		for (Object o : resArr)
			System.out.print(o + " ");
	}
}
