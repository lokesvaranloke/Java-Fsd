package ExponentialSearch;

import java.util.Scanner;

public class expoSearch {

	public static void main(String[] args) {

		expoSearch es = new expoSearch();
		int[] arr = { 6, 12, 18, 24, 32 };
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter an element to search : ");
		int n = sc.nextInt();
		int res = es.expoSearch(arr, n);
		if (res < 0) {
			System.out.println("The given element is not found");
		} else {
			System.out.println("The element is found at position " + (res + 1));
		}
	}

	public int expoSearch(int[] a, int n) {
		if (a[0] == n) {
			return 0;
		}
		int i = 1;
		while (i < a.length && a[i] < n) {
			i = i * 2;
		}
		return binarySearch(a, i / 2, (Math.min(i, a.length - 1)), n);
	}

	public int binarySearch(int[] a, int l, int h, int n) {
		int low = 0, high = a.length, mid;

		while (low <= high) {
			mid = (low + high) / 2;
			if (a[mid] == n) {
				return mid;
			}
			if (n < a[mid]) {
				high = mid - 1;
			} else
				low = mid + 1;
		}
		return -1;
	}
}
