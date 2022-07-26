package Arrays;

import java.util.Scanner;

public class sumEleRange {

	public static void main(String[] args) {
		
		sumEleRange s = new sumEleRange();
		int[] arr = new int[] {3, 7, 2, 5, 8, 9};
		int l,r;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter L range :");
		l = sc.nextInt();
		System.out.println("Enter R range :");
		r = sc.nextInt();
		System.out.println("The sum of ele between "+l+" and "+r+" is "+ (s.sum(arr,l,r)));
	}
	
	public int sum(int[] a,int l, int r) {
		int sum=0;
		for(int i=l;i<=r;i++) {
			sum = sum+a[i];
		}
		return sum;
	}
}
