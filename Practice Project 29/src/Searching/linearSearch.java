package Searching;

import java.util.Scanner;

public class linearSearch {

	public static void main(String[] args) {

		linearSearch ls = new linearSearch();
		int[] arr = { 10, 20, 30, 40, 50 };
		Scanner sc = new Scanner(System.in);
		int n;
		System.out.println("Enter an element to search : ");
		n = sc.nextInt();
		int res = ls.linSearch(arr, n);
		if (res == -1) {
			System.out.println("The given element is not found");
		} else {
			System.out.println("The given element is found at position : " + (res + 1));
		}
	}

	public int linSearch(int[] a, int n) {
		for (int i = 0; i < a.length; i++) {
			if (a[i] == n) {
				return i;
			}
		}
		return -1;
	}
}
