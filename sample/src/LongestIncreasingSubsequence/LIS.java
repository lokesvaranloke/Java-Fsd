package LongestIncreasingSubsequence;

import java.util.ArrayList;
import java.util.Iterator;

public class LIS {
	public static void main(String[] args) {

		int arr[] = {10, 22, 9, 33, 21, 50, 41, 60};
		ArrayList<Integer> a = new ArrayList<Integer>();
		ArrayList<Integer> lis = new ArrayList<Integer>();
		int max;
		int count = 0;
		for (int i = 0; i < arr.length; i++) {
			max = Integer.MIN_VALUE;
			for (int j = i; j < arr.length; j++) {
				if (arr[j] > max) {
					a.add(arr[j]);
					max = arr[j];
				}
			}
			if (count < a.size()) {
				count = a.size();
				lis = new ArrayList<Integer>(a);
			}
			a.clear();
		}
		Iterator<Integer> i = lis.iterator();
		System.out.println("Length of LIS is " + count);
		System.out.println("The subsequence is");
		while (i.hasNext()) {
			System.out.print(i.next() + " ");
		}
	}
}