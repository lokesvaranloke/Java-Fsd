package BinarySearch;

import java.util.Scanner;

public class binarySearch {

	public static void main(String[] args) {
		
		binarySearch bs = new binarySearch();
		int[] arr = {3,6,9,12,15};
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter an element to search : ");
		int n = sc.nextInt();
		int res = bs.binSearch(arr, n);
		if(res==-1) {
			System.out.println("The given element is not found");
		} else {
		System.out.println("The given element is found at position "+(res+1));
		}
	}
	
	public int binSearch(int[] a, int n) {
		int low = 0, high = a.length, mid;
		
		while(low<=high) {
			mid = (low+high)/2;
			if(a[mid]==n) {
				return mid;
			} 
			if(n<a[mid]) {
				high=mid-1;
			} else 
				low = mid+1;
		}
		return -1;
	}
}
