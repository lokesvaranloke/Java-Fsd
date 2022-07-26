package arrays;

import java.util.Scanner;

public class ksmall {

	public static void main(String[] args) {

		ksmall ks = new ksmall();
		int[] arr = new int[] { 12, 3, 5, 7, 4, 19, 26 };

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter k ");
		int k = sc.nextInt();

		ks.findsmall(arr, k);
		//System.out.println("The kth smallest element is " + ele);
	}

	public void findsmall(int[] a, int k) {
	
		for (int i = 0; i < a.length; i++) {
			
			for (int j = i + 1; j < a.length; j++) {
				
				if (a[i] > a[j]) {
					
					int temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}

			}
		}
		System.out.println("Sorted array");
		for(int i=0;i<a.length;i++) {
			System.out.print(a[i]+" ");
		}
		System.out.println();
		System.out.println("The kth smallest element is "+a[k-1]);
	}
}
