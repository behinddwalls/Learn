package prep.strings;

import java.util.Arrays;

public class StringUtils {

	public void permutateRandomly(char str[], int i, int n) {
		if (i == n) {
			for (int k = 0; k < n; k++)
				System.out.print(str[k]);
			System.out.println();
		} else {
			for (int j = i; j < n; j++) {
				swap(str, i, j);
				permutateRandomly(str, i + 1, n);
				swap(str, i, j);
			}
		}
	}

	public void permute(String str, boolean isLexicographic) {
		if (isLexicographic) {
			permutateLexicographically(str.toCharArray(), str.length());
		} else {
			permutateRandomly(str.toCharArray(), 0, str.length());
		}
	}

	public void permutateLexicographically(char str[], int n) {
		Arrays.sort(str);
		boolean isFinished = false;
		int second, first;
		while (!isFinished) {
			System.out.println(str);
			for (first = n - 2; first >= 0; --first) {
				if (str[first] < str[first + 1])
					break;
			}
			if (first == -1)
				isFinished = true;
			else {
				second = findCeilLinearly(str, str[first], first + 1, n);
				swap(str, first, second);
				Arrays.sort(str, first + 1, n);
			}
		}
	}

	public int findCeilLinearly(char str[], int first, int i, int n) {
		int index = i;
		for (int j = i; j < n; j++) {
			if (str[j] > first && str[j] < str[index]) {
				index = j;
			}
		}
		return index;
	}

	void swap(char str[], int i, int j) {
		char ch = str[i];
		str[i] = str[j];
		str[j] = ch;
	}
}
